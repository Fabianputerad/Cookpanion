package com.example.recipeapplec.adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recipeapplec.R;
import com.example.recipeapplec.recipe;

import java.util.ArrayList;

public class bookmarkAdapter{


    ArrayList<recipe> recipes;
    Context ctx;

    public class DataHolder extends RecyclerView.ViewHolder{
        TextView foodname, fooddesc, calorie;
        ImageView img;

        public DataHolder(@NonNull View itemView){
            super(itemView);

        }
    }

}