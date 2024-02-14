package com.example.hw3_3mon;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GirlsAdapter extends RecyclerView.Adapter<GirlsViewHolder> {

    private ArrayList<String> girlNameList;

    public GirlsAdapter(ArrayList<String> girlNameList) {
        this.girlNameList = girlNameList;
    }

    @NonNull
    @Override
    public GirlsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GirlsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.girls_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GirlsViewHolder holder, int position) {
        holder.onBind(girlNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return girlNameList.size();
    }
}
