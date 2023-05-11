package com.example.yogiuts;

import android.os.Parcel;
import android.os.Parcelable;

public class Rumahsakit implements Parcelable {
    private String name;
    private String address;
    private int photo;
    private double latitude;
    private double longitude;

    protected Rumahsakit(Parcel in) {
        name = in.readString();
        address = in.readString();
        photo = in.readInt();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<Rumahsakit> CREATOR = new Creator<Rumahsakit>() {
        @Override
        public Rumahsakit createFromParcel(Parcel in) { return new Rumahsakit(in);
        }

        @Override
        public Rumahsakit[] newArray(int size) {
            return new Rumahsakit[size];
        }
    };

    public Rumahsakit(int icon, String name, double lat, double lng, String address){
        this.photo = icon;
        this.name = name;
        this.latitude = lat;
        this.longitude = lng;
        this.address = address;

    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public int getPhoto() { return photo; }

    public void setPhoto(int photo) { this.photo = photo; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeInt(photo);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

