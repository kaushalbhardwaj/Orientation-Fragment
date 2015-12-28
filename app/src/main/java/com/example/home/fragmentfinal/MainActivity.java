package com.example.home.fragmentfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements MyListFragment.activityFragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void listFragment(String url)
    {
        boolean dual_pane=getResources().getBoolean(R.bool.dual);

            if (dual_pane) {
                MyDetailFragment frag = (MyDetailFragment) getFragmentManager().findFragmentById(R.id.detail);
                frag.setText(url);
            }
        else{

                Intent i=new Intent(getApplicationContext(),DetailActivity.class);
                i.putExtra(DetailActivity.Extra_Url,url);
                startActivity(i);

            }

    }

}
