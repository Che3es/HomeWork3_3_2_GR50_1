package com.example.homework3_3_2_gr50_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> groupList = new ArrayList<>();
    private RecyclerView rvGroupList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addValue();

        rvGroupList = findViewById(R.id.rv_group);
        GroupAdapter groupAdapter = new GroupAdapter(groupList);
        rvGroupList.setAdapter(groupAdapter);
    }

    private void addValue() {
        groupList.add("Алянур");
        groupList.add("Абдуль-Азиз");
        groupList.add("Ислам");
        groupList.add("Ишеналы");
        groupList.add("Нускайым");
        groupList.add("Бектур");
        groupList.add("Рустам");
        groupList.add("Улан");
        groupList.add("Мадина");
        groupList.add("Азис");
        groupList.add("Курмангазы");
        groupList.add("Кайратбек");
        groupList.add("Мужахиддин");
        groupList.add("Каныкей");
        groupList.add("Алибек");
        groupList.add("Рамис");
        groupList.add("Алексей");
        groupList.add("Баха");
        groupList.add("Нурсултан");
        groupList.add("Бексултан");
        groupList.add("Eazy e");

    }
}