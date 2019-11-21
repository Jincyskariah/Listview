package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mob=findViewById(R.id.txtlist);
        final ArrayList<String> mobiles=new ArrayList<>();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,mobiles);
        mobiles.add("iPhone");
        mobiles.add("Samsung");
        mobiles.add("Nokia");
        mobiles.add("HTC");
        mobiles.add("Honor");
        mobiles.add("Remi");
        mobiles.add("Real me");
        mobiles.add("Oppo");
        mobiles.add("Vivo");
        mobiles.add("Blackberry");
        mobiles.add("One plus");
        mob.setAdapter(adapter);
        mob.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, mobiles.get(position), Toast.LENGTH_SHORT).show();
                
            }
        });

    }
}
