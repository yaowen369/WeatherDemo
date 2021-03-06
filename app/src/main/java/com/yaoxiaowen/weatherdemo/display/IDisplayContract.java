package com.yaoxiaowen.weatherdemo.display;

import android.support.annotation.DrawableRes;

import com.yaoxiaowen.weatherdemo.base.BaseModel;
import com.yaoxiaowen.weatherdemo.base.BasePresenter;
import com.yaoxiaowen.weatherdemo.base.BaseView;

/**
 * author：yaowen on 18/3/10 21:28
 * email：yaoxiaowen88@gmail.com
 * www.yaoxiaowen.com
 */

public interface IDisplayContract {

    interface IDisplayView extends BaseView{
        void displayData(String date);
        void displayWind(String wind);
        void displayWeatherInfo(String weatherInfo);
        void displayLocalImage(@DrawableRes int localImg);
        void displayUrlImage(String url);
    }

    interface IDisplayModel extends BaseModel{
        void onQuery(String cityName);
    }

    interface IDisplayPresenter extends BasePresenter{
        void query(String cityName);
        boolean verifyCityName(String cityName);
    }


    interface ModelCallBack<T>{
        void onsuccess(T data);
        void onFail(String code);
    }

}
