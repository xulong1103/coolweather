package com.coolweather.app.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.coolweather.app.coolweather.util.LogUtil;

/**
 * Created by lenovo on 2016/4/20.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    public static final String TAG = "CoolWeatherOpenHelper";

    public static final String CREATE_PROVINCE = "create table Province (" +
            "id integer primary key autoincrement," +
            "province_name text," +
            "province_code text)";

    public static final String CREATE_CITY = "create table City (" +
            "id integer primary key autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_id integer)";

    public static final String CREATE_COUNTY = "create table County (" +
            "id integer primary key autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_id integer)";

    public CoolWeatherOpenHelper (Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        LogUtil.i(TAG, "CoolWeatherOpenHelper");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
        LogUtil.i(TAG, "onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
