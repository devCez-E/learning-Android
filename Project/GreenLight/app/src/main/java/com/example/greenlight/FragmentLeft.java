package com.example.greenlight;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentLeft#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentLeft extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private OnColorButtonListener onColorButtonListener;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentLeft() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        onColorButtonListener = (OnColorButtonListener) context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentLeft.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentLeft newInstance(String param1, String param2) {
        FragmentLeft fragment = new FragmentLeft();
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
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        view.findViewById(R.id.btn_r).setOnClickListener(this);
        view.findViewById(R.id.btn_g).setOnClickListener(this);
        view.findViewById(R.id.btn_b).setOnClickListener(this);
        view.findViewById(R.id.btn_y).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_r:
                onColorButtonListener.onColorClick(0);
                break;
            case R.id.btn_g:
                onColorButtonListener.onColorClick(1);
                break;
            case R.id.btn_b:
                onColorButtonListener.onColorClick(2);
                break;
            case R.id.btn_y:
                onColorButtonListener.onColorClick(3);
                break;

        }
    }
}