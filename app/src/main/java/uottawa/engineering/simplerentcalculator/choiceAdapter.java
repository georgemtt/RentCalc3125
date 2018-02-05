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
import android.widget.Spinner;
import android.widget.TextView;

public class choiceAdapter extends ArrayAdapter<roomTypes> {

    private final Context context;
    private final ArrayList<roomTypes> itemsArrayList;

    public choiceAdapter(Context context, ArrayList<roomTypes> itemsArrayList) {

        super(context, R.layout.choice_list, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.choice_list, parent, false);

        // 3. Get the two text view from the rowView
        TextView labelView = (TextView) rowView.findViewById(R.id.roomNumber);
        Spinner valueView = (Spinner) rowView.findViewById(R.id.roomChoice);

        // 4. Set the text for textView
        labelView.setText(itemsArrayList.get(position).getRoomNumber());
       // valueView.set(itemsArrayList.get(position).getTypeList());

        // 5. retrn rowView
        return rowView;
    }
}
