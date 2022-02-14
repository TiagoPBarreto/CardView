package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.adapter.PostagemAdapter;
import com.cursoandroid.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Define layout
           // LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            //layoutManager.setOrientation(LinearLayout.HORIZONTAL);

                //Grid Layout
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
            recyclerPostagem.setLayoutManager(layoutManager);
        //Define adapter
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        this.prepararPostagens();
            recyclerPostagem.setAdapter(adapter);

    }
            //reculperar postagens
        public void prepararPostagens(){

            Postagem p = new Postagem("Tiago Barreto ", "#tbt Viagem legal! ", R.drawable.imagem1);
            this.postagens.add(p);

            p = new Postagem("Hotel JM ", "Viaje, aproveite nssos descontos ", R.drawable.imagem2);
            this.postagens.add(p);

            p = new Postagem("Maria Luiza ", "#Paris! ", R.drawable.imagem3);
            this.postagens.add(p);

            p = new Postagem("Marcos Paulo ", "Que foto linda! ", R.drawable.imagem4);
            this.postagens.add(p);
        }
}