package com.example.reciper.Adapters;

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


public class PopularRecipeAdapter extends RecyclerView.Adapter<PopularRecipeViewHolder> {
    Context context;
    List<Recipe> list;
    private OnClickListener onClickListener;


    public PopularRecipeAdapter(Context context, List<Recipe> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public PopularRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_recipes, parent, false);
        return new PopularRecipeViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PopularRecipeViewHolder holder, int position) {
        Recipe recipe = list.get(position);
        holder.food_name_popular.setText(list.get(position).title);
        holder.food_name_popular.setSelected(true);
        Picasso.get().load(list.get(position).image).into(holder.food_image_popular);
        holder.itemView.setOnClickListener(view -> {
            if (onClickListener != null) {
                onClickListener.onClick(position, recipe);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onClick(int position, Recipe recipe);
    }

}

class PopularRecipeViewHolder extends RecyclerView.ViewHolder {
    CardView food_Card_popular;
    ImageView food_image_popular;
    TextView food_name_popular;

    public PopularRecipeViewHolder(@NonNull View itemView) {
        super(itemView);
        food_Card_popular = itemView.findViewById(R.id.popular_Recipe_Card);
        food_image_popular = itemView.findViewById(R.id.food_image_popular);
        food_name_popular = itemView.findViewById(R.id.food_name_popular);

    }


}