package com.swufe.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {
    private final String TAG = "Title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);



        EditText inp3 = (EditText) findViewById(R.id.inp3);
        final String keywords = inp3.getText().toString();

        Button btn3 = (Button) findViewById(R.id.btn_text);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainPage.this,Search.class);
                intent.putExtra("keyWords",keywords);

                startActivity(intent);
            }
        });

    }
}
