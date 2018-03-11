package com.yaoxiaowen.weatherdemo.model;


import com.yaoxiaowen.weatherdemo.bean.WeatherInfo;

//import io.reactivex.Observable;

import rx.Observable;

/**
 * author：yaowen on 18/3/11 15:45
 * email：yaoxiaowen88@gmail.com
 * www.yaoxiaowen.com
 */

public class DataManager {

    private RetrofitService mRetrofitService;

    public DataManager() {
        this.mRetrofitService = RetrofitHelper.getInstance().getServer();
    }

    public Observable<WeatherInfo> getWeatherData(String cityName){
        return mRetrofitService.getWeatherData(cityName, "json", "9IFC7MPIPL3mLy8GUVMwYSNE");
    }
}
