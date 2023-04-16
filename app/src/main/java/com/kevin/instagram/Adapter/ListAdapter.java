package com.kevin.instagram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kevin.instagram.Model;
import com.kevin.instagram.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.InstaHolder> {
    ArrayList<Model> datalist;
    Context context;

    public ListAdapter(ArrayList<Model> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public ListAdapter.InstaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new InstaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.InstaHolder holder, int position) {
        holder.username.setText(datalist.get(position).username);
        Glide.with(context).load(datalist.get(position).dp).into(holder.dp);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class InstaHolder extends RecyclerView.ViewHolder{
        CircleImageView dp;
        TextView username;
        public InstaHolder(@NonNull View itemView) {
            super(itemView);
            dp = itemView.findViewById(R.id.dp);
            username = itemView.findViewById(R.id.username);
        }
    }
}
