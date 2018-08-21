package com.example.mani.mek;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentProfile extends Fragment {


    public FragmentProfile() {
        // Required empty public constructor
    }

    List<String> mList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_profile, container, false);

        mList = new ArrayList<>();

        mList.add("Manilal");
        mList.add("Avinash");
        mList.add("Aashish");
        mList.add("Raj");
        mList.add("Awadesh");
        mList.add("Manilal");
        mList.add("Avinash");
        mList.add("Aashish");
        mList.add("Raj");
        mList.add("Awadesh");
        mList.add("Manilal");
        mList.add("Avinash");
        mList.add("Aashish");
        mList.add("Raj");
        mList.add("Awadesh");
        mList.add("Manilal");
        mList.add("Avinash");
        mList.add("Aashish");
        mList.add("Raj");
        mList.add("Awadesh");

        ListView listView = view.findViewById(R.id.listView_profile);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, mList);
        listView.setAdapter(adapter);

        return view;
    }

}
