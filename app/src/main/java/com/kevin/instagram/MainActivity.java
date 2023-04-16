package com.kevin.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kevin.instagram.Adapter.ListAdapter;
import com.kevin.instagram.Utils.Utils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> datlist = new ArrayList<>();
    RecyclerView rcvlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvlist = findViewById(R.id.rcvlist);
        for (int i=0; i < Utils.dp.length; i++) {
            Model model = new Model(Utils.dp[i], Utils.username[i] );
            datlist.add(model);
        }

        rcvlist.setLayoutManager(new LinearLayoutManager(this));
        rcvlist.setAdapter(new ListAdapter(datlist));

    }
}