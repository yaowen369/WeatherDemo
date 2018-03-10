package com.yaoxiaowen.weatherdemo.display;



import android.widget.ImageView;
import android.widget.TextView;

import com.yaoxiaowen.weatherdemo.R;
import com.yaoxiaowen.weatherdemo.base.BaseActivity;

import butterknife.BindView;

public class DiaplayActivity extends BaseActivity implements IDisplayInterface.IDisplayView {

    public static final String TAG = "DiaplayActivity";

    private IDisplayInterface.IDisplayPresenter presenter = null;

    @BindView(R.id.cityEt)
    TextView cityEt;
    @BindView(R.id.queryBtn)
    TextView queryBtn;
    @BindView(R.id.dateTv)
    TextView dateTv;
    @BindView(R.id.windTv)
    TextView windTv;
    @BindView(R.id.weatherInfoTv)
    TextView weatherInfoTv;
    @BindView(R.id.localImage)
    ImageView localImage;
    @BindView(R.id.urlImage)
    ImageView urlImage;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_diaplay;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }



    @Override
    public void displayData(String date) {
        dateTv.setText(date);
    }

    @Override
    public void displayWind(String wind) {
        windTv.setText(wind);
    }

    @Override
    public void displayWeatherInfo(String weatherInfo) {
        weatherInfoTv.setText(weatherInfo);
    }

    @Override
    public void displayLocalImage(int localImg) {

    }

    @Override
    public void displayUrlImage(String url) {

    }
}
