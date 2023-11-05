package com.priscila.reciclarcomcriatividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela_Vidro extends AppCompatActivity {
    private ImageView luminaria;
    private ImageView decoracao_para_cozinha;
    private ImageView potes_vidro_garrafa;
    private ImageView trio_vasinhos_decorativos;
    private ImageView imagem_luminaria_rustica;
    private ImageView decoracao_garrafa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_vidro);

        IniciarComponentes();

        luminaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Vidro.this,Tela_Luminaria.class);
                startActivity(intent);
            }
        });

        decoracao_para_cozinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Vidro.this,Decoracao_para_Cozinha.class);
                startActivity(intent);
            }
        });

        potes_vidro_garrafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Vidro.this,Pote_Vidro_Garrafa.class);
                startActivity(intent);
            }
        });

        trio_vasinhos_decorativos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Vidro.this,Tela_Vasinhos_Decorativos.class);
                startActivity(intent);
            }
        });

        imagem_luminaria_rustica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Vidro.this,Tela_Luminaria_Rustica.class);
                startActivity(intent);
            }
        });

        decoracao_garrafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Vidro.this,Tela_Decoracao_Garrafa_Vidro.class);
                startActivity(intent);
            }
        });
    }
    private void IniciarComponentes(){

        luminaria = findViewById(R.id.luminaria);
        decoracao_para_cozinha = findViewById(R.id.decoracao_para_cozinha);
        potes_vidro_garrafa = findViewById(R.id.potes_vidro_garrafa);
        trio_vasinhos_decorativos = findViewById(R.id.trio_vasinhos_decorativos);
        imagem_luminaria_rustica = findViewById(R.id.imagem_luminaria_rustica);
        decoracao_garrafa = findViewById(R.id.decoracao_garrafa);

    }
}