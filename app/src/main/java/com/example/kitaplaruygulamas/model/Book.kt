package com.example.kitaplaruygulamas.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Book(
    @SerializedName(value = "image")@Expose var bookImage:String,
    @SerializedName(value = "name")@Expose var bookName:String,
)  :Serializable
