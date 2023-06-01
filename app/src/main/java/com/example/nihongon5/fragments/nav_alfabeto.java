package com.example.nihongon5.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nihongon5.Al_Hiragana;
import com.example.nihongon5.Al_Katakana;
import com.example.nihongon5.Al_compuestos;
import com.example.nihongon5.R;
import com.example.nihongon5.interfaz.IComunicaFragment;
public class nav_alfabeto extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    Activity actividad;
    CardView cd_hira, cd_kana, cd_com;
    IComunicaFragment interfaceFragment;

    public nav_alfabeto() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static nav_alfabeto newInstance(String param1, String param2) {
        nav_alfabeto fragment = new nav_alfabeto();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista=inflater.inflate(R.layout.fragment_nav_alfabeto, container, false);
        cd_hira = vista.findViewById(R.id.id_cardHiragana);
        cd_kana = vista.findViewById(R.id.id_cardKatakana);
        cd_com = vista.findViewById(R.id.id_cardCompuestos);

        cd_hira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Al_Hiragana.class);
                startActivity(intent);
            }
        });
        cd_kana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Al_Katakana.class);
                startActivity(intent);
            }
        });
        cd_com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Al_compuestos.class);
                startActivity(intent);
            }
        });
        return vista;
    }
}