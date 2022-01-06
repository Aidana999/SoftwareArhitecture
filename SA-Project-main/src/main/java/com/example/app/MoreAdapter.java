package com.example.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MoreAdapter extends ArrayAdapter<MoreAdapter.More> {

    public MoreAdapter(@NonNull AppCompatActivity context, ArrayList<More> mores) {
        super(context, 0, mores);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemViewMore = convertView;
        if (listItemViewMore == null) {
            listItemViewMore = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_list, parent, false);
        }

        More currentMore = getItem(position);


        TextView title = listItemViewMore.findViewById(R.id.title);
        title.setText(currentMore.getmTitle());

        TextView history = listItemViewMore.findViewById(R.id.history);
        history.setText(currentMore.getmTitle());

        TextView location = listItemViewMore.findViewById(R.id.location);
        location.setText(currentMore.getmTitle());

        ImageView image = listItemViewMore.findViewById(R.id.imageView1);
        image.setImageResource(currentMore.getmImage1());
        image.setVisibility(View.VISIBLE);


        return listItemViewMore;
    }

    public static class Guide  {
        private String mAzTranstetion;
        private String mRuTransletion;
        private String mHistory;
        private String mLocation;
        private String mGeo;
        private int mImageId;

        public Guide(String ruTransletion, String azTranstetion, int imageId, String history , String location,String geo) {
            mRuTransletion = ruTransletion;
            mAzTranstetion = azTranstetion;
            mHistory = history;
            mLocation = location;
            mImageId = imageId;
            mGeo = geo;
        }


        public String getAzTranstetion(){
            return mAzTranstetion;
        }
        public String getRuTransletion(){
            return mRuTransletion;
        }
        public String getmHistory(){return mHistory;}
        public String getmLocation(){return mLocation;}
        public String getmGeo(){return mGeo;}
        public int getmImageId(){return mImageId;}
    }

    public static class GuideAdapter extends ArrayAdapter<Guide> {

        public GuideAdapter(@NonNull AppCompatActivity context, ArrayList<Guide> guides) {
            super(context,0, guides);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.layout_list, parent, false);
            }

            Guide currentGuide = getItem(position);
            final Guide currentGuide2 = getItem(position);

            TextView historyView = listItemView.findViewById(R.id.id_history);
            historyView.setText(currentGuide.getmHistory());

            TextView locationView = listItemView.findViewById(R.id.id_location);
            locationView.setText(currentGuide.getmLocation());

            locationView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(currentGuide2.getmGeo()));
                    getContext().startActivity(intent);
                }

            });



            TextView azTextView = listItemView.findViewById(R.id.az_text);
            azTextView.setText(currentGuide.getAzTranstetion());

            TextView ruTextView = listItemView.findViewById(R.id.ru_text);
            ruTextView.setText(currentGuide.getRuTransletion());

            ImageView imageView = listItemView.findViewById(R.id.imageView);
            imageView.setImageResource(currentGuide.getmImageId());
            imageView.setVisibility(View.VISIBLE);


            return listItemView;
        }
    }

    public static class MainActivity extends AppCompatActivity {
        public TabLayout mtabLayout;
        public ViewPager mViewPager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            mViewPager = findViewById(R.id.pager);
            setupViewPager(mViewPager);

            mtabLayout = findViewById(R.id.tabs);
            mtabLayout.setupWithViewPager(mViewPager);

        }
        private void setupViewPager(ViewPager viewPager) {
            MyAdapter adapter = new MyAdapter(this, getSupportFragmentManager());
            adapter.addFramgent(new AttractionsFragment(), "Attractions");
            adapter.addFramgent(new ParksFragment(), "Parks");
            adapter.addFramgent(new RestaurantsFragment(), "Restaurants");

            viewPager.setAdapter(adapter);
        }
    }

    public static class More {
        String mTitle;
        String mHistory;
        String mLocation;
        int mImage1;

        public More(String title,String history, String location,int image1){
            mTitle = title;
            mHistory = history;
            mLocation = location;
            mImage1 = image1;
        }

        public String getmTitle() {return mTitle;}

        public String getmLocation() {return mLocation;}

        public String getmHistory() {return mHistory;}

        public int getmImage1() { return mImage1;}

    }
}
