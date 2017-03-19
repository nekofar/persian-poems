package com.nekofar.milad.persianpoems;

import com.nekofar.milad.persianpoems.models.Category;
import com.nekofar.milad.persianpoems.models.Poem;
import com.nekofar.milad.persianpoems.models.Poet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GanjoorService {

    @GET("poets")
    Call<List<Poet>> getPoets();

    @GET("poets/{id}")
    Call<Poet> getPoet(@Path("id") int id);

    @GET("categories/{categoryId}")
    Call<List<Category>> getCategories(@Path("categoryId") int categoryId);

    @GET("categories/byPoet/{id}")
    Call<List<Category>> getCategoriesByPoet(@Path("id") int id);

    @GET("poems/{id}")
    Call<List<Poem>> getPoems(@Path("id") int id);

    @GET("poems/byCategory/{id}")
    Call<List<Poem>> getPoemsByCategory(@Path("id") int id);
    
}

