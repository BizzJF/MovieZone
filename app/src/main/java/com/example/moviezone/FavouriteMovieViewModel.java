package com.example.moviezone;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

public class FavouriteMovieViewModel extends AndroidViewModel {

    private static final String TAG = "FavouriteMovieViewModel";
    private final MovieDao movieDao;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();

    public FavouriteMovieViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDatabase.getInstance(application).movieDao();
    }
    public LiveData<List<Movie>> getMovies() {
        return movieDao.getAllFavouriteMovies();
    }
}
