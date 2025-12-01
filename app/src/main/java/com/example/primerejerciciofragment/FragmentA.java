package com.example.primerejerciciofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    public FragmentA() { /*Constructor vacío obligatorio */ }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Inflamos el layout del fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        //Obtenemos referencia al botón
        Button btnIrB = view.findViewById(R.id.btnIrB);

        //Al pulsar, abrimos una NUEVA instancia de FragmentB
        btnIrB.setOnClickListener(v -> {

            //Llamamos al metodo de la Activity para cambiar de fragment
            ((com.example.primerejerciciofragment.MainActivity) getActivity()).mostrarFragment(new FragmentB());
        });
    }
}
