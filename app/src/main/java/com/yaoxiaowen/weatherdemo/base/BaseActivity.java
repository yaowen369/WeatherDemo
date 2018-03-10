package com.yaoxiaowen.weatherdemo.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yaoxiaowen.weatherdemo.utils.ToastUtils;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener, BaseView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initData();
        initView();
        initListener();
    }


    protected abstract @LayoutRes int getLayoutId();
    protected abstract void initData();
    protected abstract void initView();
    protected abstract void initListener();

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showToast(String content) {
        ToastUtils.showToast(this, content);
    }
}
