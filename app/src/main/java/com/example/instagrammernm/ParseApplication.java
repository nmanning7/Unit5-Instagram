package com.example.instagrammernm;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Lu9Gn0a8gObJBPZPLjx43APZnXhkOwFoz4wemRkd")
                .clientKey("2OgpgXe6UlpjQfOWivBWDkNqnM0FQDnEIxY66fDv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
