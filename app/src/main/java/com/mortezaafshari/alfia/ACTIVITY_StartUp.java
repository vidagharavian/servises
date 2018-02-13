package com.mortezaafshari.alfia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ACTIVITY_StartUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_startup);
        Intent GoToLogin = new Intent(ACTIVITY_StartUp.this, ACTIVITY_LoginMain.class);
        startActivity(GoToLogin);
    }
}
