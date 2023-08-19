package com.example.food_figma.Adapter;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.food_figma.Activitis.MainActivity5;
import com.example.food_figma.Domain.product_domain;
import com.example.food_figma.R;

import java.util.List;

public class product_adapter extends RecyclerView.Adapter<product_adapter.viewholder> {

    List<product_domain> items;

    public product_adapter(List<product_domain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public product_adapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_xml, parent, false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull product_adapter.viewholder holder, @SuppressLint("RecyclerView") int position) {
        holder.txt_tiltle.setText(items.get(position).getStr_tiltle());
        holder.txt_describe.setText(items.get(position).getStr_describe());
        holder.txt_price.setText(items.get(position).getStr_price());
        @SuppressLint("DiscouragedApi") int drawableResourceID = holder.itemView.getResources().getIdentifier(items.get(position).getStr_image_product(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceID).into(holder.img_food);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("key","bạn dang chon id = "+position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        TextView txt_tiltle,txt_describe,txt_price;
        ImageView img_food;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            txt_tiltle=itemView.findViewById(R.id.txt_tiltle_product_ID);
            txt_describe=itemView.findViewById(R.id.txt_describe_product_ID);
            txt_price=itemView.findViewById(R.id.txt_price_product_ID);
            img_food=itemView.findViewById(R.id.img_food_product_ID);
        }
    }
}
