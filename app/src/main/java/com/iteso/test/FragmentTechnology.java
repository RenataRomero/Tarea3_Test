package com.iteso.test;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentTechnology.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentTechnology#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTechnology extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentTechnology() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTechnology.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTechnology newInstance(String param1, String param2) {
        FragmentTechnology fragment = new FragmentTechnology();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.fragmentTechnology);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ItemProduct> products = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("MAC\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Zapopan, Jalisco");
        itemProduct.setPhone("33 38291029");
        itemProduct.setImage(0);
        itemProduct.setDescription("Mac ultima generacion con pantalla optima core i7 y mochila incluida.");
        ItemProduct itemProduct1 = new ItemProduct();
        itemProduct1.setTitle("Alienware");
        itemProduct1.setStore("BestBuy");
        itemProduct1.setLocation("Zapopan, Jalisco");
        itemProduct1.setPhone("33 38291029");
        itemProduct1.setImage(1);
        itemProduct1.setDescription("Alienware exclusiva para ese gamer que llevas en tu interior");
        products.add(itemProduct);
        products.add(itemProduct1);

        adapter = new AdapterProduct(getActivity(),products);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
