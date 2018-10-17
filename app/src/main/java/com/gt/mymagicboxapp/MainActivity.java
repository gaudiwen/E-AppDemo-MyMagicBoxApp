package com.gt.mymagicboxapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.gt.mymagicboxapp.base.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends Activity{

    private Context mContext;

    private DropdownLayout mDropdownView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDropdownView = (DropdownLayout) findViewById(R.id.dropdown_layout);
    }

    public void onClick(View v){
        mDropdownView.toggle();
    }
}
