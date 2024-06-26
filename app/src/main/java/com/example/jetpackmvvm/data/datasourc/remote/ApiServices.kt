package com.example.jetpackmvvm.data.datasourc.remote

import Products
import com.example.jetpackmvvm.data.model.Product
import com.example.jetpackmvvm.data.model.profile.UserProfile
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

    @GET("products")
    suspend fun getProductsList():  Products

    @GET("product/{productId}")
    suspend fun getProductById(@Path("productId") productId: Int): Product

    @GET("users/{userId}")
    suspend fun getUserProfile(@Path("userId") productId: Int): UserProfile

}