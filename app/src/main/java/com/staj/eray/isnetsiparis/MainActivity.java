package com.staj.eray.isnetsiparis;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnButtonPressListener {

    Button buton_sifirla,buton_gonder;
    public static final String sifirla = "sifirla";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton_sifirla = (Button)findViewById(R.id.sifirla_buton);
        buton_gonder = (Button) findViewById(R.id.siparis_buton);
        buton_gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(sifirla);
                Toast.makeText(MainActivity.this,"Siparişiniz verilmiştir",Toast.LENGTH_SHORT).show();
                /*gereken altyapı olsaydı listeye eklenen ürünlerin
                tamamının üreticiye sipariş geçilmesi işi burada yapılacaktı*/
            }
        });
        buton_sifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(sifirla);
            }
        });
    }

    @Override
    public void onButtonPressed(String msg) {
        fragment_alt frag_alt = (fragment_alt) getSupportFragmentManager().findFragmentById(R.id.frag_alt);
        frag_alt.setMesaj(msg);
    }
}
