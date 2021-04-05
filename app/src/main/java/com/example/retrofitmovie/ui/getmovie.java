package com.example.retrofitmovie.ui;

import android.graphics.Movie;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface getmovie {
 @GET("posts")
Call<List<my_info>> getPopularMovie();
}
