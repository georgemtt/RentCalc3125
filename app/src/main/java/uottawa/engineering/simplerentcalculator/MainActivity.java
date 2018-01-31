package uottawa.engineering.simplerentcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button add;
    Button remove;
    Button next;
    TextView rCount;

    int counter = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.btnAdd);
        remove = (Button)findViewById(R.id.btnRemove);
        next = (Button)findViewById(R.id.btnNext);
        rCount = (TextView)findViewById(R.id.resultText);

        add.setOnClickListener(this);
        remove.setOnClickListener(this);
        next.setOnClickListener(this);

    }


    public void onClick(View v) {
        if (v == add){
            if (counter == 12)
            {
                //Set toast saying "You have to have at least one roommate"
            }
            else
            {
                counter++;
            }
            rCount.setText(Integer.toString(counter));

        }
        if (v == remove){
            if (counter == 1)
            {
                //Set toast saying "You have to have at least one roommate"
            }
            else
            {
                    counter--;
            }
            rCount.setText(Integer.toString(counter));
        }

        if (v == next){
            counter = 0;
            rCount.setText(Integer.toString(counter));
        }
    }

}



