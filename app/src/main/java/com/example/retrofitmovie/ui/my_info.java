package com.example.retrofitmovie.ui;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class my_info
{
    private List<List<my_info>> results;
    public List<List<my_info>> getResults() {
        return results;
    }

    public my_info(String title) {

    }


      @SerializedName("poster_path")
    private String poster_path;

   @SerializedName("title")
    private  String title;

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





}
