package uottawa.engineering.simplerentcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class summaryPage extends AppCompatActivity implements OnClickListener{


    Button deets;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_page);

        deets = (Button)findViewById(R.id.btnDeets);
        home = (Button)findViewById(R.id.btnHome);

        deets.setOnClickListener(this);
        home.setOnClickListener(this);
    }


    public void onClick(View v) {

        if (v == deets){
//            counter = 0;
//            rCount.setText(Integer.toString(counter));

            Intent intent = new Intent(summaryPage.this, Deets.class);
            startActivity(intent);
        }

        if (v == home){
//            counter = 0;
//            rCount.setText(Integer.toString(counter));

            Intent intent = new Intent(summaryPage.this, MainActivity.class);
            startActivity(intent);
        }

    }

}
