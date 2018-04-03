package com.example.tuanduyen.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText nb1;
    EditText nb2;
    Button btnCong;
    ListView listView;
    ArrayList<String> dsCong;
    ArrayAdapter<String> mAdapterCong;
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controls();
        Events();
    }
    private void Events(){
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyPhepCong();
            }
        });
    }

    private void Controls() {
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setIndicator("Home");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("");
        tab2.setIndicator("Video");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("");
        tab3.setIndicator("Thêm");
        tab3.setContent(R.id.tab3);
        tabHost.addTab(tab3);

        nb1 = (EditText) findViewById(R.id.nb1);
        nb2 = (EditText) findViewById(R.id.nb2);
        listView = (ListView) findViewById(R.id.lvListView);
        btnCong = (Button) findViewById(R.id.btnCong);
    }

    private void xuLyPhepCong() {
        int a = Integer.parseInt(nb1.getText().toString());
        int b = Integer.parseInt(nb2.getText().toString());
//        String s=(a+b);
//        dsCong.add(s);

    }
}
