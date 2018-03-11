package com.yaoxiaowen.weatherdemo.model;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author：yaowen on 18/3/11 15:46
 * email：yaoxiaowen88@gmail.com
 * www.yaoxiaowen.com
 */

public class RetrofitHelper {
//    private Context mContext;
    private static  RetrofitHelper ourInstance = null;


    private OkHttpClient client  = new OkHttpClient();
    GsonConverterFactory factory  = GsonConverterFactory.create(new GsonBuilder().create());
    private Retrofit mRetrofit = null;


    public static RetrofitHelper getInstance() {
        if (ourInstance == null){
            synchronized (RetrofitHelper.class){
                if (ourInstance == null){
                    ourInstance = new RetrofitHelper();
                }
            }
        }
        return ourInstance;
    }

    private RetrofitHelper() {
//        mContext = context;
        init();
    }

    private void init(){
        resetApp();
    }

    private void resetApp(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public RetrofitService getServer(){
        return mRetrofit.create(RetrofitService.class);
    }
}
