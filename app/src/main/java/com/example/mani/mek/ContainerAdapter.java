package com.example.mani.mek;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContainerAdapter extends RecyclerView.Adapter<ContainerAdapter.ContainerViewHolder>{

    Context mCtx;
    List<Container> mContainerList;

    public ContainerAdapter(Context mCtx, List<Container> mContainerList) {
        this.mCtx = mCtx;
        this.mContainerList = mContainerList;
    }

    @Override
    public ContainerAdapter.ContainerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recycler_view_1_single_layout,parent,false);
        return new ContainerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContainerAdapter.ContainerViewHolder holder, int position) {

        Container aContainer = mContainerList.get(position);

        holder.iv_icon.setImageResource(aContainer.getImage_id());
        holder.tv_title.setText(aContainer.getTitle());
        holder.tv_desc.setText(aContainer.getDesc());


    }

    @Override
    public int getItemCount() {
        return mContainerList.size();
    }

    public class ContainerViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_icon;
        TextView tv_title, tv_desc;

        public ContainerViewHolder(View itemView) {
            super(itemView);

            iv_icon  = itemView.findViewById(R.id.icon);
            tv_title = itemView.findViewById(R.id.title);
            tv_desc  = itemView.findViewById(R.id.description);



        }
    }
}
