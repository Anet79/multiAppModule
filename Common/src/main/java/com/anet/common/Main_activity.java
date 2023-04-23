package com.anet.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.anet.common.utils.MSP;

public class Main_activity extends AppCompatActivity {


    private Button main_BTN_save;

    private EditText main_TXV_sub_title;

    private EditText main_EDT_description;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        findViews();
        initButton();

    }

    private void initButton() {
        main_BTN_save.setOnClickListener(v -> {

            MSP.getInstance().putString("description", main_EDT_description.getText().toString());
            MSP.getInstance().putString("title", main_TXV_sub_title.getText().toString());
            startActivity(new Intent(this, App_parent.statsClass));



        });
    }


    private void findViews() {
        main_BTN_save = findViewById(R.id.main_BTN_save);
        main_TXV_sub_title = findViewById(R.id.main_TXV_sub_title);
        main_EDT_description = findViewById(R.id.main_EDT_description);

    }


}
