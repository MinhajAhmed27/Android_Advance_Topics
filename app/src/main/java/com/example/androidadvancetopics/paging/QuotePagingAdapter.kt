package com.example.androidadvancetopics.paging

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.androidadvancetopics.R
import com.example.androidadvancetopics.model.Quotes

class QuotePagingAdapter : PagingDataAdapter<Quotes, QuotePagingAdapter.QuoteViewHolder>(DIFF_CALL_BACK_COMPARATOR) {

    class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val quote = itemView.findViewById<TextView>(R.id.quote)
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        val item = getItem(position)
        if (item != null){
            holder.quote.text = item.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quote,parent,false)
        return QuoteViewHolder(view)
    }

    companion object{
        private val DIFF_CALL_BACK_COMPARATOR = object: DiffUtil.ItemCallback<Quotes>(){
            override fun areItemsTheSame(oldItem: Quotes, newItem: Quotes): Boolean {
                return oldItem._id == newItem._id
            }

            override fun areContentsTheSame(oldItem: Quotes, newItem: Quotes): Boolean {
                return oldItem == newItem
            }
        }
    }

}