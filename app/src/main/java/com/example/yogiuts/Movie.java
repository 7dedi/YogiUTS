package com.example.yogiuts;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String title;
    private String overview;
    private String photo;
    private String nomortelepon;
    private String rating;

    protected Movie(Parcel in) {
        title = in.readString();
        overview = in.readString();
        photo = in.readString();
        nomortelepon = in.readString();
        rating = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(overview);
        dest.writeString(photo);
        dest.writeString(nomortelepon);
        dest.writeString(rating);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public Movie (String title, String overview, String photo, String nomortelepon, String rating){
        this.title = title;
        this.overview = overview;
        this.photo = photo;
        this.nomortelepon = nomortelepon;
        this.rating = rating;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNomortelepon() {
        return nomortelepon;
    }

    public void setNomortelepon(String nomortelepon) {
        this.nomortelepon = nomortelepon;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
