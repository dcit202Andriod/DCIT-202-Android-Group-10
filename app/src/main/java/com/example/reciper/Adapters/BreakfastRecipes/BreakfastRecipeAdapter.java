package com.example.reciper.Adapters.BreakfastRecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciper.Adapters.BreakfastRecipes.BreakfastRecipeViewHolder;
import com.example.reciper.Models.Recipe;
import com.example.reciper.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BreakfastRecipeAdapter extends RecyclerView.Adapter<BreakfastRecipeViewHolder>{
    Context context;
    List<Recipe> list;

    public BreakfastRecipeAdapter (Context context, List<Recipe> list){
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public BreakfastRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BreakfastRecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.breakfast_recipes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BreakfastRecipeViewHolder holder, int position) {
        holder.food_name_breakfast.setText(list.get(position).title);
        holder.food_name_breakfast.setSelected(true);
        Picasso.get().load(list.get(position).image).into(holder.food_image_breakfast);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class BreakfastRecipeViewHolder extends RecyclerView.ViewHolder{
    CardView food_Card_breakfast;
    ImageView food_image_breakfast;
    TextView food_name_breakfast;

    public BreakfastRecipeViewHolder(@NonNull View itemView) {
        super(itemView);
        food_Card_breakfast = itemView.findViewById(R.id.food_Card_breakfast);
        food_image_breakfast = itemView.findViewById(R.id.food_image_breakfast);
        food_name_breakfast = itemView.findViewById(R.id.food_name_breakfast);
    }
}