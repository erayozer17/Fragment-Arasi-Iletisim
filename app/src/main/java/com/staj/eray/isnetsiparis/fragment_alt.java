package com.staj.eray.isnetsiparis;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment_alt extends Fragment {

    Bundle bundle = this.getArguments();
    TextView textView;
    String alinan = "";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_alt,container,false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    void setMesaj(String msj){
        if (!msj.equals("sifirla")) {
            alinan += msj + ",";
            textView.setText(alinan);
        } else {
            textView.setText("İstediğiniz ürünün üstüne basılı tutun.");
            alinan = "";
        }
    }
}
