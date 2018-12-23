package com.example.student.arielexpress;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 19/12/2018.
 */

public class ShoppingCart extends AppCompatActivity{


//TODO
int itemsCount;
int total;
ItemScreen[] products=new ItemScreen[15];

    public ShoppingCart(int itemsCount, int total, ItemScreen[] products) {
        this.itemsCount = itemsCount;
        this.total = total;
        for (int i=0;i<this.products.length;i++) this.products[i]=products[i];
    }

    public ShoppingCart(){
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ItemScreen[] getProducts() {
        return products;
    }

    public void setProducts(ItemScreen[] products) {
        this.products = products;
    }
}
