package com.example.yogiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMovieActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        ImageView imgItemPhoto = findViewById(R.id.img_poster);
        TextView tvName = findViewById(R.id.tv_judul);
        TextView tvOverview = findViewById(R.id.tv_detail);
        TextView tvNomortelepon = findViewById(R.id.tv_notelp);
        TextView tvRating = findViewById(R.id.tv_rating);

        Movie movie = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(movie != null){
            Glide.with(this)
                    .load(movie.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(movie.getTitle());
            tvOverview.setText(movie.getOverview());
            tvNomortelepon.setText(movie.getNomortelepon());
            tvRating.setText(movie.getRating());
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Movie");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}