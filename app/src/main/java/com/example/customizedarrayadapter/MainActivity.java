package com.example.customizedarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.customizedarrayadapter.Adapters.CustomizedArrayAdapter;
import com.example.customizedarrayadapter.Models.HumanModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<HumanModel> myarray;
    private  ListView view;
    private CustomizedArrayAdapter customadapterobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private  void initialize()
    {
        view = findViewById(R.id.LV);
        myarray = new ArrayList<>();
        createObjectofHuman();
        initializecustomadapter();
    }

    private void createObjectofHuman()
    {
        try{
            HumanModel human1,human2,human3,human4,human5,human6;
            human2 = new HumanModel("Hasseb",R.drawable.ordered1);
            human3 = new HumanModel("Ahad",R.drawable.ordered2);
            human4 = new HumanModel("Umar",R.drawable.ordered3);
            human5 = new HumanModel("Kashan",R.drawable.ordered4);
            human6 = new HumanModel("Usama",R.drawable.ordered5);
            human1 = new HumanModel("Usama",R.drawable.ordered0);
            myarray.add(human1);

            myarray.add(human2);
            myarray.add(human3);
            myarray.add(human4);
            myarray.add(human5);
            myarray.add(human6);

        }
        catch(Exception ee)
        {
            Toast.makeText(this,"createobject of human"+ee.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }



    private void initializecustomadapter()
    {
        customadapterobj = new CustomizedArrayAdapter(this,R.layout.my_row,myarray);
        view.setAdapter(customadapterobj);
    }
}
