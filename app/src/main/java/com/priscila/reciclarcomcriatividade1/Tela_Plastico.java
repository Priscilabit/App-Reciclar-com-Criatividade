package com.priscila.reciclarcomcriatividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela_Plastico extends AppCompatActivity {
    private ImageView plantar_com_garrafa;
    private ImageView mesa_de_cano;
    private ImageView organizador;
    private ImageView telha_garrafa;
    private ImageView vaso_balde;
    private ImageView pote_garrafa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_plastico);

        IniciarComponentes();

        plantar_com_garrafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Plastico.this,PlantarNaGarrafa.class);
                startActivity(intent);
            }
        });

        mesa_de_cano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Plastico.this,Mesa_de_Cano.class);
                startActivity(intent);
            }
        });

        organizador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Plastico.this,Organizador.class);
                startActivity(intent);
            }
        });

        telha_garrafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Plastico.this,Telha_Garrafa.class);
                startActivity(intent);
            }
        });

        vaso_balde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Plastico.this,Tela_Vaso.class);
                startActivity(intent);
            }
        });

        pote_garrafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Plastico.this,Tela_Pote_Garrafa.class);
                startActivity(intent);
            }
        });
    }
    private void IniciarComponentes(){

        plantar_com_garrafa = findViewById(R.id.plantar_com_garrafa);
        mesa_de_cano = findViewById(R.id.mesa_de_cano);
        organizador = findViewById(R.id.organizador);
        telha_garrafa = findViewById(R.id.telha_garrafa);
        vaso_balde = findViewById(R.id.vaso_balde);
         pote_garrafa = findViewById(R.id.pote_garrafa);
    }
}