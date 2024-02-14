package com.example.hw3_3mon;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GirlsViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTv;
    public GirlsViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.name_tv);
    }

    public void onBind(String girlsName){
        nameTv.setText(girlsName);
    }
}
