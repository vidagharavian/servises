package com.mortezaafshari.alfia;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ACTIVITY_LoginSignIn extends AppCompatActivity {

    // Create Objects from Which Created in Layout .xml file
    TextInputLayout SUPPORT_SignInEmail;
    EditText EDITTEXT_SignInEmail;
    TextInputLayout SUPPORT_SignInPassword;
    EditText EDITTEXT_SignInPassword;
    TextView TEXTVIEW_SignInForgot;
    Button BUTTON_SignIn;
    FloatingActionButton FABUTTON_ReturnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_loginsignin);

        // Link Objects to UI ones
        SUPPORT_SignInEmail = (TextInputLayout) findViewById(R.id.SUPPORT_SignUpEmail);
        EDITTEXT_SignInEmail = (EditText) findViewById(R.id.EDITTEXT_SignUpEmail);
        SUPPORT_SignInPassword = (TextInputLayout) findViewById(R.id.SUPPORT_SignUpPassword);
        EDITTEXT_SignInPassword = (EditText) findViewById(R.id.EDITTEXT_SignUpPassword);
        TEXTVIEW_SignInForgot = (TextView) findViewById(R.id.TEXTVIEW_SignInForgot);
        BUTTON_SignIn = (Button) findViewById(R.id.BUTTON_SignUp);
        FABUTTON_ReturnSignIn = (FloatingActionButton) findViewById(R.id.FABUTTON_ReturnSignIn);


        FABUTTON_ReturnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToLoginMain = new Intent(ACTIVITY_LoginSignIn.this, ACTIVITY_LoginMain.class);
                startActivity(GoToLoginMain);
            }
        });

    }
}
