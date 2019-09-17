package com.example.dutyfreecompare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLocation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location);

        Button helsinkiBtn = (Button) findViewById(R.id.helsinkiBtn);
        Button ouluBtn = (Button) findViewById(R.id.ouluBtn);
        Button newDelhiBtn = (Button) findViewById(R.id.newDelhiBtn);
        Button tokyoBtn = (Button) findViewById(R.id.tokyoBtn);
        Button osakaBtn = (Button) findViewById(R.id.osakaBtn);
        Button londonBtn = (Button) findViewById(R.id.londonBtn);
        Button birminghamBtn = (Button) findViewById(R.id.birminghamBtn);

        helsinkiBtn.setOnClickListener(this);
        ouluBtn.setOnClickListener(this);
        newDelhiBtn.setOnClickListener(this);
        tokyoBtn.setOnClickListener(this);
        osakaBtn.setOnClickListener(this);
        londonBtn.setOnClickListener(this);
        birminghamBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
    switch (view.getId()) {
        case R.id.helsinkiBtn:
            Intent startIntent0 = new Intent(getApplicationContext(), Location.class);
            startIntent0.putExtra("city", "Helsinki");
            startActivity(startIntent0);
            break;

        case R.id.ouluBtn:
            Intent startIntent1 = new Intent(getApplicationContext(), Location.class);
            startIntent1.putExtra("city", "Oulu");
            startActivity(startIntent1);
            break;

        case R.id.newDelhiBtn:
            Intent startIntent2 = new Intent(getApplicationContext(), Location.class);
            startIntent2.putExtra("city", "New Delhi");
            startActivity(startIntent2);
            break;

        case R.id.tokyoBtn:
            Intent startIntent3 = new Intent(getApplicationContext(), Location.class);
            startIntent3.putExtra("city", "Tokyo");
            startActivity(startIntent3);
            break;

        case R.id.osakaBtn:
            Intent startIntent4 = new Intent(getApplicationContext(), Location.class);
            startIntent4.putExtra("city", "Osaka");
            startActivity(startIntent4);
            break;

        case R.id.londonBtn:
            Intent startIntent5 = new Intent(getApplicationContext(), Location.class);
            startIntent5.putExtra("city", "London");
            startActivity(startIntent5);
            break;

        case R.id.birminghamBtn:
            Intent startIntent6 = new Intent(getApplicationContext(), Location.class);
            startIntent6.putExtra("city", "Birmingham");
            startActivity(startIntent6);
            break;


    }
    }
}
