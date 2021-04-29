package com.example.practiseset2;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practiseset2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }
    public void convert_button(View view){

        EditText rupee= (EditText) findViewById(R.id.rupee_text);
        String rupees = rupee.getText().toString();
        int intRupee =Integer.parseInt(rupees);

        float convert= calculate(intRupee);
        String output = "Currency in $: "+ convert;
        display(output);
    }
    public float calculate(int intRupee){
     float finalValue = (float) (intRupee / 74.20);
     return finalValue;
    }

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.dollars_text);
        t.setText(text);
    }




}