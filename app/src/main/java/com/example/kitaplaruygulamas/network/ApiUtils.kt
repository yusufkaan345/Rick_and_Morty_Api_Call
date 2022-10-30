package com.example.kitaplaruygulamas.network

import retrofit2.create

class ApiUtils {

    companion object{
        private const val BASE_URL="https://rickandmortyapi.com/"//api/character/

        fun getBooksDaoInterface():BookDaoInterface{
            return retrofitBuilder.getClient(BASE_URL).create(BookDaoInterface::class.java)
        }
    }
}