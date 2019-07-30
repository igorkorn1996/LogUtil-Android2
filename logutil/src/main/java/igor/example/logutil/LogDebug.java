package igor.example.logutil;

import android.nfc.Tag;
import android.util.Log;

public class LogDebug {

    private static final String TAG = "Super app";
    public static void d(String message){
        Log.d(TAG, message);
    }
}
