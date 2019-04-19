package com.example.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyView = findViewById(R.id.recyView);

        ///creaate contact list
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Saguat Malla","9842414241",R.drawable.saugat));
        contactList.add(new Contact("Dahayang Rai","9842414241",R.drawable.dahayang));
        contactList.add(new Contact("Bhuwan KC","9842414241",R.drawable.bhuwan));
        contactList.add(new Contact("Rajesh Hamal","9842414241",R.drawable.rajesh));

        ContactAdapter contactAdapter = new ContactAdapter(this,contactList);
        recyView.setAdapter(contactAdapter);
        recyView.setLayoutManager(new GridLayoutManager(this,2));


    }
}
