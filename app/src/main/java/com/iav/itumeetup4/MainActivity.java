package com.iav.itumeetup4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.iav.itumeetup4.presenter.IntentPresenter;

public class MainActivity extends AppCompatActivity {
    // TODO format penamaan variable
    // TODO TypeData namaVariable(dengan syarat cammelCase)
    Button btnIntentExplicit;
    Button btnIntententImplicit;
    IntentPresenter intentPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO menyambungkan antara Java ke XML dengan bantuan findViewById
        btnIntentExplicit = findViewById(R.id.btn_intent_explicit);
        btnIntententImplicit = findViewById(R.id.btn_intent_implicit);
        intentPresenter = new IntentPresenter();
        btnIntentExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPresenter.intentExplisit(MainActivity.this);
            }
        });
        btnIntententImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPresenter.intentImplisit(MainActivity.this);
            }
        });
    }
}
