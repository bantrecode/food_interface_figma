package com.example.food_figma.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.food_figma.R;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ConstraintLayout button_singUp=findViewById(R.id.button_singup_main_4_ID);
        button_singUp.setOnClickListener(view -> startActivity(new Intent(MainActivity4.this,MainActivity5.class)));

        ImageView img_comeback=findViewById(R.id.img_come_back_mainactivity_4_ID);
        img_comeback.setOnClickListener(view -> finish());

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView singin=findViewById(R.id.txt_singin_main_4_ID);
        singin.setOnClickListener(view -> startActivity(new Intent(MainActivity4.this, MainActivity3.class)));
    }
}