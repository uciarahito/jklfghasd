package mobile.trimagnus.trackingmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.valueField)
    EditText mValueField;
    @BindView(R.id.addButton)
    Button mAddButton;

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootRef = new Firebase("https://apt-sky-153410.firebaseio.com/");

        ButterKnife.bind(this);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mValueField.getText().toString();
                Firebase childRef = mRootRef.child("Name");
                childRef.setValue(value);
            }
        });
    }
}
