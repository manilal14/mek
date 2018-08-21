package com.example.mani.mek;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContainerAdapter2 extends RecyclerView.Adapter<ContainerAdapter2.Container2ViewHolder> {

    Context mCtx;
    List<Container> mContainer2List;

    public ContainerAdapter2(Context mCtx, List<Container> mContainer2List) {
        this.mCtx = mCtx;
        this.mContainer2List = mContainer2List;
    }
    @Override
    public ContainerAdapter2.Container2ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recycler_view_2_single_layout,parent,false);
        return new Container2ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ContainerAdapter2.Container2ViewHolder holder, int position) {

        Container aContainer = mContainer2List.get(position);

        holder.iv_icon.setImageResource(aContainer.getImage_id());
        holder.tv_title.setText(aContainer.getTitle());
        holder.tv_desc.setText(aContainer.getDesc());

    }

    @Override
    public int getItemCount() {
        return mContainer2List.size();
    }

    public class Container2ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_icon;
        TextView tv_title, tv_desc;

        public Container2ViewHolder(View itemView) {
            super(itemView);

            iv_icon  = itemView.findViewById(R.id.icon);
            tv_title = itemView.findViewById(R.id.title);
            tv_desc  = itemView.findViewById(R.id.description);
        }
    }
}
