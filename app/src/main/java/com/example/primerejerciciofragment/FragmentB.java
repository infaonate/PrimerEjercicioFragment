package com.example.primerejerciciofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    public FragmentB() { /* Constructor vacío obligatorio */ }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        //Inflamos el layout del fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        //Referencia al botón
        Button btnIrA = view.findViewById(R.id.btnIrA);

        //Al pulsarlo, se abre una nueva instancia de FragmentA
        btnIrA.setOnClickListener(v -> {

            //Pedimos a la Activity que cambie al Fragment A
            ((com.example.primerejerciciofragment.MainActivity) getActivity()).mostrarFragment(new com.example.primerejerciciofragment.FragmentA());
        });
    }
}
