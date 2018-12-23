package com.example.student.arielexpress;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by Student on 19/12/2018.
 */

public class Items extends AppCompatActivity {
ImageView image;
int price;
String desc;


    public void goToShoppingCart(View view){
        Intent intent = new Intent(this, ShoppingCart.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);
        //getIntent().getSerializableExtra("newItem");
    }



}
