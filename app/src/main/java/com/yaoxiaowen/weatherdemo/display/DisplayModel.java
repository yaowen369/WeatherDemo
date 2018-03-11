package com.yaoxiaowen.weatherdemo.display;

import com.yaoxiaowen.weatherdemo.bean.WeatherInfo;
import com.yaoxiaowen.weatherdemo.model.DataManager;
import com.yaoxiaowen.weatherdemo.utils.LogUtils;


import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * author：yaowen on 18/3/11 13:15
 * email：yaoxiaowen88@gmail.com
 * www.yaoxiaowen.com
 */

public class DisplayModel implements IDisplayContract.IDisplayModel {


    public static final String TAG = "DisplayModel";

    IDisplayContract.ModelCallBack<WeatherInfo> mCallBack = null;
    private CompositeSubscription mCompositeSubscription;
    private DataManager mDataBManager;

    private WeatherInfo mWeatherInfo = null;

    public DisplayModel(IDisplayContract.ModelCallBack<WeatherInfo> mCallBack) {
        this.mCallBack = mCallBack;
        //Todo 有注册，其实还要有解除注册
        mCompositeSubscription = new CompositeSubscription();
        mDataBManager = new DataManager();
    }



    @Override
    public void onQuery(String cityName) {
        mCompositeSubscription.add(mDataBManager.getWeatherData(cityName)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherInfo>() {
                    @Override
                    public void onCompleted() {
                        if (mWeatherInfo != null){
                            mCallBack.onsuccess(mWeatherInfo);
                        }

                        LogUtils.i(TAG, "onCompleted() ->  mWeatherInfo=" + mWeatherInfo);
                    }

                    @Override
                    public void onError(Throwable e) {
                        mCallBack.onFail("没有获取到数据");

                        LogUtils.i(TAG, "onError() ->  ");
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(WeatherInfo weatherInfo) {
                        LogUtils.i(TAG, "onNext() -> weatherInfo = " + weatherInfo);
                        mWeatherInfo = weatherInfo;
                    }
                }));
    }


}
