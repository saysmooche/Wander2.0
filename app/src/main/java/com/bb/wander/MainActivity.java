package com.bb.wander;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

        private static final int REQUEST_LOCATION_PERMISSION = 99;
        GoogleMap mMap;
        MarkerOptions gMarkerOptions;
        private static final String TAG = "TAG_N";
        private String vt;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

//            final View img = findViewById(R.id.droid);
//            final SpringAnimation anim = new SpringAnimation(img, DynamicAnimation.TRANSLATION_Y);
//
//            anim.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);
        }

        public void getMap(View view){
            Intent intent = new Intent(this,  MapsActivity.class);
            startActivity(intent);
        }
    }
