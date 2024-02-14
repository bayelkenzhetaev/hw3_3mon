package com.example.hw3_3mon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> girlNameList = new ArrayList<>();

    private RecyclerView girlsRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        findAdapter();
        data();
    }

    private void data() {
        girlNameList.add("Alina");
        girlNameList.add("Farizat");
        girlNameList.add("Ailin");
        girlNameList.add("Vika");
        girlNameList.add("Aruuke");
        girlNameList.add("Aigul");
        girlNameList.add("Elvira");
        girlNameList.add("Gulvira");
        girlNameList.add("Aiturgan");
        girlNameList.add("Aibiyke");
        girlNameList.add("Begaiym");
        girlNameList.add("Begimay");
        girlNameList.add("Bermet");
        girlNameList.add("Nastya");
        girlNameList.add("Anjelika");
        girlNameList.add("Anelya");

    }

    private void findAdapter() {
        GirlsAdapter adapter = new GirlsAdapter(girlNameList);
        girlsRv.setAdapter(adapter);
    }

    private void findId() {
        girlsRv = findViewById(R.id.girls_rv);
    }
}