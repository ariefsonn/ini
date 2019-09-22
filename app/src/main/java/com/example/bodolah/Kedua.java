package com.example.bodolah;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Kedua extends AppCompatActivity {
    String judul;
    String desc;
    String harga;
    int image;



    TextView tv_judul, tv_desc, tv_harga;
    ImageView iv_image;
    Button btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.royyan);

        tv_judul = findViewById(R.id.Judul);
        tv_desc = findViewById(R.id.Desc);
        tv_harga = findViewById(R.id.Harga);
        iv_image = findViewById(R.id.Image);

        judul = getIntent().getStringExtra("Judul");
        tv_judul.setText(judul);
        desc = getIntent().getStringExtra("Desc");
        tv_desc.setText(desc);
        harga = getIntent().getStringExtra("Harga");
        tv_harga.setText(harga);
        image = getIntent().getIntExtra("Image", R.id.Image);
        iv_image.setImageResource(image);
        btn = findViewById(R.id.exut);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });







    }
}
