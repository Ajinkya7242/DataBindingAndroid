package com.example.algebricequationdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.algebricequationdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        MyEquation myEquation=new MyEquation(activityMainBinding);

        activityMainBinding.setMyequation(myEquation);

    }
}
