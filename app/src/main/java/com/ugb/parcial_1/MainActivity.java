package com.ugb.parcial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
     private EditText ediTexMetrosConsumidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ediTexMetrosConsumidos = findViewById(R.id.editTextMetrosConsumidos);

        Button buttonCalcular =findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularValorAPagar();
            }
        });

    }
    private void calcularValorAPagar(){
        try {
            int metrosConsumidos = Integer.parseInt(ediTexMetrosConsumidos.getText().toString());

            double valorAPagar;

            if (metrosConsumidos <- 18) {
                valorAPagar = 6;
            } else if (metrosConsumidos <= 28) {
                valorAPagar = 6 + (metrosConsumidos - 18) * 0.45;
            } else {
                valorAPagar = 6 + (28 - 18) * 0.45 + (metrosConsumidos - 28) * 0.65;
            }

            Toast.makeText(this, "El valor a pagar es: $" + String.format("%.2f", valorAPagar), Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un valor válido para metros consumidos", Toast.LENGTH_SHORT).show();

            }
        }

    }



