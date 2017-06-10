package com.staj.eray.isnetsiparis;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class fragment_ust extends Fragment {

    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] urunler={"Hamburger","Cheeseburger","Patates Kızartması","Nuggets","Balık Ekmek","Pizza","Tavuk","Pilav","Makarna","Tost","Kola","Ayran"};
    String miktar,istenen = "";
    AdapterView.AdapterContextMenuInfo info;
    OnButtonPressListener onButtonPressListener;


    public fragment_ust(){
        //boş bir yapıcı gereklidir
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_ust, container, false);
        listView = (ListView) view.findViewById(R.id.listV);
        arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,urunler);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onButtonPressListener = (OnButtonPressListener) getActivity();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Kaç adet istersiniz?");
        menu.add(0,v.getId(),0,"1");
        menu.add(0,v.getId(),0,"2");
        menu.add(0,v.getId(),0,"3");
        menu.add(0,v.getId(),0,"4");
        menu.add(0,v.getId(),0,"5");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int listPosition = info.position;
        if (item.getTitle() == "1") {
            miktar = "1";
            istenen = miktar + " " + urunler[listPosition];
            onButtonPressListener.onButtonPressed(istenen);
        }
        else if (item.getTitle() == "2") {
            miktar = "2";
            istenen = miktar + " " + urunler[listPosition];
            onButtonPressListener.onButtonPressed(istenen);
        }
        else if (item.getTitle() == "3") {
            miktar = "3";
            istenen = miktar + " " + urunler[listPosition];
            onButtonPressListener.onButtonPressed(istenen);
        }
        else if (item.getTitle() == "4") {
            miktar = "4";
            istenen = miktar + " " + urunler[listPosition];
            onButtonPressListener.onButtonPressed(istenen);
        }
        else if (item.getTitle() == "5") {
            miktar = "5";
            istenen = miktar + " " + urunler[listPosition];
            onButtonPressListener.onButtonPressed(istenen);
        } else {
            return false;
        }
        return true;
    }
}
