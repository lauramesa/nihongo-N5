package com.example.nihongon5.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nihongon5.R;

public class nav_vocabulario extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    View vista;
    String []kanji ={"「 犬 」", "「 猫 」", "「 兎 」", "「 魚 」", "「 蛇 」", "「 亀 」", "「 虎 」", "「 狐 」",
            "「 雨 」", "「 色」", "「 歌 」", "「 音楽 」","「 風邪 」","「 言葉 」", "「 仕事 」","「 質問 」",
            "「電気」","「天気」","「名前」", "「病気」"};
    String []hiragana ={"いぬ", "ねこ", "うさぎ", "さかな", "へび", "かめ", "とら", "きつね",
            "あめ","いろ", "うた", "おんがく","かぜ","ことば","しごと","しつもん","でんき","てんき","なまえ","びょうき"};
    String []sig ={"perro", "gato", "conejo", "pez", "serpiente", "tortuga", "tigre", "zorro",
            "lluvia","color","cancion","musica","resfriado","palabra","trabajo", "pregunta","electricidad",
            "tiempo","nombre","enfermedad"};
    int []fotos ={R.drawable.perro, R.drawable.gato, R.drawable.conejo, R.drawable.pez, R.drawable.serpiente,
            R.drawable.tortuga, R.drawable.tigre, R.drawable.zorro,
            R.drawable.perro,R.drawable.perro,R.drawable.perro,R.drawable.perro,R.drawable.perro,R.drawable.perro,
            R.drawable.perro,R.drawable.perro,R.drawable.perro,R.drawable.perro,R.drawable.perro,R.drawable.perro};

    public nav_vocabulario() {
        // Required empty public constructor
    }

    public static nav_vocabulario newInstance(String param1, String param2) {
        nav_vocabulario fragment = new nav_vocabulario();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista=inflater.inflate(R.layout.fragment_nav_vocabulario, container, false);
        RecyclerView rv1 = vista.findViewById(R.id.rv1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rv1.setLayoutManager(linearLayoutManager);
        rv1.setAdapter(new Adaptador());
        return vista;
    }
    private  class Adaptador extends RecyclerView.Adapter<Adaptador.AdaptadorHolder>{
        @NonNull
        @Override
        public AdaptadorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdaptadorHolder(getLayoutInflater().inflate(R.layout.layout_tarjeta,parent,false));
        }
        @Override
        public void onBindViewHolder(@NonNull AdaptadorHolder holder, int position) {
            holder.imprimir(position);
        }
        @Override
        public int getItemCount() {
            return kanji.length;
        }
        class  AdaptadorHolder extends RecyclerView.ViewHolder{
            ImageView img1;
            TextView kanjitx1, hiratx2, sigtv3;
            public  AdaptadorHolder(@NonNull View itemView){
                super(itemView);
                img1=itemView.findViewById(R.id.imageTarjeta);
                kanjitx1 = itemView.findViewById(R.id.textTarjeta1);
                hiratx2 = itemView.findViewById(R.id.textTarjeta2);
                sigtv3 = itemView.findViewById(R.id.textTarjeta3);
            }
            public void imprimir(int position) {
                img1.setImageResource(fotos[position]);
                kanjitx1.setText(kanji[position]);
                hiratx2.setText(hiragana[position]);
                sigtv3.setText(String.format("significado: %s", sig[position]));
            }
        }
    }
}