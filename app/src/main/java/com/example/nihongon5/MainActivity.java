package com.example.nihongon5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAGS_CHANGED);
        setContentView(R.layout.activity_main);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.desaplazamiento_arriba);
        ImageView idlogo = findViewById(R.id.idlogoinicio);
        idlogo.setAnimation(animacion2);

        new Handler().postDelayed(() -> {
            Intent intent= new Intent(MainActivity.this,loginActivity.class);
            startActivity(intent);
            finish();
        },2000);
    }
}

