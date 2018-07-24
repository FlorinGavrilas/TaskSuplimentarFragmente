package com.siveco.fg.tasksuplimentarfragmente;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentBottom extends Fragment {

    private TextView tvName, tvSurname;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        tvName = (TextView) view.findViewById(R.id.tvName);
        tvSurname = (TextView) view.findViewById(R.id.tvSurname);

        return view;
    }

    public void setInfo(String name, String surname) {

        tvName.setText("Nume: " + name);
        tvSurname.setText("Prenume: " + surname);
    }
}
