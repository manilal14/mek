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

class ParkingZoneAdapter extends RecyclerView.Adapter<ParkingZoneAdapter.ParkingZoneViewHolder> {

    Context mCtx;
    List<ParkingZone> mParkingZoneList;

    public ParkingZoneAdapter(Context mCtx, List<ParkingZone> mParkingZoneList) {
        this.mCtx = mCtx;
        this.mParkingZoneList = mParkingZoneList;
    }

    @Override
    public ParkingZoneAdapter.ParkingZoneViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.parking_zone_single_layout,parent,false);
        return new ParkingZoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParkingZoneAdapter.ParkingZoneViewHolder holder, int position) {

        ParkingZone zone = mParkingZoneList.get(position);

        int parking_no = position+1;
        holder.iv_icon.setImageResource(zone.getImage_id());
        holder.tv_title.setText(""+parking_no+"."+zone.getTitle());

    }

    @Override
    public int getItemCount() {
        return mParkingZoneList.size();
    }

    public class ParkingZoneViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_icon;
        TextView tv_title;

        public ParkingZoneViewHolder(View itemView) {
            super(itemView);

            iv_icon  = itemView.findViewById(R.id.icon);
            tv_title = itemView.findViewById(R.id.title);
        }
    }
}
