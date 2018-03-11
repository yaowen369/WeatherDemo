package com.yaoxiaowen.weatherdemo.display;

import android.text.TextUtils;

import com.yaoxiaowen.weatherdemo.bean.WeatherInfo;

/**
 * author：yaowen on 18/3/10 22:08
 * email：yaoxiaowen88@gmail.com
 * www.yaoxiaowen.com
 */

public class DisplayPresenter implements IDisplayContract.IDisplayPresenter, IDisplayContract.ModelCallBack<WeatherInfo> {

    private IDisplayContract.IDisplayView mView = null;
    private IDisplayContract.IDisplayModel mModel = null;


    public DisplayPresenter(IDisplayContract.IDisplayView mView) {
        this.mView = mView;
        mModel = new DisplayModel(this);
    }

    @Override
    public void query(String cityName) {
        mModel.onQuery(cityName);
    }

    @Override
    public boolean verifyCityName(String cityName) {
        if (TextUtils.isEmpty(cityName)
                || cityName.length()==1){

            mView.showToast("输入的城市名字不正确，请重新输入");

            return false;
        }
        return true;
    }

    @Override
    public void destory() {

    }

    @Override
    public void onsuccess(WeatherInfo data) {
        mView.displayData(data.getDate());
        mView.displayWind(data.getResults().get(0).getWeather_data().get(0).getWind());
        mView.displayWeatherInfo(data.getResults().get(0).getWeather_data().get(0).getWeather());
    }

    @Override
    public void onFail(String code) {
        mView.showToast("没有找到正确的天气");
    }
}
