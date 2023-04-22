package com.hrisheekesh.animation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageeRecylcerAdapter(val context: Context, val itemList: ArrayList<String>) : RecyclerView.Adapter<LanguageeRecylcerAdapter.ContentViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_language_single_row, parent, false)

        return  ContentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        val text = itemList[position]
        holder.textView.text = text
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ContentViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.textView)
    }

}

