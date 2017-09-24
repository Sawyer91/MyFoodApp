package com.sawyerd.myfoodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "food";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodno = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);

        Food food = Food.foods[foodno];

        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = (TextView) findViewById(R.id.desc);

        name.setText(food.getName());
        desc.setText(food.getDescription());

    }
}
