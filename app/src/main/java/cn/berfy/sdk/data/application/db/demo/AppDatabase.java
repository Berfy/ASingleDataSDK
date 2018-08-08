package cn.berfy.sdk.data.application.db.demo;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)
public final class AppDatabase {

    //数据库名称
    public static final String NAME = "ASingleDB";
    //数据库版本号
    public static final int VERSION = 1;

}