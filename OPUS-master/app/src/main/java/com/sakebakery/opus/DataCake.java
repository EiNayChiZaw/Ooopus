package com.sakebakery.opus;

public class DataCake {
    String cakeName;
    String price;
    int img;

    public DataCake() {

    }

    public DataCake(String cakeName, String price, int img) {
        this.cakeName = cakeName;
        this.price = price;
        this.img = img;
    }


    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
