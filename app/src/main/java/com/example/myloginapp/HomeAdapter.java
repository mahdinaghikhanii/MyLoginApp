package com.example.myloginapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private  ArrayList<String> items = new ArrayList<>();
    HomeAdapter(){
        items.add("mahdi") ;
        items.add("reza");
        items.add("mahdi") ;
        items.add("reza");
        items.add("ALi") ;
        items.add(  "Salam");
        items.add(  "reza");
    }


    public  void  addNewContact(String fullName){
        items.add( 0,fullName);
        notifyItemInserted(0);

    }


    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_items ,parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.setName(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class  HomeViewHolder extends  RecyclerView.ViewHolder {
        TextView small_tv;
        TextView description_tv;
       public HomeViewHolder(@NonNull View itemView) {
           super(itemView);
           small_tv = itemView.findViewById(R.id.Tv_small);
           description_tv = itemView.findViewById(R.id.Tv_description);
           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Toast.makeText(itemView.getContext(),description_tv.getText(), Toast.LENGTH_SHORT).show();
               }
           });

       }

       public void setName (String full_name){
           description_tv.setText(full_name);
           small_tv.setText(full_name.substring(0,1));


       }


   }
}
