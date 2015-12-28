package com.example.home.fragmentfinal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MyListFragment extends Fragment {
    @Nullable
    private activityFragmentInterface  listener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_my_list,container,false);
        Button bt=(Button)v.findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                updateDetail("uri");
            }
        });
        return v;

    }
    public interface activityFragmentInterface{

        public void listFragment(String url);

    }





    public void updateDetail(String uri)
    {
        Context context=getActivity();
        if (context instanceof activityFragmentInterface) {

            listener=(activityFragmentInterface)context;
        }
        else
        {
            throw new ClassCastException(context.toString()+"must implement MyListFragment.activityFragmentInterface");

        }
        if(listener==null)
        {
            System.out.println("asdfg");
        }
        String newTime=String.valueOf(System.currentTimeMillis());
        listener.listFragment(newTime);
    }
}
