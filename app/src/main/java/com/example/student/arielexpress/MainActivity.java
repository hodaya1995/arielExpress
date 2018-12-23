package com.example.student.arielexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<TextView> categories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        categories=new ArrayList<>();
        categories.add((TextView) findViewById(R.id.jeans));
        categories.add((TextView) findViewById(R.id.jackets));
        categories.add((TextView) findViewById(R.id.hoodies));
        categories.add((TextView) findViewById(R.id.shirts));
        categories.add((TextView) findViewById(R.id.shorts));
        categories.add((TextView) findViewById(R.id.pants));


        for(int i=0;i<categories.size();i++){
            categories.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Items.class);
                    startActivity(intent);

                }
            });
        }
    }



   public void goToShoppingCart(View view){
       Intent intent = new Intent(this, ShoppingCart.class);
       startActivity(intent);
   }





}
