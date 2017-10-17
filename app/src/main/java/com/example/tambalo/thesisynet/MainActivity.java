package com.example.tambalo.thesisynet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void finHairstyleOnClick(View view){
        setContentView(R.layout.finhairstyle);
    }
    public void celticKnotOnClick(View view){
        setContentView(R.layout.celticknot);
    }
    public void halfupHairstyleOnClick(View view){
        setContentView(R.layout.halfuphairstyle);
    }
    public void halfupFrenchbraidOnClick(View view){
        setContentView(R.layout.halfupfrenchbraids);
    }
    public void frenchHairstyleOnClick(View view){
        setContentView(R.layout.frenchhairstyle);
    }
    public void topBunOnClick(View view){
        setContentView(R.layout.topbun);
    }
    public void promOnClick(View view){
        setContentView(R.layout.promhairstyle);
    }
    public void ladderHairstyleOnClick(View view){
        setContentView(R.layout.ladderhairstyle);
    }
    public void textureLooseOnClick(View view){
        setContentView(R.layout.texturelooseupdo);
    }
    public void dutchHairstyleOnClick(View view){
        setContentView(R.layout.dutchhairstyle);
    }
    public void braidedBunOnClick(View view){
        setContentView(R.layout.braidedbun);
    }
    public void sidesweptWatBraidOnClick(View view){
        setContentView(R.layout.sidesweptwatbraid);
    }
    public void topHalfOnClick(View view){
        setContentView(R.layout.tophalf);
    }
    public void cinnamonOnClick(View view){
        setContentView(R.layout.cinnamon);
    }

}
