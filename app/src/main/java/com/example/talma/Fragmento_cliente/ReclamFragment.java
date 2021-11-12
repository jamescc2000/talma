package com.example.talma.Fragmento_cliente;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.talma.Adapters.AdaptadorReclamo;
import com.example.talma.Modelos.ModeloReclamo;
import com.example.talma.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReclamFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReclamFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    AdaptadorReclamo adaptadorReclamo;
    List<ModeloReclamo> modeloReclamo;

    public ReclamFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReclamFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReclamFragment newInstance(String param1, String param2) {
        ReclamFragment fragment = new ReclamFragment();
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
        return inflater.inflate(R.layout.fragment_reclam, container, false);
    }
}