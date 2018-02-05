package uottawa.engineering.simplerentcalculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements OnClickListener{

    Button next;
    Activity activity;
    EditText rent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        activity = this;


        next = (Button)findViewById(R.id.btnNext);
        rent = (EditText)findViewById(R.id.rentInput);

        rent.addTextChangedListener(new DecimalFilter(rent, activity));


        next.setOnClickListener(this);

        Spinner curr = (Spinner) findViewById(R.id.currencyList);
        ArrayAdapter<CharSequence> foodadapter = ArrayAdapter.createFromResource(
                this, R.array.currency_arrays, R.layout.spinner_layout);
        foodadapter.setDropDownViewResource(R.layout.spinner_layout);
        curr.setAdapter(foodadapter);

    }




    //public void onCheck(View v) {
   //     Toast.makeText(getApplication(), rent.getText(), Toast.LENGTH_LONG).show();
   // }

    public void onClick(View v) {

        if (v == next){
//            counter = 0;
//            rCount.setText(Integer.toString(counter));

            Intent intent = new Intent(Main2Activity.this, roomChoice.class);
            startActivity(intent);
        }
    }


}
