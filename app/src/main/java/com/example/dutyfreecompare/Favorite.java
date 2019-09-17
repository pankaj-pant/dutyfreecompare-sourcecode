package com.example.dutyfreecompare;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Favorite extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem0 = menu.getItem(0);
        MenuItem menuItem1 = menu.getItem(1);
        MenuItem menuItem2 = menu.getItem(2);
        MenuItem menuItem3 = menu.getItem(3);
        menuItem1.setChecked(true);



        menuItem0.setEnabled(false);
        menuItem2.setEnabled(false);
        menuItem3.setEnabled(false);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent0 = new Intent(Favorite.this, Location.class);
                        startActivity(intent0);
                        break;

                    case R.id.favorite:

                        break;

                    case R.id.profile:
                        Intent intent2 = new Intent(Favorite.this, Profile.class);
                        startActivity(intent2);
                        break;

                    case R.id.shopping_cart:
                        Intent intent3 = new Intent(Favorite.this, ShoppingCart.class);
                        startActivity(intent3);
                        break;
                }
                return false;
            }
        });


    }
}
