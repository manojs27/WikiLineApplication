package com.bangalore.wikiline.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bangalore.wikiline.R;
import com.bangalore.wikiline.model.Pages;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

public class PageAdapter extends RecyclerView.Adapter<PageAdapter.PageViewHolder> {

    private List<Pages> pagesList;
    private int rowLayout;
    private Context context;

    public PageAdapter(List<Pages> pagesList, int rowLayout, Context context) {
        this.pagesList = pagesList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    public static class PageViewHolder extends RecyclerView.ViewHolder {
        LinearLayout llLayout;
        TextView mTitle;
        TextView data;
        ImageView mImage;


        public PageViewHolder(View v) {
            super(v);
            llLayout = (LinearLayout) v.findViewById(R.id.ll_layout);
            mTitle = (TextView) v.findViewById(R.id.title);
            data = (TextView) v.findViewById(R.id.subtitle);
            mImage = (ImageView) v.findViewById(R.id.wiki_image);
        }

        public ImageView getImage() {
            return this.mImage;
        }
    }

    @Override
    public PageViewHolder onCreateViewHolder(ViewGroup parent,
                                             int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PageViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PageViewHolder holder, final int position) {
        holder.mTitle.setText(pagesList.get(position).getTitle());
        if (pagesList.get(position).getTerms() != null) {
            holder.data.setText(pagesList.get(position).getTerms().getmDescription().get(0));
        }
        if (pagesList.get(position).getThumbnail() != null) {
            Glide.with(this.context)
                    .load(pagesList.get(position).getThumbnail().getSource())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.getImage());
        }
    }

    @Override
    public int getItemCount() {
        return pagesList.size();
    }

}