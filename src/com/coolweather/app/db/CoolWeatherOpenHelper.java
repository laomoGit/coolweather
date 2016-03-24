package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * province表建表语句
	 */
	private static final String CREATE_PROVINCE="create table province (" 
												+"id integer primary key autoincrement,"
												+"province_name text," 
												+"province_code text)";
	/**
	 * city表建表语句
	 */
	private static final String CREATE_CITY="create table city(" +
											"id integer primary key autoincrement," +
											"city_name text," +
											"city_code text," +
											"province_id integer)";
	/**
	 * county表建表语句
	 */
	private static final String CREATE_COUNTY="create table county(" +
												"id integer primary key autoincrement," +
												"county_name text," +
												"county_code text," +
												"city_id integer)";
	
	
	@Override
	
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);//创建province表
		db.execSQL(CREATE_CITY);//创建city表
		db.execSQL(CREATE_COUNTY);//创建cuonty表
		
	}

	/**
	 * 
	 * @param context 上下文
	 * @param name 数据库名字
	 * @param factory 
	 * @param version 版本号
	 */
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	/**
	 * 版本更新
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}

}
