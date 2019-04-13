package com.example.takehomeassignment07_angelchangwei;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();



        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void initialData(){
        persons = new ArrayList<>();
        persons.add(new Person("Kofi Annan","The 7th UN Secretary General",R.drawable.kofi_annan));
        persons.add(new Person("Ban Ki Moon", "The 8th UN Secretary General",R.drawable.ban_ki_moon_credit_un_photo_mark_garten_650px));
        persons.add(new Person("Antonio Guterres","The 9th UN Secretary General",R.drawable.Guterres));
    }

}
