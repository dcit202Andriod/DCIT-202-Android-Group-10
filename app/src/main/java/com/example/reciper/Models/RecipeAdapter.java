package com.example.reciper.Models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciper.Activity5;
import com.example.reciper.R;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder>{

    MyRecipeData[] myRecipeData;
    Context context;

    public RecipeAdapter(MyRecipeData[] myRecipeData, Activity5 activity) {
        this.myRecipeData = myRecipeData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.another,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyRecipeData myRecipeDataList = myRecipeData[position];
        holder.textViewName.setText(myRecipeDataList.getRecipeName());
        holder.RecipeImage.setImageResource(myRecipeDataList.getRecipeImage());

        holder.itemView.setOnClickListener(v -> Toast.makeText(context,myRecipeDataList.getRecipeName() , Toast.LENGTH_SHORT).show());

    }

    @Override
    public int getItemCount() {
        return myRecipeData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView RecipeImage;
        TextView textViewName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            RecipeImage = itemView.findViewById(R.id.imageview);
                    textViewName = itemView.findViewById(R.id.textName);
        }
    }
}
