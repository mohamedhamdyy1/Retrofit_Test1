package com.example.retrofitmovie.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitmovie.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Movie_list_adapter extends RecyclerView.Adapter<Movie_list_adapter.movieviewholder> {
   private List<my_info>movielist=new ArrayList<>();

    @NonNull
    @Override
    public Movie_list_adapter.movieviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new movieviewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.one,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Movie_list_adapter.movieviewholder holder, int position) {
    holder.movienametv.setText(movielist.get(position).getTitle());
    }

    public void setMovielist(List<my_info> list) {
this.movielist=list;
  notifyDataSetChanged();


    }

    @Override
    public int getItemCount() {
        return movielist.size();
    }

    public class movieviewholder extends RecyclerView.ViewHolder {
        TextView movienametv;
        public movieviewholder(@NonNull View itemView) {
            super(itemView);
            movienametv=itemView.findViewById(R.id.textView);

        }
    }
}
