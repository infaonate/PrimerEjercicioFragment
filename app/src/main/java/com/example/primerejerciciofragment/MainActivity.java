package com.example.primerejerciciofragment;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Al arrancar, cargamos el Fragment A como pantalla inicial
        mostrarFragment(new FragmentA());
    }

    //Metodo generico para cambiar de Fragment (crea instancias nuevas)
    public void mostrarFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //replace() para sustituir el fragment actual
        //addToBackStack(null) permite volver atrás sin cerrar la Activity
        ft.replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit();
    }
}
