package com.fabioclaret.bancodedadossqliteetim.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.fabioclaret.bancodedadossqliteetim.datamodel.ClienteDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String DB_NAME = "AppEtim.sqlite";
    public static final int VERSION    = 1;

    public AppDataBase( Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
