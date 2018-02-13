
package com.mortezaafshari.alfia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ACTIVITY_Services extends AppCompatActivity {
CardView fitness;
CardView lesar;
CardView masaj;
CardView beauty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_services);


        fitness=(CardView) findViewById(R.id.fitness);
        lesar=(CardView) findViewById(R.id.leyzer);
        masaj=(CardView) findViewById(R.id.masaje);
        beauty=(CardView) findViewById(R.id.zibayi);
        fitness.setOnClickListener(new View.OnClickListener () {
            @Override
            public void OnClick(View view){
                Intent GoToLoginMain = new Intent(ACTIVITY_Services.this, ACTIVITY_Fitness.class);
                startActivity(GoToLoginMain);
            }
        });
        lesar.setOnClickListener (new View.OnClickListener(){
            @Override
            public void OnClick(View view){
                Intent GoToLoginMain = new Intent(ACTIVITY_Services.this, laser.class);
                startActivity(GoToLoginMain);
            }
        });
        masaj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View view){
                Intent GoToLoginMain = new Intent(ACTIVITY_Services.this, ACTIVITY_masaje.class);
                startActivity(GoToLoginMain);
            }
        });
        beauty.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View view){
                Intent GoToLoginMain = new Intent(ACTIVITY_Services.this, ACTIVITY_Beauty.class);
                startActivity(GoToLoginMain);
            }
        });

    }

}