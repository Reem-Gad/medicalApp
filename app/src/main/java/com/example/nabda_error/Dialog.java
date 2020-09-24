package com.example.nabda_error;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class Dialog extends AppCompatDialogFragment {
    private EditText editTextweight;
    private EditText editTextLength;
    private EditText editTextage;
    private EditText editTextchronicdisease;
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dailog, null);
        builder.setView(view);
        builder.setTitle("Login");
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent=new Intent(getActivity(),MainHome.class);
                startActivity(intent);

            }
        });
        editTextweight=view.findViewById(R.id.edit_weight);
        editTextLength=view.findViewById(R.id.edit_Length);
        editTextchronicdisease=view.findViewById(R.id.edit_chronicdisease);
        editTextage=view.findViewById(R.id.edit_age);

        return builder.create();
    }
}
