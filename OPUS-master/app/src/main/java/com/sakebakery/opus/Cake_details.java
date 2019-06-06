package com.sakebakery.opus;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.sakebakery.opus.adapter.CakeImagelistAdapter;
import com.sakebakery.opus.adapter.CakedataListAdapter;
import com.sakebakery.opus.obj.Cakeobj;

import java.util.ArrayList;
import java.util.List;


public class Cake_details extends AppCompatActivity {

    // public TextView side, flavor, icing, top, description, price;
    private DatabaseReference mData;
    private CakedataListAdapter cakedataListAdapter;
    //private CakeImagelistAdapter cakeImagelistAdapter;
    private RecyclerView cake_list;
    private Cakeobj cakeObjnormal;
    private ArrayList<Cakeobj> cakeObjs;
    private ProgressDialog progressDialog;
    private Button btn_test;
    private Button btn_addtocart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake_details);
        final Button button = findViewById(R.id.detail);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cake_details.this, CakeImagelistAdapter.class);
                startActivity(intent);


                Bundle bn = getIntent().getExtras();
                String cname = bn.getString("CakeName");
                String cflavor = bn.getString("CakeFlavor");
                String cprice = bn.getString("CakePrice");
                String cimg = bn.getString("CakeImg");
                int pic = bn.getInt("imgpos");


                // Set the proper image and text
                ImageView productImageView = (ImageView) findViewById(R.id.g_thumbnail);
                productImageView.setImageResource(pic);
                TextView productTitleTextView = (TextView) findViewById(R.id.gtv_cake_name);
                productTitleTextView.setText(cname);
                TextView productDetailsTextView = (TextView) findViewById(R.id.gtv_cake_price);
                productDetailsTextView.setText(cprice);

            }
        });
    }
}

















