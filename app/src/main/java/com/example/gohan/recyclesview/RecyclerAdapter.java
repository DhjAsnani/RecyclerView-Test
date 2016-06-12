package com.example.gohan.recyclesview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Freeware Sys on 6/12/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    // declaring array list
    ArrayList<ListProvider> arrayList = new ArrayList<ListProvider>();

    public RecyclerAdapter(ArrayList<ListProvider> arrayList)
    {
        this.arrayList = arrayList;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerViewHolder recyclerViewHolder;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
        recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        ListProvider listProvider;
        listProvider = arrayList.get(position);
        holder.list_image.setImageResource(listProvider.getImage_id());
        holder.list_country.setText(listProvider.getName());
        holder.list_capital.setText(listProvider.getCapital());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        // for list
        ImageView list_image;
        TextView list_country,list_capital;
        //for header
        TextView title_flag,title_country,title_capital;
        public RecyclerViewHolder(View view)
        {
            super(view);
            list_image = (ImageView) view.findViewById(R.id.flag_id);
            list_capital= (TextView) view.findViewById(R.id.capitol_id);
            list_country= (TextView) view.findViewById(R.id.country_id);

        }
    }
}


