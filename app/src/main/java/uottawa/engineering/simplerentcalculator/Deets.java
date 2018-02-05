package uottawa.engineering.simplerentcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Deets extends AppCompatActivity implements OnClickListener{
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deets);

        home = (Button)findViewById(R.id.btnHome);

        home.setOnClickListener(this);
    }

    public void onClick(View v) {

        if (v == home){
//            counter = 0;
//            rCount.setText(Integer.toString(counter));

            Intent intent = new Intent(Deets.this, MainActivity.class);
            startActivity(intent);
        }

    }

}
