package com.example.myloginapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private final ArrayList<String>  items = new ArrayList<>();

    HomeAdapter(){
        items.add("mahdi") ;
        items.add("nothing");
        items.add("hii") ;
        items.add("Elina mohammadi poshtemasari ");
        items.add("ALi") ;
        items.add("Salam");
        items.add("nothing");
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
        String item = items.get(position);
        holder.small_tv.setText(item);
        holder.setName(items.get(position));
        Intent i = new Intent(holder.itemView.getContext(), DetailsContact.class);
        holder.itemView.setOnClickListener(view -> {
            i.putExtra("title", item);
            holder.itemView.getContext().startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class  HomeViewHolder extends  RecyclerView.ViewHolder {

        TextView small_tv;
        TextView description_tv;
       public HomeViewHolder(@NonNull View itemView) {
           super(itemView);
           small_tv = itemView.findViewById(R.id.Tv_small);
           description_tv = itemView.findViewById(R.id.Tv_description);
           itemView.setOnClickListener(view -> Toast.makeText(itemView.getContext(),
                   description_tv.getText(),
                   Toast.LENGTH_SHORT).show());


       }

       public void setName (String full_name){
           description_tv.setText(full_name);
           small_tv.setText(full_name.substring(0,1));
       }
   }
}
