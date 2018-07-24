package com.siveco.fg.tasksuplimentarfragmente;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentTop extends Fragment {

    private ContractInterface mainActivity;
    public EditText etName, etSurname;
    public Button btnSubmit;
    String name, surname;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        etName = (EditText) view.findViewById(R.id.etName);
        etSurname = (EditText) view.findViewById(R.id.etSurname);
        btnSubmit = (Button) view.findViewById(R.id.btnSubmit);



        name = etName.getText().toString().trim();
        surname = etSurname.getText().toString().trim();

        btnSubmit.setOnClickListener(v -> mainActivity.setInfo(name, surname));

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mainActivity = (ContractInterface) context;
    }
}
