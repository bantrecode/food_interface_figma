package com.example.food_figma.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.food_figma.Adapter.product_adapter;
import com.example.food_figma.Domain.product_domain;
import com.example.food_figma.R;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ArrayList<product_domain> items=new ArrayList<>();
        items.add(new product_domain("image9","Hamburger","Meat Salad","$8.00"));
        items.add(new product_domain("image12","Chicken","Chicken","$20.00"));
        items.add(new product_domain("image14","Pizaa","Meat Salad","$15.00"));
        items.add(new product_domain("image9","Hamburger","Meat Salad","$8.00"));
        items.add(new product_domain("image12","Chicken","Chicken","$20.00"));
        items.add(new product_domain("image14","Pizaa","Meat Salad","$15.00"));
        RecyclerView recyclerView_product=findViewById(R.id.view_products_activity5_ID);
        recyclerView_product.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        RecyclerView.Adapter<product_adapter.viewholder> adapter_products=new product_adapter(items);
        recyclerView_product.setAdapter(adapter_products);


    }
}