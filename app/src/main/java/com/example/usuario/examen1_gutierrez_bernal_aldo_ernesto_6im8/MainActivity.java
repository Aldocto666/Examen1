package com.example.usuario.examen1_gutierrez_bernal_aldo_ernesto_6im8;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText numero;
    String valida;
    double num;
    double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = (EditText)findViewById(R.id.cantidad);
    }
    public void onClickConvertir(View v)
    {
        valida = numero.getText().toString();
        Intent envio = new Intent(this,Correo.class);
        Bundle datos = new Bundle();
            num = Double.parseDouble(numero.getText().toString());
            resultado = num / 15;

            datos.putDouble("Resultado :D", resultado);

            envio.putExtras(datos);
            startActivity(envio);
    }
}
