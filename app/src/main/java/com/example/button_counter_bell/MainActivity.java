package com.example.button_counter_bell;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button clearButton;
    private Button incrementButton;
    private Button decrementButton;
    private Button wowButton;

    private TextView counter;
    private int curr;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clearButton = findViewById(R.id.clearVal);
        incrementButton = findViewById(R.id.incrementVal);
        decrementButton = findViewById(R.id.decrementVal);
        wowButton = findViewById(R.id.wowButton);
        counter = findViewById(R.id.counter);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = 0;
                counter.setText(String.valueOf(curr));
            }
        });

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr++;
                counter.setText(String.valueOf(curr));
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr--;
                counter.setText(String.valueOf(curr));
            }
        });

        wowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = 8675309;
                counter.setText(String.valueOf(curr));

            }
        });

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("curr",curr);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        curr = savedInstanceState.getInt("curr");
        counter.setText(String.valueOf(curr));
    }
}
