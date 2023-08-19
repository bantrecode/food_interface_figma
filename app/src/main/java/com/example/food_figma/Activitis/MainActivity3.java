package com.example.food_figma.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.food_figma.R;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ConstraintLayout btn_login=findViewById(R.id.button_login_maiactivity_3_ID);
        btn_login.setOnClickListener(view -> startActivity(new Intent(MainActivity3.this, MainActivity5.class)));

        ImageView img_comback=findViewById(R.id.img_comback_Mainativity_3_ID);
        img_comback.setOnClickListener(view -> finish());

        TextView txt_create=findViewById(R.id.txt_create_Mainactivity_3_ID);
        txt_create.setOnClickListener(view ->startActivity(new Intent(MainActivity3.this,MainActivity4.class)));
    }
}