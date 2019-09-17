package com.example.dutyfreecompare;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class ItemGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_gallery);

        getIncomingIntent();

    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_names")&&
             getIntent().hasExtra("image_prices")){
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_names");
            String imagePrice = getIntent().getStringExtra("image_prices");

            setImage(imageUrl, imageName, imagePrice);
        }
    }

    private void setImage(String imageUrl, String imageName, String imagePrice){
        TextView name = findViewById(R.id.item_description);
        name.setText(imageName);

        TextView price = findViewById(R.id.item_price);
        price.setText(imagePrice);

        ImageView image = findViewById(R.id.itemImage);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);

    }

}
