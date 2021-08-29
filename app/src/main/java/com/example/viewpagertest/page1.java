package com.example.viewpagertest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class page1 extends Fragment {

    private ArrayList<Coin> list;
    private Page1Adapter adapter;
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRv(view);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
        list.add(new Coin(R.drawable.ic_android_black_24dp,"rgg","erge"));
    }

    private void initRv(View view) {
        adapter = new Page1Adapter();
        recyclerView = view.findViewById(R.id.rv);
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
}