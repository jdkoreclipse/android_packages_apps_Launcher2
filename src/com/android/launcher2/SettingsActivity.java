package com.android.launcher2;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.android.launcher.R;

public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.addPreferencesFromResource(R.xml.settings);
    }
}
