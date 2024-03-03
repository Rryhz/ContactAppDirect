package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
            String telepon[]={
                    "082315060203",
                    "082216430100",
                    "082119394048",
                    "081312004854"
        };
        ListView lvContact = findViewById(R.id.lvContact);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, telepon);

        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms: "+telepon[position]));
                startActivity(intent);
            }
        });


    }
}