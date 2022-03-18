package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String Num1 = "";
    String op = "";
    boolean tempOp = true;
    EditText temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp = findViewById(R.id.EditView);
    }

    public void numberEvent(View view) {
        if(tempOp)
            temp.setText("");
        tempOp = false;
        String number = temp.getText().toString();
        switch (view.getId()){
            case R.id.btn0:
                number += "0";
                break;

            case R.id.btn1:
                number += "1";
                break;

            case R.id.btn2:
                number += "2";
                break;

            case R.id.btn3:
                number += "3";
                break;

            case R.id.btn4:
                number += "4";
                break;

            case R.id.btn5:
                number += "5";
                break;

            case R.id.btn6:
                number += "6";
                break;

            case R.id.btn7:
                number += "7";
                break;

            case R.id.btn8:
                number += "8";
                break;

            case R.id.btn9:
                number += "9";
                break;
            case R.id.btndot:
                number += ".";
                break;
        }
        temp.setText((number));
    }

    public void operator(View view) {
        tempOp = true;
        Num1 = temp.getText().toString();
        switch ((view.getId())){
            case R.id.btnadd:
                op = "+";
                break;
            case R.id.btnsub:
                op = "-";
                break;
            case R.id.btnmul:
                op = "*";
                break;
            case R.id.btndiv:
                op = "/";
                break;
        }
    }

    public void Compute(View view) {
        String Num2 = temp.getText().toString();
        double result = 0;
        switch (op){
            case "+":
                result = Double.parseDouble(Num1) + Double.parseDouble(Num2);
                break;
            case "-":
                result = Double.parseDouble(Num1) - Double.parseDouble(Num2);
                break;
            case "*":
                result = Double.parseDouble(Num1) * Double.parseDouble(Num2);
                break;
            case "/":
                if(Num2 == "0"){
                    temp.setText("error");
                } else {
                    result = Double.parseDouble(Num1) / Double.parseDouble(Num2);
                }
                break;
        }
        temp.setText(result+"");
    }

    public void Reset(View view) {
        temp.setText("0");
        tempOp = true;
    }
}