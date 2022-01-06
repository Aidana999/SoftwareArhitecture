package com.example.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<MoreAdapter.Guide> guides = new ArrayList<>(5);
        guides.add(new MoreAdapter.Guide(" Европейская,\n Центральноевропейская", "Malacannes 145", R.drawable.malacannes,"Удобное расположение в сердце города," +
                " у Молоканского Сада и своя парковка сделает это ваше пребываение здесь еще более комфортным." +
                "Malacannes может принять одновременно 85 гостей. Кроме большого зала, для вашего " +
                "удобства здесь также имеются кабинеты." +
                "Что же стоит попробовать в Malacannes? Непременно зайдите сюда на завтраки. Именно " +
                "на них сделан особый акцент. Разнообразные, с национальными и европейскими блюдами, " +
                "вкусными чайными сетами.","Click to see location","geo:40.371092,49.840153"));
        guides.add(new MoreAdapter.Guide("Азербайджанская", "Cay Bagi 145", R.drawable.cay_bagi,"Подходит для вегетарианцев, Для веганов, " +
                "Халяль, Безглютеновые блюда.Cay Bagi 145 - хорошее место отдыха и время препровождения.\n" +
                "Восточная нотка в каждом уголке чайного сада 145. Старый Баку и Новый Баку слился в едино!" +
                "Если вы хотите отдохнуть насладившись красотами города, это заведение идеально для вас походит," +
                "Ведь отсюда самый красивый вид на город.","Click to see location","geo:40.366564,49.836479"));
        guides.add(new MoreAdapter.Guide("Азербайджанская", "Sahil Bar & Restaurant", R.drawable.sahil_im,"Для веганов, Безглютеновые блюда," +
                " Подходит для вегетарианцев.Приятно удивляет атмосфера заведения ," +
                " изысканное меню , видовая терраса, живая музыка ","Click to see location","geo:40.369872,49.845590"));


        MoreAdapter.GuideAdapter adapter = new MoreAdapter.GuideAdapter((AppCompatActivity) getActivity(), guides);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }


}

