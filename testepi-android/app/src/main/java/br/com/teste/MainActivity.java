package br.com.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.content.ClipDescription.MIMETYPE_TEXT_PLAIN;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickBtnPagarPix(View view) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

        if (clipboard.hasPrimaryClip() && clipboard.getPrimaryClipDescription().hasMimeType(MIMETYPE_TEXT_PLAIN)) {
            ClipData.Item item = clipboard.getPrimaryClip().getItemAt(0);
            String pasteData = item.getText().toString();

            Intent pagamentoActivity = new Intent(this, PagamentoActivity.class);
            pagamentoActivity.putExtra("qrCode", pasteData);
            startActivity(pagamentoActivity);
        }

    }

    private void showToast(String pMensagem) {
        Toast.makeText(getApplicationContext(), pMensagem, Toast.LENGTH_SHORT).show();
    }
}
