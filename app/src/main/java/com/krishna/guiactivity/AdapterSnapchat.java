package com.krishna.guiactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterSnapchat extends BaseAdapter {

    Context mContext;
    String[] mfrdname;
    String[] mfrdh;
    int[] mfrdimg;

    String[] sms;


    public AdapterSnapchat(Context mContext, String[] mfrdname, int[] mfrdimg, String[] mfrdh){
        this.mContext = mContext;
        this.mfrdname = mfrdname;
        this.mfrdimg = mfrdimg;
        this.mfrdh = mfrdh;

    }
    @Override
    public int getCount() {
        return mfrdname.length;
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
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.snap_listview,null);

        }else{
            view = convertView;
        }
        ImageView imageView = view.findViewById(R.id.frdimg1);
        TextView frdname = view.findViewById(R.id.txlist1);
        TextView frdh = view.findViewById(R.id.txtlist3);



        frdname.setText(mfrdname[position]);
        frdh.setText(mfrdh[position]);
        imageView.setImageResource(mfrdimg[position]);


        return view;
    }
}
