package com.example.greetingcard.labquizfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);


        TextView usernameHolder = (TextView)findViewById(R.id.usernameText);
        String user = preferences.getString("username", "").toString();
        usernameHolder.setText(user);
    }

    public void logout(View view){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("username", "");
        editor.putString("password", "");
        editor.apply();
        finish();
    }
}
