package com.example.moviezone;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

//    @GET("movie?rating.kp=4-8&sortField=votes.kp&sortType=1&limit=100")
    @GET("movie?rating.kp=7-10&sortField=votes.kp&sortType=-1&limit=30")
    @Headers("X-API-KEY:2X59DB1-2Y34PK5-GK76RE9-8QARP6M")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{id}")
    @Headers("X-API-KEY:2X59DB1-2Y34PK5-GK76RE9-8QARP6M")
    Single<TrailerResponse> loadTrailers(@Path("id") int id);

    @GET("review?page=1&l&sortField=date&sortType=-1")
    @Headers("X-API-KEY:2X59DB1-2Y34PK5-GK76RE9-8QARP6M")
    Single<ReviewResponse> loadReviews(@Query("movieId") int id);


}
