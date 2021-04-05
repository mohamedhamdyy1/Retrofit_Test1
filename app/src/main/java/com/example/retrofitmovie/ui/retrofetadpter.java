package com.example.retrofitmovie.ui;

import com.example.retrofitmovie.pojo.JsonConstants;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofetadpter {
    getmovie post_interface;
    private static retrofetadpter instans ;
    private static  String url = JsonConstants.BASE_URL;



        retrofetadpter() {
         Retrofit builder = new Retrofit.Builder().
            baseUrl(url).
            addConverterFactory(GsonConverterFactory.create()).build();
           post_interface=builder.create(getmovie.class);




     }

    public static retrofetadpter getInstans() {
        if (null==instans)
        {
            instans=new retrofetadpter();
        }
        return instans;
    }
  public Call<List<my_info>> getpost(){
       return post_interface.getPopularMovie() ;
  }
}
