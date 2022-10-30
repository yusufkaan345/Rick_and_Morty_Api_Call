package com.example.kitaplaruygulamas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kitaplaruygulamas.model.Book
import com.squareup.picasso.Picasso

class BookAdapter(var bookList:List<Book>):RecyclerView.Adapter<BookAdapter.viewHolder>() {
    class viewHolder(view:View):RecyclerView.ViewHolder(view){
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.book_item,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.bookTextView).text=bookList[position].bookName
        var image=holder.itemView.findViewById<ImageView>(R.id.bookImageView)
        Picasso.get().load(bookList[position].bookImage).into(image);
    }

    override fun getItemCount(): Int {
        return  bookList.size
       }
}