package com.iav.itumeetup4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iav.itumeetup4.presenter.IntentPresenter;

public class Main2Activity extends AppCompatActivity {
    private IntentPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        presenter = new IntentPresenter();




    }
}
