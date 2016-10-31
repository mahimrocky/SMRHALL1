package com.msttech.smrhall;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mahim on 10/3/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "profile.db";
    private static final String TABLE_NAME = "userprofile";
    private static final String COLUMN_1 = "id";
    private static final String COLUMN_2 = "username";
    private static final String COLUMN_3 = "password";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + TABLE_NAME + " (" + COLUMN_1 + " integer primary key autoincrement," +
                " " + COLUMN_2 + " text, " + COLUMN_3 + " text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String username, String password){

        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_2,username);
        contentValues.put(COLUMN_3, password);

        long result = database.insert(TABLE_NAME,null,contentValues);
        if(result == -1){
            return false;
        }else{
            return true;
        }

    }

    public Cursor getData() {

        SQLiteDatabase database = this.getWritableDatabase();
        Cursor res = database.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public boolean updateData(String id, String username, String password) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_1, id);
        contentValues.put(COLUMN_2, username);
        contentValues.put(COLUMN_3, password);

        database.update(TABLE_NAME,contentValues,"id = ?", new String[]{id});

        return true;
    }
}
