package com.mortezaafshari.alfia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ACTIVITY_Main extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent GoToLoginMain = new Intent(ACTIVITY_Main.this, ACTIVITY_LoginMain.class);
        startActivity(GoToLoginMain);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }
}
