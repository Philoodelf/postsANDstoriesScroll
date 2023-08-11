package com.example.loginroute;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView reco;
    RecyclerView stry;
    adapter adapter;
    com.example.loginroute.storyadapter storyadapter;
    ArrayList<items> items;
    ArrayList<stories_items> stories_items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        reco=findViewById(R.id.shared_posts);
        stry=findViewById(R.id.stories);
        iniate();
        iniate2();
        adapter=new adapter(items);
        storyadapter=new storyadapter(stories_items);
        reco.setAdapter(adapter);
        stry.setAdapter(storyadapter);
    }
    public void iniate(){
        items = new ArrayList<>();
        items.add(new items(R.drawable.shadowprofile,R.drawable.sf3,"shadow","4hrs"));
        items.add(new items(R.drawable.shadowprofile,R.drawable.night,"shadow","4hrs"));
        items.add(new items(R.drawable.shadowprofile,R.drawable.sf3,"shadow","4hrs"));

    }

    public void  iniate2(){
        stories_items = new ArrayList<>();
        stories_items.add(new stories_items(R.drawable.shadowfuture,"Shadow"));
        stories_items.add(new stories_items(R.drawable.shadowmay,"May"));
        stories_items.add(new stories_items(R.drawable.shadowhuman, "Human"));
    }


}