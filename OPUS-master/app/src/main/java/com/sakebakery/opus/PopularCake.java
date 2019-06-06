package com.sakebakery.opus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PopularCake extends RecyclerView.Adapter<PopularCake.ViewHolder> {
    List<DataCake> cakeList;
    Context context;

    public PopularCake(List<DataCake> cakeList, Context context) {
        this.cakeList = cakeList;
        this.context = context;
    }

    @NonNull
    @Override
    public PopularCake.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_popular_cake,viewGroup,false);
       ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PopularCake.ViewHolder viewHolder, int i) {
    viewHolder.cakename.setText(cakeList.get(i).getCakeName());
        viewHolder.price.setText(cakeList.get(i).getPrice());
    }

    @Override
    public int getItemCount() {
        return cakeList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView cakename,price;
        public ViewHolder( @NonNull View itemView){
            super(itemView);

            cakename=itemView.findViewById(R.id.tvCakeName);
            price=itemView.findViewById(R.id.tvPrice);
        }
    }
}
