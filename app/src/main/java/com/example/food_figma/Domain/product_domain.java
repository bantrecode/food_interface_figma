package com.example.food_figma.Domain;

public class product_domain {
    private String Str_image_product,Str_tiltle,Str_describe,Str_price;

    public product_domain(String str_image_product, String str_tiltle, String str_describe, String str_price) {
        Str_image_product = str_image_product;
        Str_tiltle = str_tiltle;
        Str_describe = str_describe;
        Str_price = str_price;
    }

    public String getStr_image_product() {
        return Str_image_product;
    }

    public void setStr_image_product(String str_image_product) {
        Str_image_product = str_image_product;
    }

    public String getStr_tiltle() {
        return Str_tiltle;
    }

    public void setStr_tiltle(String str_tiltle) {
        Str_tiltle = str_tiltle;
    }

    public String getStr_describe() {
        return Str_describe;
    }

    public void setStr_describe(String str_describe) {
        Str_describe = str_describe;
    }

    public String getStr_price() {
        return Str_price;
    }

    public void setStr_price(String str_price) {
        Str_price = str_price;
    }
}
