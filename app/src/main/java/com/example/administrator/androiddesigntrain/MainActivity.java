package com.example.administrator.androiddesigntrain;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2018/4/8.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cfClick(View view) {
        startActivity(new Intent(this, CoordinatorActivity.class));
    }

    public void csClick(View view) {
        startActivity(new Intent(this, CollapsingActivity.class));
    }

    public void dnClick(View view) {
        startActivity(new Intent(this, TabNavDrawerActivity.class));
    }


}
