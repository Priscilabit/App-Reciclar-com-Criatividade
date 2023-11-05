package com.priscila.reciclarcomcriatividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMateriais extends AppCompatActivity {
    private Button bt_plastico,bt_vidro,bt_madeira,bt_isopor,bt_papelao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_materiais);

        IniciarComponentes();

        bt_plastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMateriais.this,Tela_Plastico.class);
                startActivity(intent);
            }
        });

        bt_vidro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMateriais.this,Tela_Vidro.class);
                startActivity(intent);
            }
        });

        bt_madeira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMateriais.this,Tela_Madeira.class);
                startActivity(intent);
            }
        });

        bt_isopor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMateriais.this,Tela_Isopor.class);
                startActivity(intent);
            }
        });

        bt_papelao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMateriais.this,Tela_Papelao.class);
                startActivity(intent);
            }
        });

    }
    private void IniciarComponentes(){
        bt_plastico = findViewById(R.id.bt_plastico);
        bt_vidro = findViewById(R.id.bt_vidro);
        bt_madeira = findViewById(R.id.bt_madeira);
        bt_isopor = findViewById(R.id.bt_isopor);
        bt_papelao = findViewById(R.id.bt_papelao);
    }
}