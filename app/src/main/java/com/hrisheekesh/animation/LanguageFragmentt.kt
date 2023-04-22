package com.hrisheekesh.animation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class LanguageFragmentt: Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: LanguageeRecylcerAdapter
    val langList = arrayListOf("English",
        "Français",
        "Español",
        "Deutsche",
        "日本語",
        "한국어",
        "русский",
        "Português",
        "Nederlands",
          "中文",
    "Hindi")




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_language, container, false)

        recyclerView = view.findViewById(R.id.recyclerview)
        layoutManager = LinearLayoutManager(activity as Context)

        recyclerAdapter = LanguageeRecylcerAdapter(activity as Context, langList)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager


        return view
    }

    }
