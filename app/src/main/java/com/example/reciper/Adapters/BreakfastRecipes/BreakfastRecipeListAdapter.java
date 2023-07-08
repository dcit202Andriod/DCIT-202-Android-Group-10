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

import com.example.reciper.Models.Recipe;
import com.example.reciper.R;
import com.squareup.picasso.Picasso;

import java.util.List;

    public class BreakfastRecipeListAdapter extends RecyclerView.Adapter<BreakfastRecipeListViewHolder>{
        Context context;
        List<Recipe> list;

        public BreakfastRecipeListAdapter (Context context, List<Recipe> list){
            this.context = context;
            this.list = list;
        }
        @NonNull
        @Override
        public BreakfastRecipeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new BreakfastRecipeListViewHolder(LayoutInflater.from(context).inflate(R.layout.breakfast_recipes_recycler, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull BreakfastRecipeListViewHolder holder, int position) {
            holder.food_name_breakfast.setText(list.get(position).title);
            holder.food_name_breakfast.setSelected(true);
            Picasso.get().load(list.get(position).image).into(holder.food_image_breakfast);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }
    class BreakfastRecipeListViewHolder extends RecyclerView.ViewHolder{
        CardView food_Card_breakfast;
        ImageView food_image_breakfast;
        TextView food_name_breakfast;

        public BreakfastRecipeListViewHolder(@NonNull View itemView) {
            super(itemView);
            food_Card_breakfast = itemView.findViewById(R.id.breakfast_recipes_Card);
            food_image_breakfast = itemView.findViewById(R.id.breakfast_recipes_image);
            food_name_breakfast = itemView.findViewById(R.id.breakfast_recipes_image);
        }
    }

