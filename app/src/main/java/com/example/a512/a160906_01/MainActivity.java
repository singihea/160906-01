package com.example.a512.a160906_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btnname;
    public TextView textname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textname = (TextView) findViewById(R.id.textname);
        btnname = (Button) findViewById(R.id.btnname);
        btnname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textname.setText("gihea");
                Toast.makeText(getApplicationContext(),"gihea",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
