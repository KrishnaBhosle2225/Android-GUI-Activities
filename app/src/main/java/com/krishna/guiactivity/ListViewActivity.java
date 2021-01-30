package com.krishna.guiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    String[] companyName={"Tesla","Amazon","Google","Microsoft","Facebook","Twitter","Apple","TCS","Infosys","IBM","Oracle"};

    int[] companyImage= {R.drawable.tesla, R.drawable.amazon, R.drawable.google, R.drawable.microsoft, R.drawable.facebook, R.drawable.twitter, R.drawable.apple, R.drawable.tata,
            R.drawable.infosys, R.drawable.ibm, R.drawable.oracle};

    AdapterCompany adapterCompany;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);

        adapterCompany = new AdapterCompany(ListViewActivity.this,companyName,companyImage);

        listView.setAdapter(adapterCompany);
        listView.setOnItemClickListener(new ListViewClickListener());

    }

    class ListViewClickListener implements AdapterView.OnItemClickListener
    {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            view.setBackgroundColor(Color.GRAY);
        }
    }
}