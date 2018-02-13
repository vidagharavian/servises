package com.mortezaafshari.alfia;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ACTIVITY_LoginSignUp extends AppCompatActivity {

    // Create Objects from Which Created in Layout .xml file
    TextInputLayout SUPPORT_SignUpName;
    EditText EDITTEXT_SignUpName;
    TextInputLayout SUPPORT_SignUpSurname;
    EditText EDITTEXT_SignUpSurname;
    TextInputLayout SUPPORT_SignUpEmail;
    EditText EDITTEXT_SignUpEmail;
    TextInputLayout SUPPORT_SignUpPassword;
    EditText EDITTEXT_SignUpPassword;
    TextInputLayout SUPPORT_SignUpPhone;
    EditText EDITTEXT_SignUpPhone;
    Button BUTTON_SignUp;
    FloatingActionButton FABUTTON_ReturnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_loginsignup);

        // Link Objects to UI ones
        SUPPORT_SignUpName = (TextInputLayout) findViewById(R.id.SUPPORT_SignUpName);
        EDITTEXT_SignUpName = (EditText) findViewById(R.id.EDITTEXT_SignUpName);
        SUPPORT_SignUpSurname = (TextInputLayout) findViewById(R.id.SUPPORT_SignUpSurname);
        EDITTEXT_SignUpSurname = (EditText) findViewById(R.id.EDITTEXT_SignUpSurname);
        SUPPORT_SignUpEmail = (TextInputLayout) findViewById(R.id.SUPPORT_SignUpEmail);
        EDITTEXT_SignUpEmail = (EditText) findViewById(R.id.EDITTEXT_SignUpEmail);
        SUPPORT_SignUpPassword = (TextInputLayout) findViewById(R.id.SUPPORT_SignUpPassword);
        EDITTEXT_SignUpPassword = (EditText) findViewById(R.id.EDITTEXT_SignUpPassword);
        SUPPORT_SignUpPhone = (TextInputLayout) findViewById(R.id.SUPPORT_SignUpPhone);
        EDITTEXT_SignUpPhone = (EditText) findViewById(R.id.EDITTEXT_SignUpPhone);
        BUTTON_SignUp = (Button) findViewById(R.id.BUTTON_SignUp);
        FABUTTON_ReturnSignUp = (FloatingActionButton) findViewById(R.id.FABUTTON_ReturnSignUp);

        SUPPORT_SignUpPhone.setCounterEnabled(true);
        SUPPORT_SignUpPhone.setCounterMaxLength(11);

        EDITTEXT_SignUpPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (EDITTEXT_SignUpPassword.getText().toString().isEmpty() || EDITTEXT_SignUpPassword.getText().toString().length() <=8) {SUPPORT_SignUpPassword.setErrorEnabled(true);SUPPORT_SignUpPassword.setError("حداقل 8 کاراکتر");}
                else {SUPPORT_SignUpPassword.setErrorEnabled(false);}}
        });
        EDITTEXT_SignUpPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count <= 8) {
                    String a = String.format("%d", before);
                    SUPPORT_SignUpPassword.setErrorEnabled(true);
                    SUPPORT_SignUpPassword.setError("حداقل 8 کاراکتر");
                    Toast toast1 = Toast.makeText(ACTIVITY_LoginSignUp.this, a, Toast.LENGTH_SHORT); toast1.show();


                }
                else {
                    String a = String.format("%d", before);
                    SUPPORT_SignUpPassword.setErrorEnabled(false);
                    SUPPORT_SignUpPassword.setError("");
                    Toast toast1 = Toast.makeText(ACTIVITY_LoginSignUp.this, a, Toast.LENGTH_SHORT); toast1.show();


                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        EDITTEXT_SignUpPhone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (EDITTEXT_SignUpPhone.getText().toString().isEmpty() || EDITTEXT_SignUpPassword.getText().toString().length() <=11) {SUPPORT_SignUpPhone.setErrorEnabled(true);SUPPORT_SignUpPhone.setError("به صورت 09123456789");}
                else {SUPPORT_SignUpPhone.setErrorEnabled(false);}}
        });
        EDITTEXT_SignUpPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (count <= 11) {
                    SUPPORT_SignUpPhone.setErrorEnabled(true);
                    SUPPORT_SignUpPhone.setError("به صورت 09123456789");
                }
                else {
                    SUPPORT_SignUpPhone.setErrorEnabled(false);
                }
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count <= 11) {
                    SUPPORT_SignUpPhone.setErrorEnabled(true);
                    SUPPORT_SignUpPhone.setError("به صورت 09123456789");
                }
                else {
                    SUPPORT_SignUpPhone.setErrorEnabled(false);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        FABUTTON_ReturnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToLoginMain = new Intent(ACTIVITY_LoginSignUp.this, ACTIVITY_LoginMain.class);
                startActivity(GoToLoginMain);
            }
        });


    }
}
