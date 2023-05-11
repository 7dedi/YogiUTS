package com.example.yogiuts;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailRumahsakitActivity extends AppCompatActivity implements GoogleMap.OnMapLoadedCallback, OnMapReadyCallback {
    private Rumahsakit rumahsakit;
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rumahsakit);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvAddress = findViewById(R.id.tv_item_address);
        SupportMapFragment mapFragment =  (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map_detail);
        if(mapFragment != null){
            mapFragment.getMapAsync(this);
        }

        rumahsakit = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (rumahsakit != null){
            Glide.with(this)
                    .load(rumahsakit.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(rumahsakit.getName());
            Log.e("LAT", String.valueOf(rumahsakit.getLatitude()));
            Log.e("LNG", String.valueOf(rumahsakit.getLongitude()));
            tvAddress.setText(rumahsakit.getAddress());
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Rumahsakit");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng;
        if (rumahsakit != null){
            latLng = new LatLng(rumahsakit.getLatitude(), rumahsakit.getLongitude());
        } else {
            latLng = new LatLng( 0.5001589, 101.3772014);
        }

        MarkerOptions options = new MarkerOptions();
        options.position(latLng).title(rumahsakit.getAddress());
        googleMap.addMarker(options);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

    }

    @Override
    public void onMapLoaded() {

    }
}