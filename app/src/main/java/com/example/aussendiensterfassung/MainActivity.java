package com.example.aussendiensterfassung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButtonCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCalendar(View view) {
        Intent startCalendarActivity = new Intent(this, Kalendar.class);
        startActivity(startCalendarActivity);
    }
}