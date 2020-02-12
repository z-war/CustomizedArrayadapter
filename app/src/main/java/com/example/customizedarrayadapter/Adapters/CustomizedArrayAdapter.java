package com.example.customizedarrayadapter.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.customizedarrayadapter.Models.HumanModel;
import com.example.customizedarrayadapter.R;

import java.util.ArrayList;

public class CustomizedArrayAdapter extends ArrayAdapter<HumanModel> {
    private ArrayList<HumanModel> ojectArraylist;
    private Context context;
    public CustomizedArrayAdapter(@androidx.annotation.NonNull Context context, int resource , ArrayList<HumanModel> ar) {
        super(context, resource,ar);
        this.context = context;
        this.ojectArraylist = ar;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View my_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row,parent,false);
        ImageView img_ico = my_row.findViewById(R.id.row_icon);
        TextView TV = my_row.findViewById(R.id.row_TV);

        img_ico.setImageResource(ojectArraylist.get(position).getAvatarReference());
        TV.setText(ojectArraylist.get(position).getName());

        img_ico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hello you clicked image  "+position, Toast.LENGTH_SHORT).show();
            }
        });
        return  my_row;
    }
}
