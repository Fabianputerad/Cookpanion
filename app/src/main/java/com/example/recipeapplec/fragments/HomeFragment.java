package com.example.recipeapplec.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.recipeapplec.R;
import com.example.recipeapplec.recipe;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    static ArrayList<recipe> recipes=new ArrayList<>();

    CardView toSaved, toRecipe;
    Button cook;

    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        recipes.add(new recipe("Pizza","pizza makanan lumayan enak","1000kal","https://img.freepik.com/free-photo/top-view-pepperoni-pizza-with-mushroom-sausages-bell-pepper-olive-corn-black-wooden_141793-2158.jpg?size=626&ext=jpg"));
        View view = inflater.inflate(R.layout.fragment_homepage, container, false);
//        toRecipe = view.findViewById(R.id.toRecipe);
//        toSaved = view.findViewById(R.id.toSaved);
        cook = view.findViewById(R.id.btncook);

        cook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tor = new Intent(getContext(), RecipeFragment.class);
                startActivity(tor);
            }
        });


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homepage, container, false);


    }


}