package com.example.kitaplaruygulamas.network

import com.example.kitaplaruygulamas.response.BookResponse
import retrofit2.Call
import retrofit2.http.GET

interface BookDaoInterface {

    @GET(value = "api/character/")
    fun getBooks():Call<BookResponse>
}