package com.example.dutyfreecompare;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Location extends AppCompatActivity {

    private static final String TAG = "Location";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mPrices = new ArrayList<>();

    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    private ArrayList<String> mPrices2 = new ArrayList<>();

    private ArrayList<String> mNames3 = new ArrayList<>();
    private ArrayList<String> mImageUrls3 = new ArrayList<>();
    private ArrayList<String> mPrices3 = new ArrayList<>();

    TextView cityName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);


        //To highlight the icons in the bottom navigation menu
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:

                        break;

                    case R.id.favorite:
                        Intent intent1 = new Intent(Location.this, Favorite.class);
                        startActivity(intent1);
                        break;

                    case R.id.profile:
                        Intent intent2 = new Intent(Location.this, Profile.class);
                        startActivity(intent2);
                        break;

                    case R.id.shopping_cart:
                        Intent intent3 = new Intent(Location.this, ShoppingCart.class);
                        startActivity(intent3);
                        break;
                }
                return false;
            }
        });




        getImages();
        getImages2();
        getImages3();

        //Change Location Button
        Button changeLocationBtn = (Button) findViewById(R.id.changeLocationBtn);
        changeLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ChooseLocation.class);
                startActivity(startIntent);
            }
        });


        cityName = (TextView) findViewById(R.id.cityName);
        cityName.setText(getIntent().getStringExtra("city"));


    }

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/03/08/22/26/vodka-2127990_1280.jpg");
        mNames.add("Finlandia Vodka");
        mPrices.add("15 euros");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/08/01/11/04/jack-daniels-2564534_1280.jpg");
        mNames.add("Jack Daniel's");
        mPrices.add("12 euros");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/03/14/11/41/perfume-2142824_1280.jpg");
        mNames.add("Perfume Lady");
        mPrices.add("35 euros");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/08/01/23/28/manicure-870857_1280.jpg");
        mNames.add("Nail Polish");
        mPrices.add("9 euros");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/05/09/19/12/sunglasses-1382261_1280.jpg");
        mNames.add("Sunglasses");
        mPrices.add("75 euros");

        initRecyclerView();


    }


    private void getImages2(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls2.add("https://cdn.pixabay.com/photo/2013/10/11/16/49/cream-194126_1280.jpg");
        mNames2.add("Skin Care");
        mPrices2.add("35 euros");

        mImageUrls2.add("https://cdn.pixabay.com/photo/2016/10/22/20/55/makeup-brush-1761648_1280.jpg");
        mNames2.add("Make Up Kit");
        mPrices2.add("40 euros");

        mImageUrls2.add("https://cdn.pixabay.com/photo/2019/07/18/12/21/whiskey-4346315_1280.jpg");
        mNames2.add("Chivas Regal");
        mPrices2.add("15 euros");

        mImageUrls2.add("https://cdn.pixabay.com/photo/2017/05/10/07/57/vodka-2300113_1280.jpg");
        mNames2.add("Our/Berlin");
        mPrices2.add("29 euros");

        mImageUrls2.add("https://cdn.pixabay.com/photo/2017/02/11/14/19/valentines-day-2057745_1280.jpg");
        mNames2.add("Chocolates");
        mPrices2.add("12 euros");


        initRecyclerView2();

    }

    private void getImages3(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls3.add("https://cdn.pixabay.com/photo/2018/08/14/17/11/clock-3606045_1280.jpg");
        mNames3.add("CK Wristwatch");
        mPrices3.add("90 euros");

        mImageUrls3.add("https://cdn.pixabay.com/photo/2017/09/15/15/59/clock-2752610_1280.jpg");
        mNames3.add("Tissot Wristwatch");
        mPrices3.add("350 euros");

        mImageUrls3.add("https://cdn.pixabay.com/photo/2016/07/06/09/47/champagne-1500249_1280.jpg");
        mNames3.add("Moet & Chandon");
        mPrices3.add("55 euros");

        mImageUrls3.add("https://cdn.pixabay.com/photo/2014/02/26/10/55/camera-275007_1280.jpg");
        mNames3.add("Sony Camera");
        mPrices3.add("529 euros");

        mImageUrls3.add("https://cdn.pixabay.com/photo/2015/09/05/00/31/calvin-klein-923529_1280.jpg");
        mNames3.add("CK Summer");
        mPrices3.add("33 euros");


        initRecyclerView3();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mPrices);
        recyclerView.setAdapter(adapter);
    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames2, mImageUrls2, mPrices2);
        recyclerView.setAdapter(adapter);
    }

    private void initRecyclerView3(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView3);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames3, mImageUrls3, mPrices3);
        recyclerView.setAdapter(adapter);
    }



}
