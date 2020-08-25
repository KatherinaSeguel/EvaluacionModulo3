package com.example.recyclerviewdesdecero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import  java.util.ArrayList ;
import  java.util.List ;
public class MainActivity extends AppCompatActivity {
    ArrayList<String> listDatos;
    RecyclerView recycler;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recycler=findViewById(R.id.Recyclerid);

        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        listDatos= new ArrayList<String>();

        //lleno mi listadatos

        for (int i=0 ;i<= 49;i++){
            listDatos.add("departamento" + i);
        }
            AdaptadorDatos adapter = new AdaptadorDatos(listDatos);
           recycler.setAdapter(adapter);


    }
}