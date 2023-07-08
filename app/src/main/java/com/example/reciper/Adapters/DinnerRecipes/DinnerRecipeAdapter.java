package com.example.reciper.Adapters.DinnerRecipes;

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

public class DinnerRecipeAdapter extends RecyclerView.Adapter<DinnerRecipeViewHolder> {
    Context context;
    List<Recipe> list;

    public DinnerRecipeAdapter (Context context, List<Recipe> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public DinnerRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DinnerRecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.lunch_recipes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DinnerRecipeViewHolder holder, int position) {
        holder.textView.setText(list.get(position).title);
        holder.textView.setSelected(true);
        Picasso.get().load(list.get(position).image).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class DinnerRecipeViewHolder extends RecyclerView.ViewHolder{
    CardView cardView;
    ImageView imageView;
    TextView textView;

    public DinnerRecipeViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView= itemView.findViewById(R.id.food_Card_dinner);
        imageView = itemView.findViewById(R.id.food_image_dinner);
        textView = itemView.findViewById(R.id.food_name_dinner);
    }

}
