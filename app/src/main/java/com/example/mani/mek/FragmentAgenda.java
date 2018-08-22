package com.example.mani.mek;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rbrooks.indefinitepagerindicator.IndefinitePagerIndicator;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAgenda extends Fragment {

    public FragmentAgenda() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_agenda, container, false);

        // How it Works
        String title = "Discover Amazing Spots";
        String desc = "Material Design Icons' growing icon collection allows designers " +
                "and developers targeting various platforms to" +
                " download icons in the format, color and size they need for any project";

        List<Container> containerList1 = new ArrayList<>();

        containerList1.add(new Container(R.drawable.ic_horse,title,desc));
        containerList1.add(new Container(R.drawable.ic_car_key,title,desc));
        containerList1.add(new Container(R.drawable.ic_cycle,title,desc));

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view1_agenda);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        ContainerAdapter adaptor1 = new ContainerAdapter(getContext(),containerList1);
        recyclerView.setAdapter(adaptor1);

        //At a time only one view can be shown
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

        // pager indicator
        recyclerView.addItemDecoration(new LinePagerIndicatorDecoration());



        //Smart Parking Featured

        String desc2 = "Basically, before onAttach and after onDetach, no activity.";

        List<Container> containerList2 = new ArrayList<>();

        containerList2.add(new Container(R.drawable.ic_find,"Find",desc2));
        containerList2.add(new Container(R.drawable.ic_location,"Locate on Map",desc2));
        containerList2.add(new Container(R.drawable.ic_navigation,"Navigate",desc2));
        containerList2.add(new Container(R.drawable.ic_time,"Advance Book",desc2));
        containerList2.add(new Container(R.drawable.ic_parking,"Park",desc2));

        RecyclerView recyclerView2 = view.findViewById(R.id.recycler_view2_agenda);
        recyclerView2.setHasFixedSize(true);

        recyclerView2.setNestedScrollingEnabled(false);

        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        ContainerAdapter2 adapter2 = new ContainerAdapter2(getContext(),containerList2);
        recyclerView2.setAdapter(adapter2);


        // Featured venues

        List<ParkingZone> parkingZoneList = new ArrayList<>();
        parkingZoneList.add(new ParkingZone(R.mipmap.park4,"Parking Zone Name"));
        parkingZoneList.add(new ParkingZone(R.mipmap.park3,"Parking Zone Name"));
        parkingZoneList.add(new ParkingZone(R.mipmap.park1,"Parking Zone Name"));


        RecyclerView recyclerView3 = view.findViewById(R.id.recycler_view3_agenda);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false));

        ParkingZoneAdapter adapter3 = new ParkingZoneAdapter(getContext(),parkingZoneList);
        recyclerView3.setAdapter(adapter3);


        // Where to Park
        String desc4 = "Basically, before onAttach and after onDetach, no activity.";

        List<Container> containerList4 = new ArrayList<>();

        containerList4.add(new Container(R.drawable.ic_free,"Free Parking",desc4));
        containerList4.add(new Container(R.drawable.ic_rupee,"Paid Parking",desc4));
        containerList4.add(new Container(R.drawable.ic_garage,"Garage Parking",desc4));
        containerList4.add(new Container(R.drawable.ic_college,"College Parking",desc4));
        containerList4.add(new Container(R.drawable.ic_plane,"Airport Parking",desc4));

        RecyclerView recyclerView4 = view.findViewById(R.id.recycler_view4_agenda);
        recyclerView4.setHasFixedSize(true);

        recyclerView4.setNestedScrollingEnabled(false);

        recyclerView4.setLayoutManager(new LinearLayoutManager(getContext()));
        // Same adopter2 is used again
        ContainerAdapter2 adapter4 = new ContainerAdapter2(getContext(),containerList4);
        recyclerView4.setAdapter(adapter4);


        // Everywhere you want to park
        String desc5 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

        List<Container5> descList = new ArrayList<>();

        descList.add(new Container5(desc5));
        descList.add(new Container5(desc5));
        descList.add(new Container5(desc5));


        RecyclerView recyclerView5 = view.findViewById(R.id.recycler_view5_agenda);
        recyclerView5.setHasFixedSize(true);

        recyclerView5.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false));

        ContainerAdapter5 adapter5 = new ContainerAdapter5(getContext(),descList);
        recyclerView5.setAdapter(adapter5);

        //At a time only one view can be shown
        PagerSnapHelper snapHelper2 = new PagerSnapHelper();
        snapHelper2.attachToRecyclerView(recyclerView5);

        IndefinitePagerIndicator indicator5 = view.findViewById(R.id.recycler_view5_indicator);
        indicator5.attachToRecyclerView(recyclerView5);













        return view;
    }

}
