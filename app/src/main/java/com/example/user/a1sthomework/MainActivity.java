package com.example.user.a1sthomework;

import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] member_names;
    TypedArray profile_pics;
    String[] statues;
    String[] contactType;



    List<RowItem> rowItems;
    GridView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        member_names = getBaseContext().getResources().getStringArray(R.array.Member_names);
        profile_pics = getBaseContext().getResources().obtainTypedArray(R.array.profile_pics);
        contactType = getBaseContext().getResources().getStringArray(R.array.contactType);
        statues = getBaseContext().getResources().getStringArray(R.array.statues);

        rowItems = new ArrayList<RowItem>();
        profile_pics = getResources().obtainTypedArray(R.array.profile_pics);

        statues = getResources().getStringArray(R.array.statues);

        contactType = getResources().getStringArray(R.array.contactType);

        for (int i = 0; i < member_names.length; i++) {
            RowItem item = new RowItem(
                    profile_pics.getResourceId(i, -1),member_names[i]);
            rowItems.add(item);
        }

        mylistview = (GridView) findViewById(R.id.gridview);
        CustomAdapter adapter = new CustomAdapter(this, rowItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        String member_name = rowItems.get(position).getMember_name();
        Toast.makeText(getApplicationContext(), "" + member_name,
                Toast.LENGTH_SHORT).show();
    }





}