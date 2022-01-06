package com.example.app;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AttractionsPodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devichya_bashnya);
        ActionBar actionBar =getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);



        final ArrayList<MoreAdapter.More> mores = new ArrayList<>(5);
        mores.add(new MoreAdapter.More("Девичья башня", "Qız qalasıdxfjnbc dbid dodbd dfodzd" +
                "dfhnlxdkc'difghkn dfogzdgn godg;dfn g;xofgxh","click to see location", R.drawable.giz_galasi));
        mores.add(new MoreAdapter.More("\"Сатый\" город", "İçərişəhər", "click to see location", R.drawable.old_city));
        MoreAdapter moreAdapter = new MoreAdapter(this, mores);





    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
