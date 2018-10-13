package com.example.mayarafelix.retrofitsample.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mayarafelix.retrofitsample.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    private View view;
    private TextView titleView;
    private ImageView coverImageView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        view = itemView;
        titleView = view.findViewById(R.id.title);
        coverImageView = view.findViewById(R.id.coverImage);
    }

    // Getters

    public View getView() {
        return view;
    }

    public TextView getTitleView() {
        return titleView;
    }

    public ImageView getCoverImageView() {
        return coverImageView;
    }

    // Setters

    public void setView(View view) {
        this.view = view;
    }

    public void setTitleView(TextView titleView) {
        this.titleView = titleView;
    }

    public void setCoverImageView(ImageView coverImageView) {
        this.coverImageView = coverImageView;
    }
}
