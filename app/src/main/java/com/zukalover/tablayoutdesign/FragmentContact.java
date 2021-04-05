package com.zukalover.tablayoutdesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Contact> contactList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.recent_fragment,container,false);

        recyclerView = v.findViewById(R.id.recyclerview_list_contacts);
        ContactAdapter contactAdapter = new ContactAdapter(getContext(),contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(contactAdapter);
        return v;
    }

    /**
     * THIS WILL BE CALLED FIRST BEFORE THE ON-CREATE-VIEW
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactList = new ArrayList<>();

        contactList.add(new Contact("Gontse","0647860941",R.drawable.ic_finger));
        contactList.add(new Contact("Zukalover","0647860941",R.drawable.ic_finger));

    }
}
