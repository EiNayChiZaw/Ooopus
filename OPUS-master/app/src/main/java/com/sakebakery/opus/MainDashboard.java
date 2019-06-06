package com.sakebakery.opus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainDashboard extends AppCompatActivity {


    RecyclerView rvPopularFood;
    AdapterPopularFood madapter;
    String foods[]={"cake1","cake2"};
    String prices[]={"150MMK","120MMK"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        rvPopularFood=findViewById(R.id.rvPopularFood);
        rvPopularFood.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rvPopularFood.setLayoutManager(layoutManager);
        ArrayList<DataFood> dataFoods=getData();
        madapter=new AdapterPopularFood(dataFoods,this);
        rvPopularFood.setAdapter(madapter);
    }
    private ArrayList<DataFood> getData(){
        ArrayList<DataFood> foodArrayList=new ArrayList<>();
        for(int i=0;i<foods.length;i++)
        {
            DataFood dataFood=new DataFood();
            dataFood.setFoodName(foods[i]);
            dataFood.setPrice(prices[i]);
            foodArrayList.add(dataFood);
        }
        return foodArrayList;
    }
}
