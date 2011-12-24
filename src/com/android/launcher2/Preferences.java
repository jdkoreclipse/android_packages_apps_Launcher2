package com.android.launcher2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {

    private static Preferences _Current = null;

    public static Preferences getInstance() {
        if (_Current == null)
            _Current = new Preferences();
        return _Current;
    }

    private SharedPreferences mPreferences = null;

    public void setContext(Context context) {
        if (context == null && mPreferences != null) {
            mPreferences = null;
        } else if (context != null) {
            mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    static final String AUTO_ROTATE_LAUNCHER = "auto_rotate_launcher";
    
    public boolean getOrientate() {
        return mPreferences.getBoolean(AUTO_ROTATE_LAUNCHER, true);
    }
}
