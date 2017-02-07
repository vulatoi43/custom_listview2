package com.example.thanhvu.custom_listview2.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thanhvu.custom_listview2.R;
import com.example.thanhvu.custom_listview2.model.Contact;

import java.util.ArrayList;

/**
 * Created by Thanh Vu on 02/02/2017.
 */
public class Custom_adapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resources;
    private ArrayList<Contact> arrcontact;
    private String TAG=getClass().getSimpleName();
    public Custom_adapter(Context context, int resource, ArrayList<Contact> arrcontact) {
        super(context, resource, arrcontact);
        this.context=context;
        this.resources=resource;
        this.arrcontact=arrcontact;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewholder = new ViewHolder();
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_layout,parent,false);
            viewholder.image= (TextView) convertView.findViewById(R.id.image);
            viewholder.txtv=(TextView) convertView.findViewById(R.id.txtv);
            viewholder.txtv2=(TextView) convertView.findViewById(R.id.txtv2);
            convertView.setTag(viewholder);
        }
        else{
            viewholder= (ViewHolder) convertView.getTag();
        }

        Contact contact=arrcontact.get(position);
        viewholder.image.setText(String.valueOf(position+1));
        viewholder.image.setBackgroundColor(contact.getmColor());
        viewholder.txtv.setText(contact.getmName());
        viewholder.txtv2.setText(contact.getmNumber());
        Log.d(TAG, "getView: "+position);

        return convertView;
    }
    public class ViewHolder {
        TextView image, txtv, txtv2;

    }
   

}
