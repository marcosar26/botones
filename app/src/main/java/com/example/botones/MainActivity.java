package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("Has pulsado el botón ");
        if (view.getId() == R.id.button2) {
            sb.append("azul");
        } else if (view.getId() == R.id.button3) {
            sb.append("amarillo");
        } else if (view.getId() == R.id.button4) {
            sb.append("verde");
        } else if (view.getId() == R.id.button5) {
            sb.append("rojo");
        } else {
            return;
        }
        Toast.makeText(this.getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
    }
}