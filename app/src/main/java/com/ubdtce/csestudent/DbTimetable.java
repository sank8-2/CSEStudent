package com.ubdtce.csestudent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbTimetable extends SQLiteOpenHelper {

    private static final String DB_NAME = "TIMETABLE DB";
    private static final String TBL_NAME = "TIMETABLE";
    private static final String KEY_DAYS = "DAYS";
    private static final String KEY_ONE = "one";
    private static final String KEY_TWO= "two";
    private static final String KEY_THREE = "three";
    private static final String KEY_FOUR = "four";
    private static final String KEY_FIVE = "five";
    private static final String KEY_SIX = "six";
    private static final String KEY_SEVEN = "seven";
    private static final int DB_VERSION = 1;

    public DbTimetable(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TBL_NAME
                +"("+KEY_DAYS+" TEXT PRIMARY KEY,"
                +KEY_ONE+"TEXT,"
                +KEY_TWO+"TEXT,"
                +KEY_THREE+"TEXT,"
                +KEY_FOUR+"TEXT,"
                +KEY_FIVE+"TEXT,"
                +KEY_SIX+"TEXT,"
                +KEY_SEVEN+"TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
