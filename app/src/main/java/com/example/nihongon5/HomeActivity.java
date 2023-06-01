package com.example.nihongon5;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.nihongon5.interfaz.IComunicaFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.nihongon5.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity implements IComunicaFragment {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarHome.toolbar);
        binding.appBarHome.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialAlertDialogBuilder(HomeActivity.this)
                        .setTitle("Advertencia del sistema")
                        .setMessage("¿ Esta seguro de que desea cerrar su sesion ?")
                        .setPositiveButton("cerrar sesion", ((dialog, which) -> finish()))
                        .setNegativeButton("cancelar", ((dialog, which) -> dialog.cancel()))
                        .show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_introduccion, R.id.nav_alfabeto, R.id.nav_vocabulario, R.id.nav_conversacion, R.id.nav_test)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void muestraHiragana() {
    }
    @Override
    public void muestraKatakana() {
    }
    @Override
    public void muestracompuestos() {
    }

    public void RB_preguntas1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA1: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta correcta,  \n significado: mi paraguas es azul", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB1: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resC1: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resD1: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA2: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB2: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resC2: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta correcta,  \n significado: mi gato es de color negro", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resD2: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA3: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB3: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta correcta,  \n nani iro significa que color ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resC3: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resD3: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA4: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta correcta,  \n significado: la casa de rimuro es verde", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB4: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resC4: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resD4: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas5(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA5: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB5: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resC5: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resD5: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta correcta,  \n significado: este pescado esta rico", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas6(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA6: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB6: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resC6: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resD6: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta correcta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas7(View view) {
    boolean checked = ((RadioButton) view).isChecked();
    switch(view.getId()) {
        case R.id.radio_resA7: if (checked)
            Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
            break;
        case R.id.radio_resB7: if (checked)
            Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
            break;
        case R.id.radio_resC7: if (checked)
            Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
            break;
        case R.id.radio_resD7: if (checked)
            Toast.makeText(getApplicationContext(),"respuesta correcta,  \n significado: este pescado esta rico", Toast.LENGTH_SHORT).show();
            break;
    }
}
    public void RB_preguntas8(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA8: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB8: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta correcta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resC8: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resD8: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas9(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA9: if (checked)
                Toast.makeText(getApplicationContext(),"efectivamente es falso, el es estudiante de universidad no de segundaria", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB9: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void RB_preguntas10(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_resA10: if (checked)
                Toast.makeText(getApplicationContext(),"efectivamente es falso, las clases valen 6000 yen ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_resB10: if (checked)
                Toast.makeText(getApplicationContext(),"respuesta incorrecta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}