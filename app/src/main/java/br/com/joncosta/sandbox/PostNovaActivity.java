package br.com.joncosta.sandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PostNovaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_nova);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("Msg4Post");
        TextView txtMsgPost = (TextView) findViewById(R.id.txtPostMsg);
        txtMsgPost.setText(msg);
    }
}
