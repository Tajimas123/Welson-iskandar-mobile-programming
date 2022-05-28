package com.example.uts;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;


/**
 * A simple {@link Fragment} subclass.
 */

public class fragOne extends Fragment {
    public fragOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragone, container, false);
        ListView listview = rootView.findViewById(R.id.list);

        final String[] items = new String[]
                {"20 Mei 2022", "19 Mei 2022", "18 Mei 2022", "17 Mei 2022", "16 Mei 2022",
                        "15 Mei 2022", "14 Mei 2022", "13 Mei 2022", "12 Mei 2022", "11 Mei 2022",
                        "10 Mei 2022", "09 Mei 2022", "08 Mei 2022", "07 Mei 2022", "06 Mei 2022",
                        "05 Mei 2022", "04 Mei 2022", "03 Mei 2022", "02 Mei 2022", "01 Mei 2022"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(getActivity().getApplicationContext(), "Anda telah memilih catatan pada tanggal " + items[i], Toast.LENGTH_SHORT).show());
        return rootView;
    }
}

