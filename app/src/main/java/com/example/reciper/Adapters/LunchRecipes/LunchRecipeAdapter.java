package com.example.reciper.Adapters.LunchRecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciper.Adapters.LunchRecipes.LunchRecipeViewHolder;
import com.example.reciper.Models.Recipe;
import com.example.reciper.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LunchRecipeAdapter extends RecyclerView.Adapter<LunchRecipeViewHolder>{
    Context context;
    List<Recipe> list;

    public LunchRecipeAdapter (Context context, List<Recipe> list){
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public LunchRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LunchRecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.lunch_recipes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LunchRecipeViewHolder holder, int position) {
        holder.textView.setText(list.get(position).title);
        holder.textView.setSelected(true);
        Picasso.get().load(list.get(position).image).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class LunchRecipeViewHolder extends RecyclerView.ViewHolder{
    CardView cardView;
    ImageView imageView;
    TextView textView;

    public LunchRecipeViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView= itemView.findViewById(R.id.food_Card_lunch);
        imageView = itemView.findViewById(R.id.food_image_lunch);
        textView = itemView.findViewById(R.id.food_name_lunch);
    }
}