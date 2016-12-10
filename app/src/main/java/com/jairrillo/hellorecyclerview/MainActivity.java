package com.jairrillo.hellorecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerViewHeroes;
    private RecyclerView.Adapter adapterHeroes;
    private RecyclerView.LayoutManager layoutManagerHeroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewHeroes = (RecyclerView) findViewById(R.id.rc_heroes);

        recyclerViewHeroes.setHasFixedSize(true);

        layoutManagerHeroes = new LinearLayoutManager(this);
        recyclerViewHeroes.setLayoutManager(layoutManagerHeroes);

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Batman"));
        heroes.add(new Hero("Chapolin"));
        heroes.add(new Hero("Super Man"));

        adapterHeroes = new AdapterHeroes(heroes);
        recyclerViewHeroes.setAdapter(adapterHeroes);

    }

}
