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

import com.example.reciper.Models.Recipe;
import com.example.reciper.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LunchRecipeListAdapter extends RecyclerView.Adapter<LunchRecipeListViewHolder> {
    Context context;
    List<Recipe> list;

    public LunchRecipeListAdapter(Context context, List<Recipe> list){
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public LunchRecipeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LunchRecipeListViewHolder(LayoutInflater.from(context).inflate(R.layout.lunch_recipes_recycler, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LunchRecipeListViewHolder holder, int position) {
        holder.textView.setText(list.get(position).title);
        holder.textView.setSelected(true);
        Picasso.get().load(list.get(position).image).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class LunchRecipeListViewHolder extends RecyclerView.ViewHolder{
    CardView cardView;
    ImageView imageView;
    TextView textView;

    public LunchRecipeListViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView= itemView.findViewById(R.id.lunch_recipes_Card);
        imageView = itemView.findViewById(R.id.lunch_recipes_image);
        textView = itemView.findViewById(R.id.lunch_recipes_name);
    }
}
