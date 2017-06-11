package com.gok.selin.haberuygulamasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvHaberler;
    ArrayList<HaberModel> haberListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHaberler = (ListView) findViewById(R.id.listViewHaberler);

        haberListesi.add(new HaberModel("Cumhuriyet","https://notepad.pw/gyk8",R.drawable.cumhuriyet));
        haberListesi.add(new HaberModel("Akit","https://notepad.pw/gyk8",R.drawable.akit));
        haberListesi.add(new HaberModel("Akşam","https://notepad.pw/gyk8",R.drawable.aksam));

        CustomAdaptor adaptor = new CustomAdaptor(this,haberListesi);
        lvHaberler.setAdapter(adaptor);

        lvHaberler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),WebActivity.class);
                intent.putExtra("LINK",haberListesi.get(position).getLink());
                startActivity(intent);

            }
        });





    }
}
