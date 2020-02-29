package br.com.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static android.content.ClipDescription.MIMETYPE_TEXT_PLAIN;

public class PagamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);


    }

    @Override
    protected void onStart() {
        super.onStart();

        TextView txtViewNomeRecebedor = this.findViewById(R.id.txtViewNomeRecebedor);
        TextView txtViewValor = this.findViewById(R.id.txtViewValor);


        String qrCodeBase64 = getIntent().getStringExtra("qrCode");


        try {
            byte[] data = Base64.decode(qrCodeBase64, Base64.DEFAULT);
            String qrCode = new String(data, "UTF-8");

            String preNomeRecebedor = "5802BR5913";
            int indexNomeRecebedor = qrCode.indexOf(preNomeRecebedor) + preNomeRecebedor.length();
            String nomeRecebedor = qrCode.substring(indexNomeRecebedor, indexNomeRecebedor + 13);
            txtViewNomeRecebedor.setText(nomeRecebedor.trim());

            String preValor = "53039865406";
            int indexValor = qrCode.indexOf(preValor) + preValor.length();
            String valor = qrCode.substring(indexValor, indexValor + 6);
            txtViewValor.setText(valor.trim());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


    private void showToast(String pMensagem) {
        Toast.makeText(getApplicationContext(), pMensagem, Toast.LENGTH_SHORT).show();
    }



    public void onClickBtnFinalizar(View view) {
        showToast("Pagamento realizado com Sucesso");
        finish();
    }
}
