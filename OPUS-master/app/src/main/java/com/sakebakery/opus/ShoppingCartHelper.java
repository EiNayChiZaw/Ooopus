package com.sakebakery.opus;

import java.util.List;
import java.util.Vector;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;


public class ShoppingCartHelper extends AppCompatActivity {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    public static List<Product> getCatalog(Resources res) {
        if (catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("Cake Rosette", res
                    .getDrawable(R.drawable.rose),
                    "Strawberry", "Strawberry Rich Cream flavour designated with rosette flowers!Perfectly suit for your sweet moment", "15000", "Chocolat"));
            catalog.add(new Product("Chocolate Cake", res
                    .getDrawable(R.drawable.chococake),
                    "Chocolate", "Chocolate coated cake with raspberry and strawberries! Fresh and fascinating", "20000", "Chocolate"));
            catalog.add(new Product("East Village", res
                    .getDrawable(R.drawable.vcake),
                    "Vanilla", "Chocolate flavour combined with vanilla flowers offer excellent taste of eyes and mouth", "12000", "Whipped Cream"));
            catalog.add(new Product("Birthday Cake", res
                    .getDrawable(R.drawable.bcake),
                    "Grape", "Simple and Colourful Birthday cake for everyone", "22000", "Whipped Cream"));
            catalog.add(new Product("Rich Chocolate Cake", res
                    .getDrawable(R.drawable.rich),
                    "Chocolate", "Chocolate cake for choco lover", "15000", "Chocolate"));
            catalog.add(new Product("Durine Cake", res
                    .getDrawable(R.drawable.dcake),
                    "Durian", "Rich durine flavour can offer you a new special taste", "17500", "Durain"));
            catalog.add(new Product("Flower Cake", res
                    .getDrawable(R.drawable.flower),
                    "Strawberry", "Tasteful and most decorative cake with main strawberry cream", "12300", "Strawberry, Whipped Cream"));
            catalog.add(new Product("Heart Shape Raspberry Cake", res
                    .getDrawable(R.drawable.hcake),
                    "Raspberry", "Appealing vanilla cream cake filled with authentic raspberry gel", "15000", "Whipped Cream"));
            catalog.add(new Product("Strawberry Creamy Cake", res
                    .getDrawable(R.drawable.scake),
                    "Vanilla", "Birthday cake with strawberry flavour and fruits", "10000", "Whipped Cream"));
            catalog.add(new Product("Munch Choco Cake", res
                    .getDrawable(R.drawable.munch),
                    "Chocolate", "The best option for chocolate lover with crispy chocolate sprinkles", "8500", "Chocolate"));
            catalog.add(new Product("Choco Cake", res
                    .getDrawable(R.drawable.vcake),
                    "Butter Cream", "Appealing vanilla cream cake filled with authentic raspberry gel", "13000", "Butter" ));
            catalog.add(new Product("White choco cake", res
                    .getDrawable(R.drawable.wcake),
                    "Vanilla", "White chocolate cake with whipped cream", "18000" , "Chocolate, Vanilla Cream"));
            catalog.add(new Product("Rosette Vanilla Cake", res
                    .getDrawable(R.drawable.vanillac),
                    "Vanilla", "Vanilla flavoured cake", "25500", "Milky Vanilla Cream"));
        }

        return catalog;
    }

    public static List<Product> getCart() {
        if (cart == null) {
            cart = new Vector<Product>();
        }

        return cart;
    }

}








