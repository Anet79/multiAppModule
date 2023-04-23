package com.anet.common;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textview.MaterialTextView;

public abstract class Activity_StatsParent extends AppCompatActivity {


    private MaterialTextView result;
    public LinearLayout layout;
    private ImageView result_IVW_image_view;

    protected abstract String getData();
    protected abstract Drawable setBg();
    protected abstract int setPhoto();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_parent);

        findViews();
        updateUI();
    }

    @SuppressLint("SetTextI18n")
    private void updateUI() {
        layout.setBackground(setBg());
        result_IVW_image_view.setImageResource(setPhoto());
        result.setText(""+getData());
    }

    private void findViews() {
        result = findViewById(R.id.result);
        layout = findViewById(R.id.layout);
        result_IVW_image_view=findViewById(R.id.result_IVW_image_view);
    }

}
