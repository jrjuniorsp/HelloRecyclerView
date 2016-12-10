package com.jairrillo.hellorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jairrillo on 03/12/16.
 */

public class AdapterHeroes extends RecyclerView.Adapter<AdapterHeroes.ViewHolder> {

    private List<Hero> heroes;

    /**
     * ViewHolder class
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtHeroes;

        public ViewHolder(View view) {
            super(view);
            this.txtHeroes = (TextView) view.findViewById(R.id.txtHeroName);
        }
    }

    public AdapterHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    /**
     * Creates the new ViewHOlder
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public AdapterHeroes.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.heroes_items, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(AdapterHeroes.ViewHolder holder, int position) {
        ViewHolder vh = holder;
        Hero hero = heroes.get(position);
        vh.txtHeroes.setText(hero.getName());

    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }
}
