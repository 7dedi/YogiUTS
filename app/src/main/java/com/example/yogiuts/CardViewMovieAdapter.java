package com.example.yogiuts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMovieAdapter extends RecyclerView.Adapter<CardViewMovieAdapter.cardViewViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie;

    public ArrayList<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    public CardViewMovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public cardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_sakit, viewGroup, false);
        return new cardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardViewViewHolder cardViewViewHolder, int position) {
        Movie movie = getListMovie().get(position);
        Glide.with(context)
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvttitle.setText(movie.getTitle());

    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class cardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvttitle;

        cardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.imagecover);
            tvttitle = itemView.findViewById(R.id.texttitle);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie = getListMovie().get(position);
            Intent intent = new Intent(context, DetailMovieActivity.class);
            intent.putExtra(DetailMovieActivity.ITEM_EXTRA, movie);
            context.startActivity(intent);
        }
    }
}
