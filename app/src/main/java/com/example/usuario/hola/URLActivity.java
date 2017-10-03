package com.example.usuario.hola;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class URLActivity extends AppCompatActivity implements View.OnClickListener {

    EditText url;
    Button navegar;
    Intent intent;
    Intent intSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        url = (EditText)findViewById(R.id.edtURL);
        navegar = (Button)findViewById(R.id.btnNavegar);
        navegar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == navegar){
            intent = new Intent(this,WebViewActivity.class);
            intent = intent.putExtra("url",url.getText().toString());
            startActivity(intent);
        }
    }


}
