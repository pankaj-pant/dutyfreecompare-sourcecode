package com.example.dutyfreecompare;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem0 = menu.getItem(0);
        MenuItem menuItem1 = menu.getItem(1);
        MenuItem menuItem2 = menu.getItem(2);
        MenuItem menuItem3 = menu.getItem(3);
        menuItem2.setChecked(true);


        menuItem0.setEnabled(false);
        menuItem1.setEnabled(false);
        menuItem3.setEnabled(false);

    }
}
