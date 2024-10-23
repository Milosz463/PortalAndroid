package com.example.portalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int polub;
    Button buttonPolub;
    Button buttonUsun;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView7);

        buttonPolub=findViewById(R.id.button);
        buttonPolub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        polub++;
                        textView.setText(String.valueOf(polub+" Polubien"));

                    }
                }
        );

        buttonUsun=findViewById(R.id.button2);
        buttonUsun.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        polub--;
                        textView.setText(String.valueOf(polub+ "Polubien"));

                    }
                }
        );

    }

}