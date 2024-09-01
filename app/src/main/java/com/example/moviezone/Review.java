package com.example.moviezone;

import com.google.gson.annotations.SerializedName;

public class Review {
    @SerializedName("author")
    private String author;

    @SerializedName("type")
    private String type;

    @SerializedName("review")
    private String review;

    public Review(String author, String review, String type) {
        this.author = author;
        this.review = review;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    public String getReview() {
        return review;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
