package uottawa.engineering.simplerentcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.ArrayList;

public class roomChoice extends AppCompatActivity implements OnClickListener {

    Button next;
    ArrayList<roomTypes> typesList;
    ListView list;
    Spinner type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_choice);

        typesList= new ArrayList<roomTypes>();
        next = (Button)findViewById(R.id.btnNext);

        next.setOnClickListener(this);

        list = (ListView)findViewById(R.id.roomtypez);


        Spinner type = (Spinner) findViewById(R.id.roomChoice);
      ArrayAdapter<CharSequence> roomadapter = ArrayAdapter.createFromResource(
              this, R.array.choice_arrays, R.layout.spinner_layout);
        roomadapter.setDropDownViewResource(R.layout.spinner_layout);

   //type.setAdapter(roomadapter);



        //final choiceAdapter adapter = new choiceAdapter(this, typesList);

        // Here, you set the data in your ListView
      //  list.setAdapter(adapter);

            choiceAdapter adapter = new choiceAdapter(this, generateData());
            list.setAdapter(adapter);

    }



    private ArrayList<roomTypes> generateData(){
        ArrayList<roomTypes> items = new ArrayList<roomTypes>();
        items.add(new roomTypes("Room 1",type));
        items.add(new roomTypes("Room 2",type));
        items.add(new roomTypes("Room 3",type));

        return items;
    }

    public void onClick(View v) {

        if (v == next){
//            counter = 0;
//            rCount.setText(Integer.toString(counter));

            Intent intent = new Intent(roomChoice.this, summaryPage.class);
            startActivity(intent);
        }
    }


}
