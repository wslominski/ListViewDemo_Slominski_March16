package com.example.listviewdemo_slominski_march16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import javax.sql.StatementEvent;

public class MainActivity extends AppCompatActivity {

    ListView class_schedule;
    ArrayList<String> classes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        class_schedule = findViewById(R.id.class_schedule);

        classes = new ArrayList<>();

        classes.add("JAVA");
        classes.add("ANIMATION");
        classes.add("DISCRETE");
        classes.add("APP DEV.");
        classes.add("HORTICULTURE");

        final ArrayAdapter<String> classAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes);
        class_schedule.setAdapter(classAdapter);

        class_schedule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Quick Click", Toast.LENGTH_SHORT).show();;
            }
        });

        class_schedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You really held that well", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }
}
