package com.example.home.fragmentfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DetailActivity extends AppCompatActivity {

    public static final String Extra_Url = "url";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getBoolean(R.bool.dual))
        {

            finish();
            return;
        }
        setContentView(R.layout.activity_detail);
        Bundle bun=getIntent().getExtras();
        if(bun!=null)
        {
            String url=bun.getString(Extra_Url);
            MyDetailFragment frag=(MyDetailFragment)getFragmentManager().findFragmentById(R.id.fragmentDetailActivity);
            frag.setText(url);
        }

    }

}
