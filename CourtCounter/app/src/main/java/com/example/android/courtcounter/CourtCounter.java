package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CourtCounter extends AppCompatActivity {

    TextView showValue;
    TextView showValue2;
    TextView showValue3;
    TextView showValue4;
    TextView showValue5;
    TextView showValue6;
    int counter=0;
    int counter2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
        showValue = (TextView) findViewById(R.id.team_a_score);
        showValue2 = (TextView) findViewById(R.id.team_b_score);
        showValue3 = (TextView) findViewById(R.id.team_a_score);
        showValue4 = (TextView) findViewById(R.id.team_b_score);
       showValue5=(TextView)findViewById(R.id.team_a_score);
        showValue6=(TextView)findViewById(R.id.team_b_score);
    }

    /**
     * Displays the given score for Team A.
     */

    public void addthree(View view) {
        /*displayForTeamA(3);*/
        counter = counter + 3;
        showValue.setText(Integer.toString(counter));

    }

    public void addtwo(View v) {
        counter = counter + 2;
        showValue.setText(Integer.toString(counter));

    }

    public void free(View v) {
        counter = counter+1;
        showValue.setText(Integer.toString(counter));

    }

    public void addthree2(View view) {
        /*displayForTeamA(3);*/
        counter2 = counter2 + 3;
        showValue2.setText(Integer.toString(counter2));

    }

    public void addtwo2(View v) {
        counter2 = counter2 + 2;
        showValue2.setText(Integer.toString(counter2));

    }

    public void free2(View v) {
        counter2 = counter2+1;
        showValue2.setText(Integer.toString(counter2));

    }
    public void reset(View view)
    {
      counter=0;
      counter2=0;

        showValue5.setText(Integer.toString(counter));
        showValue6.setText(Integer.toString(counter2));
    }

}
