package com.priscila.reciclarcomcriatividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela_Madeira extends AppCompatActivity {

    private ImageView quadro_prateleira;
    private ImageView casinha_butijao;
    private ImageView criado_mudo;
    private ImageView luminaria_de_mesa;
    private ImageView prateleira_de_madeira;
    private ImageView prateleira_porta_roupeiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_madeira);

        IniciarComponentes();

        quadro_prateleira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Madeira.this,Tela_Quadro_Parteleira.class);
                startActivity(intent);
            }
        });

        casinha_butijao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Madeira.this,Tela_Casinha_Butijao.class);
                startActivity(intent);
            }
        });

        criado_mudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Madeira.this,Tela_Criado_Mudo.class);
                startActivity(intent);
            }
        });

        luminaria_de_mesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Madeira.this,Tela_Luminaria_de_Mesa.class);
                startActivity(intent);
            }
        });

        prateleira_de_madeira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Madeira.this,Tela_Prateleira_de_Madeira.class);
                startActivity(intent);
            }
        });

        prateleira_porta_roupeiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Madeira.this,Tela_Prateleira_Porta_Roupeiro.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){

        quadro_prateleira = findViewById(R.id.quadro_prateleira);
        casinha_butijao = findViewById(R.id.casinha_butijao);
        criado_mudo = findViewById(R.id.criado_mudo);
        luminaria_de_mesa = findViewById(R.id.luminaria_de_mesa);
        prateleira_de_madeira = findViewById(R.id.prateleira_de_madeira);
        prateleira_porta_roupeiro = findViewById(R.id.prateleira_porta_roupeiro);
    }
}