package com.example.home.fragmentfinal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyDetailFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_detail, container, false);
    }
    public void setText(String url)
    {
        TextView tv=(TextView)getView().findViewById(R.id.textView2);
        tv.setText("Time is :"+url+" ms");


    }

}
