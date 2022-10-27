package com.example.kawaiicards;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List items = new ArrayList();
        items.add(new Anime(R.drawable.ghoul, "Tokyo Ghoul",7887));
        items.add(new Anime(R.drawable.revengers, "Tokyo Revengers", 230));
        items.add(new Anime(R.drawable.demons, "Demons Slayer", 456));
        items.add(new Anime(R.drawable.shingeky, "Shingeky No Kyojin", 3));
        items.add(new Anime(R.drawable.one, "One punch-man",75656));
        items.add(new Anime(R.drawable.plunderer, "Plunderer",7887));
// Obtener el Recycler
                                        recycler = (RecyclerView) findViewById(R.id.reciclador2);
        recycler.setHasFixedSize(true);
// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
// Crear un nuevo adaptador adapter =
        adapter=new AnimeAdapter(items);
        recycler.setAdapter(adapter);
    }
}
