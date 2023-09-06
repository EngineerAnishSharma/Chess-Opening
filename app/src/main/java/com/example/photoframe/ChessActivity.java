package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChessActivity extends AppCompatActivity {

    Button open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
        open=findViewById(R.id.buttonOpen);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChessActivity.this,MainActivity.class));
                Toast.makeText(ChessActivity.this, "Welcome to the World of Chess", Toast.LENGTH_LONG).show();
            }
        });
    }
}