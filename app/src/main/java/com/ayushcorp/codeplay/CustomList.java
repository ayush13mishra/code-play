package com.ayushcorp.codeplay;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import static android.R.attr.level;

/**
 * Created by Ayush on 04-Feb-18.
 */

public class CustomList extends ArrayAdapter {


    //to reference the Activity
    private final Activity context;

    //to store the animal images
    //private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] levelArray;
    public CustomList(Activity context, String[] nameArrayParam, String[] infoArrayParam){

        super(context,R.layout.listview , nameArrayParam);
        this.context = context;
        this.levelArray = infoArrayParam;
        this.nameArray = nameArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.name);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.level);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(levelArray[position]);
        // imageView.setImageResource(imageIDarray[position]);

        return rowView;

    };

}
