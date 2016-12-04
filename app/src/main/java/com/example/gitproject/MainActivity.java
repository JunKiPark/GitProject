package com.example.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(applyOverrideConfiguration(), "깃허브 연동 테스트", Toast.LENGTH_SHORT).show();
    }
}
