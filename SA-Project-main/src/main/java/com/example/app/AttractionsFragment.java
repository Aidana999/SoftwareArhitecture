package com.example.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<MoreAdapter.Guide> guides = new ArrayList<>(5);
        guides.add(new MoreAdapter.Guide("Девичья башня", "Qız qalası", R.drawable.giz_galasi,"О возникновении Девичьей башни ходит много легенд." +
                " Одна из легенд гласит, что шах решил выдать свою дочь за нелюбимого ею человека. " +
                "Пытаясь избавить себя от такой участи и отговорить отца, девушка попросила шаха построить башню и подождать, пока " +
                "строительство не будет завершено. К моменту окончания строительства шах не изменил своего решения и тогда девушка " +
                "взошла на башню и оттуда бросилась в море. После этого камень, о который царевна разбилась, назвали «Камнем девственницы», " +
                "и девушки, будучи невестами, приносили к нему цветы.","Click to see location","geo:40.366088,49.837269"));
        guides.add(new MoreAdapter.Guide("\"Сатый\" город", "İçərişəhər", R.drawable.old_city,"Ичери́-шехе́р (азерб. İçəri şəhər — Внутренний город)," +
                " в простонародье — Крепость (азерб. Qala), или «старый» город — старинный жилой квартал — историко-архитектурный заповедник в столице" +
                " Азербайджана городе Баку. Окружённый хорошо сохранившимся крепостными стенами, является наиболее древней частью и достопримечательностью " +
                "города. На площади в 221 тыс. м², который занимает заповедник, проживает более 1300 семей.","Click to see location","geo:40.366039,49.831675"));


        MoreAdapter.GuideAdapter adapter = new MoreAdapter.GuideAdapter((AppCompatActivity) getActivity(), guides);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


//
//        View rootView2 = inflater.inflate(R.layout.place_list_new_activ, container, false);
//
//        final ArrayList<More> mores = new ArrayList<>(5);
//        mores.add(new More("Девичья башня", "Qız qalasıdxfjnbc dbid dodbd dfodzd" +
//                "dfhnlxdkc'difghkn dfogzdgn godg;dfn g;xofgxh", "click to see location", R.drawable.giz_galasi));
//        mores.add(new More("\"Сатый\" город", "İçərişəhər", "click to see location", R.drawable.old_city));
//
//        MoreAdapter moreAdapter = new MoreAdapter((AppCompatActivity) getActivity(), mores);
//
//
//        ListView listView2 = rootView2.findViewById(R.id.new_list);
//        listView2.setAdapter(moreAdapter);
//        LinearLayoutManager layoutManager= new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//        mRecyclerView = rootView.findViewById(R.id.new_list);
//        mRecyclerView.setLayoutManager(layoutManager);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



//                Guide guide = guides.get(i);
//                Intent aboutAIntent = new Intent(getActivity(), AttractionsPodActivity.class);
//                Intent intent = new Intent(AttractionsFragment.this.getActivity(),AttractionsProFragment.class);
//                startActivity(intent);
//                Fragment newFragment = new AttractionsProFragment();
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.list, newFragment);
//                transaction.addToBackStack(null);
//                transaction.commit();

            }

       });
        

        return rootView;
    }


}
