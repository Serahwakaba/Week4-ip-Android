package com.moringaschool.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//    private EditText mLocationEditText;
//    private Button mFindCountrysButton;
     @BindView(R.id.findCountriesButton) Button mFindCountrysButton;
     @BindView(R.id.locationEditText) EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
////        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
////        mFindCountrysButton = (Button) findViewById(R.id.mFindCountrysButton);
        mFindCountrysButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivity.this, Country.class);
//                intent.putExtra("location", location);
//                startActivity(intent);
            }
        });
    }
}