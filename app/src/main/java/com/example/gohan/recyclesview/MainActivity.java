package com.example.gohan.recyclesview;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.ApplicationTestCase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
     */
    public static class ApplicationTest extends ApplicationTestCase<Application> {
        public ApplicationTest() {
            super(Application.class);
        }
    }
}
