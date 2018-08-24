package com.cenak98.whereiam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOptions = (Button) findViewById(R.id.btnOptions);
        Button btnFind = (Button) findViewById(R.id.btnFind);
        Button btnInfo = (Button) findViewById(R.id.btnInfo);
        Button btnBack = (Button) findViewById(R.id.btnBack);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.btnInfo:
                        setContentView(R.layout.info_window);
                        break;

                    case R.id.btnBack:
                        setContentView(R.layout.activity_main);
                        break;

                    default:
                        Toast.makeText(getApplicationContext(), "Кнопка", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        };/*

        btnOptions.setOnClickListener(oclBtn);
        btnFind.setOnClickListener(oclBtn);
        btnInfo.setOnClickListener(oclBtn);
        btnBack.setOnClickListener(oclBtn);
        */
    }
}
