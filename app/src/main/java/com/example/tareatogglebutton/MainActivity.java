package com.example.tareatogglebutton;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //Inicializar el boton
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        //Inicializar la imagen
        ImageView imageView = findViewById(R.id.imageView);


        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // si esta activado
                    buttonView.setText("Activado");
                    buttonView.setTextColor(Color.RED);
                    imageView.setVisibility(ImageView.VISIBLE);
                } else {
                    // si esta desactivado
                    buttonView.setText("Desactivado");
                    buttonView.setTextColor(Color.BLACK);
                    imageView.setVisibility(ImageView.INVISIBLE);
                }
            }
        });


        toggleButton.setChecked(false); // inicia desactivado el boton
        imageView.setVisibility(ImageView.INVISIBLE);
    }
}
