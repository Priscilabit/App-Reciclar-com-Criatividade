package com.priscila.reciclarcomcriatividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela_Papelao extends AppCompatActivity {
    private ImageView caixa_organizadora1;
    private ImageView caixa_organizadora_para_banheiro;
    private ImageView cachepot_papelao;
    private ImageView decoracao_com_papelao;
    private ImageView porta_caneta_e_recados;
    private ImageView nicho_de_papelao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_papelao);

        IniciarComponentes();

        caixa_organizadora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Papelao.this, Caixa_Organizadora.class);
                startActivity(intent);
            }
        });

        caixa_organizadora_para_banheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Papelao.this,Tela_Caixa_Organizadora_Banheiro.class);
                startActivity(intent);
            }
        });

        cachepot_papelao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Papelao.this,Tela_Cachepot_Papelao.class);
                startActivity(intent);
            }
        });

        decoracao_com_papelao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Papelao.this,Tela_Decoracao_Papelao.class);
                startActivity(intent);
            }
        });

        porta_caneta_e_recados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Papelao.this,Tela_Porta_Canetas_Recados.class);
                startActivity(intent);
            }
        });

        nicho_de_papelao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Papelao.this,Tela_Nicho_de_Papelao.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){

        caixa_organizadora1 = findViewById(R.id.caixa_organizadora1);
        caixa_organizadora_para_banheiro = findViewById(R.id.caixa_organizadora_para_banheiro);
        cachepot_papelao = findViewById(R.id.cachepot_papelao);
        decoracao_com_papelao = findViewById(R.id.decoracao_com_papelao);
        porta_caneta_e_recados = findViewById(R.id.porta_caneta_e_recados);
        nicho_de_papelao = findViewById(R.id.nicho_de_papelao);
    }
}