package com.yaoxiaowen.weatherdemo.model;

import com.yaoxiaowen.weatherdemo.bean.WeatherInfo;


//import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;


/**
 * author：yaowen on 18/3/11 15:36
 * email：yaoxiaowen88@gmail.com
 * www.yaoxiaowen.com
 */

public interface RetrofitService {
    // http://api.map.baidu.com/telematics/v3/weather?location=杭州&output=json&ak=9IFC7MPIPL3mLy8GUVMwYSNE


    @GET("telematics/v3/weather")
    Observable<WeatherInfo> getWeatherData(@Query("location") String location,
                                           @Query("output") String output,
                                           @Query("ak") String ak);
}
