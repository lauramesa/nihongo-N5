package com.example.nihongon5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    private EditText username, password;
    private String user, pass  ;
    public Button bt_inicio, bt_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.id_login_user);
        password = findViewById(R.id.id_login_pass);
        bt_inicio = findViewById(R.id.id_bt_inicio);
        bt_registro = findViewById(R.id.id_bt_registro);

        bt_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString();
                pass = password.getText().toString();

                if(user.equals("cendi") && pass.equals("12345") ){
                    Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(intent);
                } else if (user.equals("") && pass.equals("")){
                    Toast.makeText(getApplicationContext(),"estos campos no pueden estar vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),singInActivity.class);
                    startActivity(intent);
            }
        });

    }
}