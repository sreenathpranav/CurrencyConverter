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

    }

    public void convert_button(View view) {

        EditText rupee = (EditText) findViewById(R.id.rupee_text); //getting value from EditText to string
        String rupees = rupee.getText().toString();
        int intRupee = Integer.parseInt(rupees);     //convert to integer value from string

        float convert = calculate(intRupee);         //calculating value in a function calculate
        String output = "Currency in $: " + convert;
        display(output);                             //displaying the output with the help of a function display
    }

    public float calculate(int intRupee) {
        return (float) (intRupee / 74.20);           // explicit conversion from int to float
    }

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.dollars_text);
        t.setText(text);
    }


}