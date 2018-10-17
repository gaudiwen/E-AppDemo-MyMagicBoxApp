package com.gt.mymagicboxapp.choose;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.gt.mymagicboxapp.R;
import com.gt.mymagicboxapp.base.BaseActivity;
import com.gt.mymagicboxapp.utils.LogUtil;

/**
 *Time:2018/10/13
 *Author:Gaodi.
 *Description:
 */
public class ShopChooseActivity extends BaseActivity{

    @Override
    public int getLayoutId() {
        LogUtil.v("Test");
        return R.layout.activity_shopchoose;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toolbar_search:
                LogUtil.v("haha1~~");
                return true;
            case R.id.toolbar_action1:
                Log.i("haha", "toolbar_action1");
                return true;
            case R.id.toolbar_action2:
                Log.i("haha", "toolbar_action2");
                return true;
        }
        return true;
    }

}
