package com.example.viewpagertest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class page3 extends Fragment implements CompoundButton.OnCheckedChangeListener{

    private Switch aSwitch;
    private ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // init
        imageView = view.findViewById(R.id.imG);
        aSwitch = view.findViewById(R.id.switch_view);
        //  set
        aSwitch.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.switch_view :
                if (isChecked)
                    showImage(R.drawable.iv);
                else
                    showImage(R.drawable.ic_launcher_background);
        }
    }

    private void showImage(int photo){
        imageView.setImageResource(photo);

    }
}