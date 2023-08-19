package com.example.food_figma.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.food_figma.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ConstraintLayout btn_login=findViewById(R.id.button_login_Maiinacticity_2_ID);
        ConstraintLayout btn_singup=findViewById(R.id.button_Singup_Mainactivity_2_ID);
        btn_login.setOnClickListener(view -> startActivity(new Intent(MainActivity2.this, MainActivity3.class)));

        btn_singup.setOnClickListener(view -> startActivity(new Intent(MainActivity2.this, MainActivity4.class)));
    }
}