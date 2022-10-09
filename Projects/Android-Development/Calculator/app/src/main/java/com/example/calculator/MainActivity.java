package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void add(View view){

        EditText editTextNumber1= (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2= (EditText)findViewById(R.id.editTextNumber2);
        TextView textView3= (TextView)findViewById(R.id.textView3);
        String a= editTextNumber1.getText().toString();
        String b= editTextNumber2.getText().toString();
        int n1= Integer.parseInt(a);
        int n2= Integer.parseInt(b);
        int n3= n1+n2;
        String message1=Integer.toString(n3);
        textView3.setText("THE SUM IS :"  +message1);
    }
    public void sub(View view){

        EditText editTextNumber1= (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2= (EditText)findViewById(R.id.editTextNumber2);
        TextView textView3= (TextView)findViewById(R.id.textView3);
        String a= editTextNumber1.getText().toString();
        String b= editTextNumber2.getText().toString();
        int n1= Integer.parseInt(a);
        int n2= Integer.parseInt(b);
        int n3= n1-n2;
        String message1=Integer.toString(n3);
        textView3.setText("THE SUBTRACTION IS :"  +message1);
    }
    public void mul(View view){

        EditText editTextNumber1= (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2= (EditText)findViewById(R.id.editTextNumber2);
        TextView textView3= (TextView)findViewById(R.id.textView3);
        String a= editTextNumber1.getText().toString();
        String b= editTextNumber2.getText().toString();
        int n1= Integer.parseInt(a);
        int n2= Integer.parseInt(b);
        int n3= n1*n2;
        String message1=Integer.toString(n3);
        textView3.setText("THE PRODUCT IS :"  +message1);
    }
    public void div(View view){

        EditText editTextNumber1= (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2= (EditText)findViewById(R.id.editTextNumber2);
        TextView textView3= (TextView)findViewById(R.id.textView3);
        String a= editTextNumber1.getText().toString();
        String b= editTextNumber2.getText().toString();
        double n1= Double.parseDouble(a);
        double n2= Double.parseDouble(b);
        double n3= n1/n2;
        String message1=Double.toString(n3);
        textView3.setText("THE DIVISION RESULT IS :"  +message1);
    }
    public void pow(View view){

        EditText editTextNumber1= (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2= (EditText)findViewById(R.id.editTextNumber2);
        TextView textView3= (TextView)findViewById(R.id.textView3);
        String a= editTextNumber1.getText().toString();
        String b= editTextNumber2.getText().toString();
        double n1= Double.parseDouble(a);
        double n2= Double.parseDouble(b);
        double n3= Math.pow(n1,n2);
        String message1=Double.toString(n3);
        textView3.setText("THE POWER RESULT IS :"  +message1);
    }
    public void sqrt(View view){

        EditText editTextNumber1= (EditText)findViewById(R.id.editTextNumber1);
        TextView textView3= (TextView)findViewById(R.id.textView3);
        String a= editTextNumber1.getText().toString();
        double n1= Double.parseDouble(a);
        double n3= Math.sqrt(n1);
        String message1=Double.toString(n3);
        textView3.setText("THE SQRT OF 1ST NUMBER IS :"  +message1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}