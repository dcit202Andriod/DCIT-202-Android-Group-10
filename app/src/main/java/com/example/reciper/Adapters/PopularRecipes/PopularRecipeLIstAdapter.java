package com.example.reciper.Adapters.PopularRecipes;

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

public class PopularRecipeLIstAdapter extends RecyclerView.Adapter<PopularRecipeListViewHolder> {
    Context context;
    List <Recipe> list;

    public PopularRecipeLIstAdapter(Context context, List<Recipe> list) {

        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public PopularRecipeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PopularRecipeListViewHolder(LayoutInflater.from(context).inflate(R.layout.popular_recipes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PopularRecipeListViewHolder holder, int position) {
        holder.food_name_popular.setText(list.get(position).title);
        holder.food_name_popular.setSelected(true);
        Picasso.get().load(list.get(position).image).into(holder.food_image_popular);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class PopularRecipeListViewHolder extends RecyclerView.ViewHolder{
        CardView food_Card_popular;
        ImageView food_image_popular;
        TextView food_name_popular;
        public PopularRecipeListViewHolder(@NonNull View itemView) {
            super(itemView);
            food_Card_popular = itemView.findViewById(R.id.food_Card_popular);
            food_image_popular = itemView.findViewById(R.id.food_image_popular);
            food_name_popular = itemView.findViewById(R.id.food_name_popular);
        }
    }
