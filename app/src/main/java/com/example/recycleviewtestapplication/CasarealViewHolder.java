package com.example.recycleviewtestapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CasarealViewHolder extends RecyclerView.ViewHolder {
    public TextView titleView;
    public TextView dataView;
    public CasarealViewHolder(@NonNull View itemView) {
        super(itemView);
        titleView = (TextView) itemView.findViewById(R.id.title);
        dataView = (TextView) itemView.findViewById(R.id.detail);
    }
}
