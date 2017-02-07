package com.example.thanhvu.custom_listview2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.thanhvu.custom_listview2.adapter.Custom_adapter;
import com.example.thanhvu.custom_listview2.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
        ArrayList<Contact> arrList =new ArrayList<>();
        Contact contact1=new Contact("3242424", Color.BLUE,"Nguyen Thanh Vu");
        Contact contact2=new Contact("655544", Color.BLACK,"Tran Hoang Khanh");
        Contact contact3=new Contact("3242424", Color.GRAY,"Phan Khanh Toan");
        Contact contact4=new Contact("3242df", Color.WHITE,"Bui Ngoc Huynh");
        Contact contact5=new Contact("erwer324er", Color.RED,"Tong Dinh Dan");
        Contact contact6=new Contact("3242342234", Color.GREEN,"Nguyen Hoang Tuan");
        arrList.add(contact1);
        arrList.add(contact2);
        arrList.add(contact3);
        arrList.add(contact4);
        arrList.add(contact5);
        arrList.add(contact6);

        Custom_adapter custom_adapter=new Custom_adapter(this,R.layout.custom_layout,arrList);
        lv.setAdapter(custom_adapter);

    }
}
