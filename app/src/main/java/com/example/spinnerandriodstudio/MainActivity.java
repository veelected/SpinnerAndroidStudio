package com.example.spinnerandriodstudio;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Countryitem> mcountryList;
    private CountryAdapter madapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
        Spinner spinnerCountries = findViewById(R.id.spinner_countries);

        madapter = new CountryAdapter(this, mcountryList);
        spinnerCountries.setAdapter(madapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Countryitem clickedItem = (Countryitem) adapterView.getItemAtPosition(i);
                String clickedCountryName = clickedItem.getmCOuntryname();
                Toast.makeText(MainActivity.this, clickedCountryName + " Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    private void initList() {
        mcountryList = new ArrayList<>();
        mcountryList.add(new Countryitem("USA", R.drawable.usa3));
        mcountryList.add(new Countryitem("India", R.drawable.india));
        mcountryList.add(new Countryitem("China", R.drawable.china));
        mcountryList.add(new Countryitem("Dominican\n Republic", R.drawable.dominican));
        mcountryList.add(new Countryitem("Russia", R.drawable.russian));
        mcountryList.add(new Countryitem("Canada", R.drawable.canada));
        mcountryList.add(new Countryitem("Japan", R.drawable.japan));

    }


}