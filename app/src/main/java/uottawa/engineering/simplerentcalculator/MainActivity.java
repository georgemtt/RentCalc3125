package uottawa.engineering.simplerentcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button add;
    Button remove;
    Button next;
    ListView list;
  ArrayList <EditText> mateListe;

  // ArrayAdapter<roommatees> adapter;
   ArrayList<roommatees> roomListt;

    final int N = 12;
    final EditText[] mateList = new EditText[N]; // create an empty array;

   /* for(int i = 0; i < N; i++) {
        // create a new textview
        final EditText rowTextView = new EditText(this);


        // add the textview to the linearlayout
        list.addView(rowTextView);

        // save a reference to the textview for later
        mateList[i] = rowTextView;
    }*/

    int counter = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.btnAdd);
        remove = (Button)findViewById(R.id.btnRemove);
        next = (Button)findViewById(R.id.btnNext);
        list = (ListView)findViewById(R.id.roommates);
       roomListt= new ArrayList<roommatees>();
        mateListe = new ArrayList<EditText>();



        //ArrayList<roommatees> roomListt = new ArrayList<roommatees>();

       // add.setOnClickListener(this);
        remove.setOnClickListener(this);
        next.setOnClickListener(this);

        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        //adapter = new ArrayAdapter<roommatees>(getApplicationContext(), android.R.layout.simple_list_item_1, roomListt);
        final MyAdapter adapter = new MyAdapter(this, roomListt);

        // Here, you set the data in your ListView
        list.setAdapter(adapter);


//        MyAdapter adapter = new MyAdapter(this, generateData());
//        listV.setAdapter(adapter);

        //editText = (EditText)findViewById(R.id.txtInput);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter++;



                //roommatees newRoommate = new roommatees("Room " + counter +": ","Sam");

                roommatees newRoommate = new roommatees("Room " + counter +": ",mateList[counter]);


                roomListt.add(newRoommate);

                // notify listview of data changed
                 adapter.notifyDataSetChanged();
            }







        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter--;



                //roommatees newRoommate = new roommatees("Room " + counter +": ","Sam");

               // roommatees newRoommate = new roommatees("Room " + counter +": ",mateList[counter]);


                roomListt.remove(counter);

                // notify listview of data changed
                adapter.notifyDataSetChanged();
            }







        });



//        for(int i = 0; i < N; i++) {
//            // create a new textview
//            final EditText rowTextView = new EditText(this);
//
//
//            // add the textview to the linearlayout
//            list.addView(rowTextView);
//
//            // save a reference to the textview for later
//            mateList[i] = rowTextView;
//        }




    }

//    private ArrayList<roommatees> generateData(){
//        ArrayList<roommatees> items = new ArrayList<roommatees>();
//        items.add(new roommatees("Room 1","Sam"));
//        items.add(new roommatees("Room 2","Becca"));
//        items.add(new roommatees("Room 3","Joe"));
//
//        return items;
//    }


    public void onClick(View v) {
//        if (v == add){
//            if (counter == 12)
//            {
//
//                Toast.makeText(getApplicationContext(),"You cannot add more than 12 roommates", Toast.LENGTH_SHORT).show();
//                //Set toast saying "You have to have at least one roommate"
//            }
//            else
//            {
//                counter++;
//            }
//            //rCount.setText(Integer.toString(counter));
//
//        }

//        if (v == remove){
//            if (counter == 0)
//            {
//                Toast.makeText(getApplicationContext(),"You cannot have less than 0 roommates", Toast.LENGTH_SHORT).show();
//                //Set toast saying "You have to have at least one roommate"
//            }
//            else
//            {
//                    counter--;
//            }
//           // rCount.setText(Integer.toString(counter));
//        }

        if (v == next){
//            counter = 0;
//            rCount.setText(Integer.toString(counter));

            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }
    }

}



