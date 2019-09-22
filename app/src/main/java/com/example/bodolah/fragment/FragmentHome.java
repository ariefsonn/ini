package com.example.bodolah.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bodolah.Product;
import com.example.bodolah.ProductAdapter;
import com.example.bodolah.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    View view;
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView, rv;

    GridLayoutManager glm, gridLayoutManager;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_home, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.news1);
        rv = (RecyclerView) view.findViewById(R.id.rv_category);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.macbook));

        productList.add(
                new Product(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        60000,
                        R.drawable.dellinspiron));

        productList.add(
                new Product(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.surface));

        productList.add(
                new Product(1,
                        "ROG ZYPRUS S GM 701 Core I9 9th Gen - (16 GB/500 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        5.0,
                        70000,
                        R.drawable.r));



        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(getActivity(), productList);
        glm = new GridLayoutManager(getActivity(), 1);
        gridLayoutManager = new GridLayoutManager(getActivity(), 1, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(glm);
        rv.setLayoutManager(gridLayoutManager);


        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
        rv.setAdapter(adapter);


        return view;
    }
}
