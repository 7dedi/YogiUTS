package com.example.yogiuts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RumahsakitFragment extends Fragment {
private RecyclerView rvCinema;
private final ArrayList<Rumahsakit> list = new ArrayList<>();

public RumahsakitFragment() {
    // Required empty public constructor
}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_rumahsakit, container, false);
    rvCinema = view.findViewById(R.id.Rumahsakitfragment);
    rvCinema.setHasFixedSize(true);

    list.addAll(RumahsakitData.getListRumahsakit());
    showRecyclerList();

    return view;
}

private void showRecyclerList() {
    rvCinema.setLayoutManager(new LinearLayoutManager(this.getContext()));
    ListRumahsakitAdapter listCinemaAdapter = new ListRumahsakitAdapter(list, requireContext());
    listCinemaAdapter.setListRumahsakit(list);
    rvCinema.setAdapter(listCinemaAdapter);

}

}