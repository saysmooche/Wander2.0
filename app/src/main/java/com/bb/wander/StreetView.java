package com.bb.wander;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.libraries.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.libraries.maps.StreetViewPanorama;
import com.google.android.libraries.maps.SupportStreetViewPanoramaFragment;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;

public class StreetView extends AppCompatActivity implements OnStreetViewPanoramaReadyCallback{

        private static final LatLng ATLANTA = new LatLng(33.911492, -84.485002);
        private static final float ZOOM_BY = 0.5f;

        private StreetViewPanorama mStreetViewPanorama;

        @Override
        protected void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.streetview);

            SupportStreetViewPanoramaFragment streetViewPanoramaFragment =
                    (SupportStreetViewPanoramaFragment)
                            getSupportFragmentManager().findFragmentById(R.id.streetviewpanorama);
            streetViewPanoramaFragment.getStreetViewPanoramaAsync(
                    new OnStreetViewPanoramaReadyCallback() {
                        @Override
                        public void onStreetViewPanoramaReady(StreetViewPanorama panorama) {
                            if (savedInstanceState == null) {
                                panorama.setPosition(ATLANTA);
                            }
                        }
                    });
        }

        StreetViewPanoramaCamera camera = new StreetViewPanoramaCamera.Builder()
                    .zoom(mStreetViewPanorama.getPanoramaCamera().zoom + ZOOM_BY)
                    .tilt(mStreetViewPanorama.getPanoramaCamera().tilt)
                    .bearing(mStreetViewPanorama.getPanoramaCamera().bearing)
                    .build();

    @Override
    public void onStreetViewPanoramaReady(StreetViewPanorama streetViewPanorama) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    }
