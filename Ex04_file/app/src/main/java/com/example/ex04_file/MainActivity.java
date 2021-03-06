package com.example.ex04_file;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.button1:
                intent = new Intent(this, ResourceActivity.class);
                break;
            case R.id.button2:
                intent = new Intent(this, ReadWriteActivity.class);
                break;
            case R.id.button3:
                intent = new Intent(this, ExternalActivity.class);
                break;
            case R.id.button4:
                intent = new Intent(this, BackupActivity.class);
                break;
        }
        startActivity(intent);
    }

}
