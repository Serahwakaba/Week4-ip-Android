package com.moringaschool.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Country extends AppCompatActivity {
    private TextView mLocationTextView;
    private ListView mListView;
    private String[] restaurants = new String[] {"Algeria","Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cameroon",
            "Cabo Verde", "Central African Republic", "Chad", "Comoros", "Congo", "the Democratic Republic of Congo",
            "Cote d'Ivoire", "Djibouti", "Equatorial Guinea", "Egypt", "Eritrea", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        mListView = (ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
//        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(Country.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });
//
//        Intent intent = getIntent();
//        String location = intent.getStringExtra("location");
//        mLocationTextView.setText("Here are the countries affected by Covid19 in " + location);
//    }
//}