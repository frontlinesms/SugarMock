package com.orm;

public class SugarApp extends android.app.Application {
    private static SugarApp sugarContext;

    public void onCreate(){
        super.onCreate();
        SugarApp.sugarContext = this;
    }

    public void onTerminate(){
        super.onTerminate();
    }

    public static SugarApp getSugarContext(){
        return sugarContext;
    }

    protected Object getDatabase() {
        return null;
    }
}
