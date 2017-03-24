package com.example.rafaelpinheiro.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoNovaFrase;
    private TextView textoNovaFrase;

    private String[] frases = {
            "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
            "Não tentes ser bem sucedido, tenta antes ser um homem de valor.",
            "A paz é a única forma de nos sentirmos realmente humanos."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);

        textoNovaFrase.setText(frases[0]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random geradorRandomico = new Random();

                int numero = geradorRandomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numero]);
            }
        });
    }
}
