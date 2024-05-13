package com.fabioclaret.bancodedadossqliteetim.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.fabioclaret.bancodedadossqliteetim.R;
import com.fabioclaret.bancodedadossqliteetim.controller.ClienteController;
import com.fabioclaret.bancodedadossqliteetim.datamodel.ClienteDataModel;

public class MainActivity extends AppCompatActivity {
    ClienteController controller;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new ClienteController(context);
    }
}