package com.example.retrofitmovie.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitmovie.R;
import com.example.retrofitmovie.pojo.JsonConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
getmovie getmovie;
    Movie_list_adapter movie_list_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      RecyclerView recyclerView=findViewById(R.id.recycle);
        movie_list_adapter= new Movie_list_adapter();
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(movie_list_adapter);


        retrofetadpter.getInstans().getpost().enqueue(new Callback<List<my_info>>() {
            @Override
            public void onResponse(Call<List<my_info>> call, Response<List<my_info>> response) {
                movie_list_adapter.setMovielist(response.body());

            }

            @Override
            public void onFailure(Call<List<my_info>> call, Throwable t) {

            }});
















       //       final Movie_list_adapter adapter=new Movie_list_adapter();
//        RecyclerView myrecycle=findViewById(R.id.recycle);
//        myrecycle.setAdapter(adapter);
//        myrecycle.setLayoutManager(new LinearLayoutManager(this));
//        Map<String, String> page_number = new HashMap<String, String>();
//        Gson gson=new GsonBuilder().serializeNulls().create();
//        HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor();
//        loggingInterceptor .setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient okHttpClient=new OkHttpClient.Builder()
//                .addInterceptor(loggingInterceptor).build();
//        Retrofit retrofit=new Retrofit.Builder().baseUrl(JsonConstants.BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient).build();
//
//
//
//
//
//
//        getmovie=retrofit.create(com.example.retrofitmovie.ui.getmovie.class);
//        Call<my_info> call=getmovie.getPopularMovie(JsonConstants.Api_Key,page_number);
//       call.enqueue(new Callback<my_info>() {
//           @Override
//           public void onResponse(Call<my_info> call, Response<my_info> response) {
//               adapter.setMovielist(response.body().getResults());
//           }
//
//           @Override
//           public void onFailure(Call<my_info> call, Throwable t) {
//               Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
//           }
//       });
//
//
   }




}