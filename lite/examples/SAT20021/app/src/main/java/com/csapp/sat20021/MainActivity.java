package com.csapp.sat20021;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.share.widget.ShareButton;

public class MainActivity extends AppCompatActivity {
ShareButton shareButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shareButton= findViewById(R.id.facebook_shareid);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Share facebook",Toast.LENGTH_SHORT).show();
            }
        });

    }
}