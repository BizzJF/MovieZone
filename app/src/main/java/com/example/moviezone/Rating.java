package com.example.moviezone;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {
    @SerializedName("kp")
    private double kp;
    @SerializedName("imdb")
    private String imdb;

    public Rating(double kp, String imdb) {
        this.kp = kp;
        this.imdb = imdb;
    }

    public double getKp() {
        return kp;
    }

    public String getImdb() {
        return imdb;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "kp='" + kp + '\'' +
                ", imdb='" + imdb + '\'' +
                '}';
    }
}
