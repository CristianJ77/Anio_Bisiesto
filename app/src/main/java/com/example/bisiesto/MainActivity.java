package com.example.bisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText anio_ingresado;
    private TextView result;
    private Button btn_verificar;

    int anio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anio_ingresado = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.txtv2);
        btn_verificar = (Button) findViewById(R.id.button);

        btn_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anio = Integer.parseInt(anio_ingresado.getText().toString());

                if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                    result.setText("El año " + anio_ingresado.getText() + " es bisiesto");
                } else {
                    result.setText("El año " + anio_ingresado.getText() + " no es bisiesto");
                }
            }
        });
    }
}
