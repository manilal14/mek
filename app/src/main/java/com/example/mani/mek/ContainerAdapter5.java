package com.example.mani.mek;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class ContainerAdapter5 extends RecyclerView.Adapter<ContainerAdapter5.Container5ViewHolder> {


    Context mCtx;
    List<Container5> mContainer5List;

    public ContainerAdapter5(Context mCtx, List<Container5> mContainer5List) {
        this.mCtx = mCtx;
        this.mContainer5List = mContainer5List;
    }

    @Override
    public ContainerAdapter5.Container5ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recycler_view_5_single_layout,parent,false);
        return new Container5ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContainerAdapter5.Container5ViewHolder holder, int position) {

        Container5 aContainer = mContainer5List.get(position);
        holder.tv_desc.setText(aContainer.getDesc());

    }

    @Override
    public int getItemCount() {
        return mContainer5List.size();
    }

    public class Container5ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_desc;

        public Container5ViewHolder(View itemView) {
            super(itemView);

            tv_desc = itemView.findViewById(R.id.description);
        }
    }
}
