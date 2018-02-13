package com.mortezaafshari.alfia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ACTIVITY_LoginMain extends AppCompatActivity {

    // Create Objects from Which Created in Layout .xml file
    Button BUTTON_SignIn;
    Button BUTTON_SignUp;
    TextView TEXTVIEW_EnterAsGuest;
    Toolbar TOOLBAR_LoginMain;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_loginmain);

        // Link Activity Objects To Layout Ones:
        BUTTON_SignIn = (Button) findViewById(R.id.BUTTON_SignIn);
        BUTTON_SignUp = (Button) findViewById(R.id.BUTTON_SignUp);
        TEXTVIEW_EnterAsGuest = (TextView) findViewById(R.id.TEXTVIEW_EnterAsGuest);
        TOOLBAR_LoginMain = (Toolbar) findViewById(R.id.TOOLBAR_LoginMain);

        // Create On Click Functions
        View.OnClickListener doButton_SignIn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToSignIn = new Intent(ACTIVITY_LoginMain.this, ACTIVITY_LoginSignIn.class);
                startActivity(GoToSignIn);
            }
        };
        View.OnClickListener doButton_SignUp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToSignUp = new Intent(ACTIVITY_LoginMain.this, ACTIVITY_LoginSignUp.class);
                startActivity(GoToSignUp);
            }
        };
        View.OnClickListener doTextView_EnterAsGuest = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToMain = new Intent(ACTIVITY_LoginMain.this, ACTIVITY_Main.class);
                startActivity(GoToMain);
            }
        };

        // Set Functions To Specific Buttons
        BUTTON_SignIn.setOnClickListener(doButton_SignIn);
        BUTTON_SignUp.setOnClickListener(doButton_SignUp);
        TEXTVIEW_EnterAsGuest.setOnClickListener(doTextView_EnterAsGuest);

        // Use Toolbar
        setSupportActionBar(TOOLBAR_LoginMain);
    }
}
