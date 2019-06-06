package com.sakebakery.opus;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeDashboard extends AppCompatActivity {

    TextView t;
    RecyclerView rvPopularFood;
    PopularCake cadapter;
    String cakes[]={"cake1","cake2"};
    String prices[]={"150MMK","120MMK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        t=findViewById(R.id.logo);
        Typeface mycustomFont= Typeface.createFromAsset(getAssets(),"font/vegan.ttf");
        t.setTypeface(mycustomFont);

        rvPopularFood=findViewById(R.id.rvPopularFood);
        rvPopularFood.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rvPopularFood.setLayoutManager(layoutManager);
        ArrayList<DataCake> datacakes=getData();
        cadapter=new PopularCake(datacakes,this);
        rvPopularFood.setAdapter(cadapter);
    }

    private ArrayList<DataCake> getData() {
        ArrayList<DataCake> cakeArrayList=new ArrayList<>();
        for(int i=0;i<cakes.length;i++)
        {
        DataCake dataCake=new DataCake();
            dataCake.setCakeName(cakes[i]);
            dataCake.setPrice(prices[i]);
            cakeArrayList.add(dataCake);
        }
        return cakeArrayList;
    }
}
