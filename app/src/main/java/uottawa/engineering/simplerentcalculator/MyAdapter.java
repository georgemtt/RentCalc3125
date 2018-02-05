package uottawa.engineering.simplerentcalculator;

/**
 * Created by Tobe on 2018-02-03.
 */
import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<roommatees> {

    private final Context context;
    private final ArrayList<roommatees> itemsArrayList;

    public MyAdapter(Context context, ArrayList<roommatees> itemsArrayList) {

        super(context, R.layout.list_item, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        // 3. Get the two text view from the rowView
        TextView labelView = (TextView) rowView.findViewById(R.id.roomNumber);
        EditText valueView = (EditText) rowView.findViewById(R.id.roomiName);

        // 4. Set the text for textView
        labelView.setText(itemsArrayList.get(position).getRoomNumber());
        valueView.setText(itemsArrayList.get(position).getRoommateName());

        // 5. retrn rowView
        return rowView;
    }
}
