package com.yaoxiaowen.weatherdemo.display;



import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

import com.yaoxiaowen.weatherdemo.R;
import com.yaoxiaowen.weatherdemo.base.BaseActivity;



public class DiaplayActivity extends BaseActivity implements IDisplayContract.IDisplayView {

    public static final String TAG = "DiaplayActivity";

    private IDisplayContract.IDisplayPresenter presenter = null;

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
        presenter = new DisplayPresenter(this);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }


    @OnClick(R.id.queryBtn)
    public void onQueryClick(View view){
        String cityName = cityEt.getText().toString().trim();

        //Todo 测试数据 ，虚拟机的模拟键盘太恶心了
        cityName = "杭州";

        if (presenter.verifyCityName(cityName)){
            presenter.query(cityName);
        }
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
