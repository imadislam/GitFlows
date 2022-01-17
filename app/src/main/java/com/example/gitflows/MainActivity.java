package com.example.gitflows;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gitflows.databinding.ActivityMainBinding;
import com.example.gitflows.databinding.ActivityMainStartBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainStartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DataLoader data= new DataLoader("Expand the View","Text from Test0 Branch","Some Random data");
        binding.button.setText(data.getButtonData());
        binding.textOne.setText(data.getTopText());
        binding.textTwo.setText(data.getBottomText());

        //done some changes
    }
}

