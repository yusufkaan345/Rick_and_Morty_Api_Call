package com.example.kitaplaruygulamas.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retrofitBuilder {
    companion object{
        fun getClient(baseurl:String): Retrofit {
            return Retrofit.Builder().baseUrl(baseurl).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}