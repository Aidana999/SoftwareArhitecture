package com.example.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class AttractionsProFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list_new_activ, container, false);

        final ArrayList<MoreAdapter.More> mores = new ArrayList<>(5);
        mores.add(new MoreAdapter.More("Девичья башня", "Qız qalasıdxfjnbc dbid dodbd dfodzd" +
                "dfhnlxdkc'difghkn dfogzdgn godg;dfn g;xofgxh", "click to see location", R.drawable.giz_galasi));
        mores.add(new MoreAdapter.More("\"Сатый\" город", "İçərişəhər", "click to see location", R.drawable.old_city));

        MoreAdapter moreAdapter = new MoreAdapter((AppCompatActivity) getActivity(), mores);


        ListView listView = rootView.findViewById(R.id.new_list);
        listView.setAdapter(moreAdapter);

        return rootView;
    }

//    ActionBar actionBar = getSupportActionBar();
//        actionBar.setHomeButtonEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setHomeButtonEnabled(true);
//}
//
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                // app icon in action bar clicked; goto parent activity.
//                this.finish();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
}
