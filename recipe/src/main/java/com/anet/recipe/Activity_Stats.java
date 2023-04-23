package com.anet.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

import com.anet.common.Activity_StatsParent;
import com.anet.common.utils.MSP;

public class Activity_Stats extends Activity_StatsParent {


    private float celsius, fahrenheit;

    private String title, description, subTitle;

    @Override
    protected String getData() {

        title= MSP.getInstance().getString("title","Hey");
        description=MSP.getInstance().getString("description","body");
        if (title.matches("")) {
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
            return "sfsfd";
        }
        else
            return "Title:\t"+title +"\n\n Your Recipe details :\t\n\t"+ description + "\n";
    }

    @Override
    protected Drawable setBg() {
        return getDrawable(com.anet.common.R.drawable.main_bg_b);
    }

    @Override
    protected int setPhoto() {
        return com.anet.common.R.drawable.ic_recipe_book;
    }
}