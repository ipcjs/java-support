package com.github.ipcjs.fis.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java7.util.Objects;
import java8.util.function.Function;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean equals = Objects.equals(1, 2);
    }

    public void test(Function<String, String> fun) {
        String result = fun.apply("xx");
    }
}
