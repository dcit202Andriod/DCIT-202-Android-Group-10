package com.example.reciper.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciper.R;
import com.example.reciper.cheeseBurger;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.MyViewHolder >{
    Context context;
    ArrayList<cheeseBurger> cheeseBurgers;
    public recyclerViewAdapter(Context context, ArrayList<cheeseBurger> cheeseBurgers){
        this.context = context;
        this.cheeseBurgers = cheeseBurgers;
    }

    @NonNull
    @Override
    public recyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_row, parent, false);
        return new recyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerViewAdapter.MyViewHolder holder, int position) {
    holder.textView.setText(cheeseBurgers.get(position).getBurgerName());
    holder.imageView.setImageResource(cheeseBurgers.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return cheeseBurgers.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView6);
        }
    }
}
