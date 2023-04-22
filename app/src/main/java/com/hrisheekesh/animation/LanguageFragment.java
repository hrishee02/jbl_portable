package com.hrisheekesh.animation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class LanguageFragment extends Fragment {

    private ArrayList<MyLang> list = new ArrayList<>();
    private RecyclerView recyclerView;
    View view;

    private String[] langlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_language, container, false);
        buildListData();


        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        LanguageRecyclerAdapter languageRecyclerAdapter = new LanguageRecyclerAdapter(getContext(),list);
        recyclerView.setAdapter(languageRecyclerAdapter);

        return view;
    }




    private void buildListData(){

        list = new ArrayList<>();
        langlist = new String[]{
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
               getString(R.string.english),
       };

        for (int i = 0; i< langlist.length; i++){
            MyLang myLang = new MyLang(langlist[i]);
            list.add(myLang);
        }
    }

}