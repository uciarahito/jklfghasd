package mobile.trimagnus.trackingmobile;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by ArahitoPC on 1/16/2017.
 */

public class FireApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
