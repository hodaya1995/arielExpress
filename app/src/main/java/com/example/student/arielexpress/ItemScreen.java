package com.example.student.arielexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by Student on 19/12/2018.
 */

public class ItemScreen extends AppCompatActivity  {
    ImageView image;
    String desc;
    String size;
    String color;
    int price;
    static ItemScreen item;

    public ItemScreen(){

    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemScreen(ImageView image, String desc, int price) {
        this.image = image;
        this.desc = desc;
        this.price = price;
    }

    public void addToBag(View view){
        //TODO


    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_screen);

    }

    //TODO

}
