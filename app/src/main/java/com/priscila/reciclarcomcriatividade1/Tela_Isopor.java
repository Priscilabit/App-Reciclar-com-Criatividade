package com.priscila.reciclarcomcriatividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela_Isopor extends AppCompatActivity {

    private ImageView parede_isopor;
    private ImageView vaso_isopor;
    private ImageView azulejo_isopor;
    private ImageView cabeceira_de_cama;
    private ImageView charrete_decorativa;
    private ImageView vasinho_de_parede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_isopor);

        IniciarComponentes();

        parede_isopor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Isopor.this,Tela_Revestimento_Isopor.class);
                startActivity(intent);
            }
        });

        vaso_isopor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Isopor.this,Tela_Vaso_Isopor.class);
                startActivity(intent);
            }
        });

        azulejo_isopor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Isopor.this,Tela_Azulejo_com_Isopor.class);
                startActivity(intent);
            }
        });

        cabeceira_de_cama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Isopor.this,Tela_Cabeceira_de_Cama.class);
                startActivity(intent);
            }
        });

        charrete_decorativa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Isopor.this,Tela_Charrete_Decorativa.class);
                startActivity(intent);
            }
        });

        vasinho_de_parede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Isopor.this,Tela_Vasinho_de_Parede.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes() {

        parede_isopor = findViewById(R.id.parede_isopor);
        vaso_isopor = findViewById(R.id.vaso_isopor);
        azulejo_isopor = findViewById(R.id.azulejo_isopor);
        cabeceira_de_cama = findViewById(R.id.cabeceira_de_cama);
        charrete_decorativa = findViewById(R.id.charrete_decorativa);
        vasinho_de_parede = findViewById(R.id.vasinho_de_parede);
    }
}