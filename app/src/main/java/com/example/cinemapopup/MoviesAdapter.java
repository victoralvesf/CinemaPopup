package com.example.cinemapopup;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        // TODO: Populate adapter with movies
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        public MovieViewHolder(final View itemView) {
            super(itemView);
        }
    }
}
