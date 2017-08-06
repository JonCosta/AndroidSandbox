package br.com.joncosta.sandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NovaInicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_inicio);
    }

    public void enviarMsg(View view) {
        EditText editMsg = (EditText) findViewById(R.id.editMsg);
        String msg = editMsg.getText().toString();
        Intent intent = new Intent(this, PostNovaActivity.class);
        intent.putExtra("Msg4Post", msg);
        startActivity(intent);
    }
}
