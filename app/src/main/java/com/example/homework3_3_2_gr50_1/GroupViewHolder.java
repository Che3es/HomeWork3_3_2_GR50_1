package com.example.homework3_3_2_gr50_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroupViewHolder extends RecyclerView.ViewHolder {
    private TextView groupName;
    public GroupViewHolder(@NonNull View itemView) {
        super(itemView);

        groupName = itemView.findViewById(R.id.group_name);
    }
    public void bind(String name){
        groupName.setText(name);
    }
}
