package com.example.brijesh.chatapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.brijesh.chatapplication.R;


public class ChatHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView time;
    public TextView msg;

    public ChatHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.tv_name);
        msg = (TextView) itemView.findViewById(R.id.tv_chatMsg);
        time = (TextView) itemView.findViewById(R.id.tv_time);
    }
}
