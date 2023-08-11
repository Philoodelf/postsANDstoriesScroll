package com.example.loginroute;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class storyadapter extends RecyclerView.Adapter<storyadapter.viewholder>  {

    ArrayList<stories_items> stories_items;

    public storyadapter(ArrayList<stories_items> stories_items){
        this.stories_items = stories_items;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_stories_layout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        stories_items stryitems = stories_items.get(position);
        holder.nameofstory.setText(stryitems.nameofstory);
        holder.story.setImageResource(stryitems.story);

    }

    @Override
    public int getItemCount() {
        if (stories_items == null) return 0;
        return stories_items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        ImageView story;
        TextView nameofstory;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            story = itemView.findViewById(R.id.story);
            nameofstory = itemView.findViewById(R.id.nameofstory);
        }
    }

}
