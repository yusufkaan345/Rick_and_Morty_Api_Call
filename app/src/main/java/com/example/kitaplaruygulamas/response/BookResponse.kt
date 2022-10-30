package com.example.kitaplaruygulamas.response

import com.example.kitaplaruygulamas.model.Book
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BookResponse(
    @SerializedName(value = "results") @Expose var books:List<Book>,
)