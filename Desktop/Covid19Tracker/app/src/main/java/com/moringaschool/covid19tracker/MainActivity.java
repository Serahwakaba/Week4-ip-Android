package com.moringaschool.covid19tracker;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.covid19tracker.adapter.CustomAdapter;
import com.moringaschool.covid19tracker.model.Countrymodel;
import com.moringaschool.covid19tracker.network.GetDataService;
import com.moringaschool.covid19tracker.network.RetrofitClientInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressDialog progressDialog;
    LinearLayoutManager layoutManager;
    CustomAdapter adapter;
    List<Countrymodel> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.customRecyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new CustomAdapter(dataList);
        recyclerView.setAdapter(adapter);
        fetchCountrymodel();
        private void fetchCountrymodel(){

        }

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();



//        /*Create handle for the RetrofitInstance interface*/
//        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
//        Call<List<Countrymodel>> call = service.getAllCountries();
//        call.enqueue(new Callback<List<Countrymodel>>() {
//            @Override
//            public void onResponse(Call<List<Countrymodel>> call, Response<List<Countrymodel>> response) {
//                progressDialog.dismiss();
//                generateDataList(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<List<Countrymodel>> call, Throwable t) {
//                progressDialog.dismiss();
//                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    /*Method to generate List of data using RecyclerView with custom adapter*/
//    private void generateDataList(List<Countrymodel> countryList) {
//        recyclerView = findViewById(R.id.customRecyclerView);
//        adapter = new CustomAdapter(this,countryList);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
//
//
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://corona.lmao.ninja/v2/all/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        GetDataService getDataService = retrofit.create(GetDataService.class);
//        Call<List<Countrymodel>> call = getDataService.getAllCountries();
//        call.enqueue(new Callback<List<Countrymodel>>() {
//            @Override
//            public void onResponse(Call<List<Countrymodel>> call, Response<List<Countrymodel>> response) {
//                if (!response.isSuccessful()){
//                    recyclerView.setAdapter(adapter);
//                    return;
//                }
//           List<Countrymodel> Posts= response.body();
//                for(int j=0;j<recyclerView.length();j++){
////                    String content = "";
////                    content += "flag: " +post.getFlag() + "\n";
////                    content += "cases: " +post.getCases() + "\n";
////                    content += "todayCases: " +post.getTodayCases() + "\n";
////                    content += "deaths: " +post.getDeaths() + "\n";
////                    recyclerView.append(content);
//                    Countrymodel myListData = new Countrymodel();
//                    myListData.setCases(myListData.getCases("cases"));
//                    myListData.setDeaths(myListData.getCountry("deaths"));
//                    myListData.setCritical(myListData.getCritical("critical));
//                    myListData.setRecovered(myListData.getRecovered("recovered"));
//                    myListData.setTodayCases(myListData.getFlag("todayCases"));
//                    dataList.add(myListData);
//
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Countrymodel>> call, Throwable t) {
//                RecyclerView.setText(t.getMessage());
//
//            }
//        });

    }
}