package com.notes.andoy.simplenotetakingapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper
{
    public static final String TAG = "DbHelper";
    public static final String DB_Name = "app_notes.db";
    public static final int DB_Version = 1;

    public static final String TABLE_NOTES = "notes";
    public static final String COL_ID = "id";
    public static final String COL_TITLE = "title";
    public static final String COL_BODY = "body";
    public static final String COL_CREATED = "created_at";
    public static final String COL_UPDATED = "updated_at";



    public DbHelper(Context context)
    {
        super(context, DB_Name, null, DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String createNotesTable = "CREATE TABLE " + TABLE_NOTES + "(" +
                COL_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                COL_TITLE + "TEXT," +
                COL_BODY + "TEXT," +
                COL_CREATED + "TEXT," +
                COL_UPDATED + "TEXT" + ")";

        sqLiteDatabase.execSQL(createNotesTable);
        Log.d(TAG,createNotesTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }

}


