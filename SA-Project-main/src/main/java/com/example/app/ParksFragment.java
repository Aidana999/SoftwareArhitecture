package com.example.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<MoreAdapter.Guide> guides = new ArrayList<>(5);
        guides.add(new MoreAdapter.Guide("Парк Бульвар", "Park Bulvar", R.drawable.baku_boulevard,"Примо́рский бульва́р — " +
                "одна из достопримечательностей Баку, излюбленное место отдыха бакинцев и гостей города. В 2009 году отметил " +
                "свой 100-летний юбилей. Парк протянулся вдоль южной стороны залива Каспийского моря. Бульвар " +
                "традиционно начинается на площади Свободы, продолжаясь на запад до Старого города и за его" +
                " пределами. С 2012 года бульвар (Новый бульвар) практически удвоил длину до 3,75 км, расширив " +
                "набережные до Площади Государственного флага, в конечном итоге бульвар может быть до" +
                " 26 км.","Click to see location","geo:40.366088,49.837269"));
        guides.add(new MoreAdapter.Guide("Сад Филармонии \n(Губернаторский сад)", "Filarmoniya bağı", R.drawable.filarmoniya_sad,"Филармонический сад " +
                "был основан в 1830 году по инициативе коменданта бакинской крепости полковника " +
                "Романа фон дер Ховена на базе частных насаждений и на месте частных садов и огородов" +
                " между крепостными стенами. Почву и растения для сада пришлось завозить из других мест." +
                "В 1859 году внешняя крепостная стена была разобрана и территория сада была расширена до " +
                "Николаевской и Садовой улиц.  В саду насчитывалось около 12 000 деревьев."
                ,"Click to see location","geo:40.363782,49.833004"));
        guides.add(new MoreAdapter.Guide("Малая Венеция","Kiçik Venesiya",R.drawable.veneciya,"«Малая Венеция» появилась в Баку" +
                " в 1960 году На берегах каналов, по которым плыли прогулочные гондолы, открылись " +
                "небольшие кафе и парки, а по вечерам территория освещалась." +
                " В советские годы была известна и как система детских прогулочных каналов, " +
                "шутливо, называемая «бакинской Венецией». Бакинская Венеция, моторные лодки " +
                "по каналам которой курсировали до самого позднего вечера, пользовалась " +
                "большой любовью у бакинцев. Её система прудов и каналов привлекала многих " +
                "посетителей бульвара.","Click to see location","geo:40.361123,49.835767"));
        guides.add(new MoreAdapter.Guide("Центр Гейдара Алиева","Heydər Əliyev Mərkəzi",R.drawable.heydar_aliyev_center_123,"Центр Гейда́ра Али́ева — культурный центр, " +
                "построенный на проспекте Гейдара Алиева в столице Азербайджана, в городе Баку." +
                " Представляет собой комплексное сооружение, которое включает в себя аудиториум " +
                "(конгресс-центр), музей, выставочные залы, административные офисы. Носит имя 3-го " +
                "президента Азербайджана Гейдара Алиева. Проект центра был разработан в 2007 году " +
                "архитектором Захой Хадид. " +
                "В 2014 году признано самым лучшим в мире зданием — премия 2014 Design of the Year.","Click to see location","geo:40.396143,49.867749"));


        MoreAdapter.GuideAdapter adapter = new MoreAdapter.GuideAdapter((AppCompatActivity) getActivity(), guides);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return rootView;
    }


}
