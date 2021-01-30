package com.krishna.guiactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterCompany extends BaseAdapter {

    Context mContext;
    String[] mCompanyList;
    int[] mCompanyLogo;

    public AdapterCompany(Context mContext, String[] mCompanyList, int[] mCompanyLogo) {

        this.mContext=mContext;
        this.mCompanyList=mCompanyList;
        this.mCompanyLogo= mCompanyLogo;
    }
    @Override
    public int getCount() {
        return mCompanyList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        if (convertView==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.listview,null);
        }
        else {
            view = convertView;
        }
        ImageView companyImageView = view.findViewById(R.id.imageviewCompany);
        TextView companyName = view.findViewById(R.id.textviewCompany);

        companyName.setText(mCompanyList[position]);
        companyImageView.setImageResource(mCompanyLogo[position]);
        return view;
    }
}
