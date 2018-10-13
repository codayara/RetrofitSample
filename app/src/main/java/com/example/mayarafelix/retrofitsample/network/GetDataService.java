package com.example.mayarafelix.retrofitsample.network;

import com.example.mayarafelix.retrofitsample.models.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
