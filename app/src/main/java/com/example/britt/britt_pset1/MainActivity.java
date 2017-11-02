package com.example.britt.britt_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Arms, Ears, Eyebrows, Eyes, Glasses, Mouth, Mustache, Hat, Nose, Shoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arms = findViewById(R.id.image_arms);
        Ears = findViewById(R.id.image_ears);
        Eyebrows = findViewById(R.id.image_eyebrows);
        Eyes = findViewById(R.id.image_eyes);
        Glasses = findViewById(R.id.image_glasses);
        Mouth = findViewById(R.id.image_mouth);
        Mustache = findViewById(R.id.image_mustache);
        Hat = findViewById(R.id.image_hat);
        Nose = findViewById(R.id.image_nose);
        Shoes = findViewById(R.id.image_shoes);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Arms", Arms.getVisibility());

        outState.putInt("Ears", Ears.getVisibility());

        outState.putInt("Eyebrows", Eyebrows.getVisibility());

        outState.putInt("Eyes", Eyes.getVisibility());

        outState.putInt("Glasses", Glasses.getVisibility());

        outState.putInt("Mouth", Mouth.getVisibility());

        outState.putInt("Mustache", Mustache.getVisibility());

        outState.putInt("Hat", Hat.getVisibility());

        outState.putInt("Nose", Nose.getVisibility());

        outState.putInt("Shoes", Shoes.getVisibility());
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        Arms.setVisibility(inState.getInt("Arms"));
        Ears.setVisibility(inState.getInt("Ears"));
        Eyebrows.setVisibility(inState.getInt("Eyebrows"));
        Eyes.setVisibility(inState.getInt("Eyes"));
        Glasses.setVisibility(inState.getInt("Glasses"));
        Mouth.setVisibility(inState.getInt("Mouth"));
        Mustache.setVisibility(inState.getInt("Mustache"));
        Hat.setVisibility(inState.getInt("Hat"));
        Nose.setVisibility(inState.getInt("Nose"));
        Shoes.setVisibility(inState.getInt("Shoes"));
    }

    public void checkBoxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.arms:
                if (checked)
                    Arms.setVisibility(View.VISIBLE);
                else
                    Arms.setVisibility(View.INVISIBLE);
                break;

            case R.id.ears:
                if (checked)
                    Ears.setVisibility(View.VISIBLE);
                else
                    Ears.setVisibility(View.INVISIBLE);
                break;

            case R.id.eyebrows:
                if (checked)
                    Eyebrows.setVisibility(View.VISIBLE);
                else
                    Eyebrows.setVisibility(View.INVISIBLE);
                break;

            case R.id.eyes:
                if (checked)
                    Eyes.setVisibility(View.VISIBLE);
                else
                    Eyes.setVisibility(View.INVISIBLE);
                break;

            case R.id.glasses:
                if (checked)
                    Glasses.setVisibility(View.VISIBLE);
                else
                    Glasses.setVisibility(View.INVISIBLE);
                break;

            case R.id.hat:
                if (checked)
                    Hat.setVisibility(View.VISIBLE);
                else
                    Hat.setVisibility(View.INVISIBLE);
                break;

            case R.id.mouth:
                if (checked)
                    Mouth.setVisibility(View.VISIBLE);
                else
                    Mouth.setVisibility(View.INVISIBLE);
                break;

            case R.id.mustache:
                if (checked)
                    Mustache.setVisibility(View.VISIBLE);
                else
                    Mustache.setVisibility(View.INVISIBLE);
                break;

            case R.id.nose:
                if (checked)
                    Nose.setVisibility(View.VISIBLE);
                else
                    Nose.setVisibility(View.INVISIBLE);
                break;

            case R.id.shoes:
                if (checked)
                    Shoes.setVisibility(View.VISIBLE);
                else
                    Shoes.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
