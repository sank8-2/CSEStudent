package com.ubdtce.csestudent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "STUDENT INFO";
    private static final String TBL_NAME = "STUDENT";
    private static final String TBL_2_NAME = "MARKS";
    private static final String KEY_NAME = "NAME";
    private static final String KEY_USN = "USN";
    private static final String KEY_EMAIL= "EMAIL";
    private static final String KEY_PHONE = "PHONE";
    private static final String KEY_PASS = "PASSWORD";
    private static final int DB_VERSION = 1;


    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TBL_NAME
                +"("+KEY_NAME+" TEXT,"
                +KEY_USN+" TEXT PRIMARY KEY,"
                +KEY_EMAIL+" TEXT,"
                +KEY_PHONE+" TEXT,"
                +KEY_PASS+" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TBL_NAME);
        onCreate(db);
    }
}
