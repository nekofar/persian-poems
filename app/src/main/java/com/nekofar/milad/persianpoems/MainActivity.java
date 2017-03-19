package com.nekofar.milad.persianpoems;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.nekofar.milad.persianpoems.models.Poet;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new GsonBuilder()
                .serializeNulls()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://localhost:4003/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        GanjoorService service = retrofit.create(GanjoorService.class);

        Call<List<Poet>> call = service.getPoets();
        call.enqueue(new Callback<List<Poet>>() {
            @Override
            public void onResponse(Call<List<Poet>> call, Response<List<Poet>> response) {
                if (response.isSuccessful()) {
                    List<Poet> poets = response.body();

                    for (Poet poet : poets) {
                        Log.v("Poets", poet.getName());
                    }

                } else {
                    Log.e("Poets", response.errorBody() + "");
                }
            }

            @Override
            public void onFailure(Call<List<Poet>> call, Throwable t) {
                Log.e("Poets", t.getMessage() + "");
            }
        });
    }
}
