package com.krishna.guiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SnapchatActivity extends AppCompatActivity {

    ListView listView;

    String[] frdName = {"Sarvesh Kadlag","Chetan Jadhav","Chinmay Chakral","Mahesh Thakre","Ullas Rathod","Bhagesh Bhosle","Johney Thakre","Jayesh Bhadane","Riddhesh Gaonkar","Hamza Shekh"};

    String[] frdh = {"12m","44m","1h","2h","4","6h","8h","13h","18h","1d"};

    int[] frdImages = {R.drawable.i1,R.drawable.i2jpg,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10};

   AdapterSnapchat adapterSnapchat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapchat);

        listView = findViewById(R.id.listsnap);

        adapterSnapchat = new AdapterSnapchat(SnapchatActivity.this,frdName,frdImages,frdh);

        listView.setAdapter(adapterSnapchat);

        listView.setOnItemClickListener(new ListItemClickListener());

    }

    class ListItemClickListener implements AdapterView.OnItemClickListener
    {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            listView.setBackgroundColor(Color.GRAY);
        }
    }
}