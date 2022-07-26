package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CatalogosActivity extends AppCompatActivity {

    RecyclerView idRecCatalogo;
    List<Bike> listabikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogos_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);

        //Lista das bicicletas

        listabikes.add(
                new Bike(
                        "Ciclo bike",
                        "2.500,00",
                        50,
                        R.drawable.bike
                )
        );









        //Instanciar a classe adaptadora

        MyAdapterBike adapterBike = new MyAdapterBike(getApplicationContext(),listabikes);

        //Definir o tipo de gerenciador de layout


        idRecCatalogo.setAdapter(adapterBike);


    }
}