package com.example.loginroute;

import android.annotation.SuppressLint;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {
    ArrayList<items> items;

    public adapter(ArrayList<items> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_layout, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        items item = items.get(position);
        holder.profile.setImageResource(item.profile);
        holder.post.setImageResource(item.post);
        holder.name.setText(item.name);
        holder.hr.setText(item.hr);


    }

    @Override
    public int getItemCount() {
        if (items == null) return 0;
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView profile, post;
        TextView name, hr;
        Button like, comment, share, learn, sms, more;


        public viewholder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
            post = itemView.findViewById(R.id.pst);
            name = itemView.findViewById(R.id.name);
            hr = itemView.findViewById(R.id.hrs);
            like = itemView.findViewById(R.id.like);
            comment = itemView.findViewById(R.id.comment);
            share = itemView.findViewById(R.id.share);
            learn = itemView.findViewById(R.id.learnmore);
            sms = itemView.findViewById(R.id.sms);
            more = itemView.findViewById(R.id.more);
        }
    }
}
