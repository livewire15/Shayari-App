/* package com.example.intel.shayari;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by intel on 29/07/2017.


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    String categories[];
    int icons[];
    Context c;

    //Constructor
    public RecyclerAdapter(String categories[],int icons[],Context c)
    {
        this.categories=categories;
        this.icons=icons;
        this.c=c;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view,parent,false);
        //New view is created and its contents are inflated from view.xml
        RecyclerViewHolder rvh=new RecyclerViewHolder(view);
        //new view is passed to view holder to store
        return rvh;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        //set the content on particular views
        Picasso.with(c)
                .load(icons[position])
                .resize(100,75)
                .into(holder.i1);
        //holder.i1.setImageResource(icons[0]);
        holder.t1.setText(categories[position]);
    }

    @Override
    public int getItemCount() {
        return categories.length;

    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        ImageView i1;
        TextView t1;
        public RecyclerViewHolder(View v)
        {
            super(v);
            i1=(ImageView)v.findViewById(R.id.imgview);
            //Now image view and text view is extracted from the passed view that is created in onCreateViewHolder method
            t1=(TextView)v.findViewById(R.id.textview1);
        }
    }
}
*/