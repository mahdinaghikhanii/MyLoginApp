package com.example.myloginapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private  String [] items = new String [20];
    HomeAdapter(){
        items[0] = "mahdi";
        items[1] = "reza";
        items[2] = "taha";
        items[3] = "khobe";
        items[4] = "mahdi";
        items[5] = "mahdi";
        items[6] = "mahdi";
        items[7] = "mahdi";
        items[8] = "mahdi";
        items[9] = "mahdi";
        items[10] = "mahdi";
        items[11] = "mahdi";
        items[12] = "mahdi";
        items[13] = "mahdi";
        items[14] = "mahdi";
        items[15] = "mahdi";
        items[16] = "mahdi";
        items[17] = "mahdi";
        items[18] = "mahdi";
        items[19] = "mahdi";
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_items ,parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.setName(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }


    public class  HomeViewHolder extends  RecyclerView.ViewHolder {
        TextView small_tv;
        TextView description_tv;
       public HomeViewHolder(@NonNull View itemView) {
           super(itemView);
           small_tv = itemView.findViewById(R.id.Tv_small);
           description_tv = itemView.findViewById(R.id.Tv_description);
       }

       public void setName (String full_name){
           description_tv.setText(full_name);
           small_tv.setText(full_name.substring(0,1));
       }
   }
}
