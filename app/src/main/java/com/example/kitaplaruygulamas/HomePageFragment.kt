package com.example.kitaplaruygulamas

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kitaplaruygulamas.databinding.FragmentHomePageBinding
import com.example.kitaplaruygulamas.model.Book
import com.example.kitaplaruygulamas.network.ApiUtils
import com.example.kitaplaruygulamas.response.BookResponse
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding

    var bookList:ArrayList<Book> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentHomePageBinding.inflate(layoutInflater)
        getBooks()
        return binding.root
    }

    private fun getBooks(){
        ApiUtils.getBooksDaoInterface().getBooks().enqueue(
            object :retrofit2.Callback<BookResponse>{
                override fun onResponse(
                    call: Call<BookResponse>,
                    response: Response<BookResponse>
                ) {
                    val tempList=response.body()?.books
                    tempList.let {
                        bookList=it as ArrayList<Book> /* = java.util.ArrayList<com.example.kitaplaruygulamas.model.Book> */
                    }
                    val bookAdapter=BookAdapter(bookList)
                    Log.d("Target",bookList[1].bookName)
                    binding.bookRecyclerView.adapter=bookAdapter
                    binding.bookRecyclerView.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
                    binding.bookRecyclerView.setHasFixedSize(true)


                }

                override fun onFailure(call: Call<BookResponse>, t: Throwable) {
                }

            }
        )
    }


}