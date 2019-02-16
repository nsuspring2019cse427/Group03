package com.example.asus.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private String display = "";
    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonDot, buttonClear, buttonEqual;
    float valueOne,valueTwo;

    boolean rAddition,rSubstraction, rMultiplication,rDivission;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView) findViewById(R.id.textView_screen);
        screen.setText(display);


        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonDot = (Button) findViewById(R.id.btnDot);

        buttonAdd = (Button) findViewById(R.id.btnPlus);
        buttonSub = (Button) findViewById(R.id.btnMinus);
        buttonMul = (Button) findViewById(R.id.btnMult);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonClear = (Button) findViewById(R.id.btnClear);
        buttonEqual = (Button) findViewById(R.id.btnEqual);









    }


    public void onClickNumber7(View view) {

        screen.setText(screen.getText() + "7");
    }

    public void onClickNumber8(View view) {

        screen.setText(screen.getText() + "8");
    }

    public void onClickNumber9(View view) {

        screen.setText(screen.getText() + "9");
    }

    public void onClickNumber4(View view) {

        screen.setText(screen.getText() + "4");
    }

    public void onClickNumber5(View view) {

        screen.setText(screen.getText() + "5");
    }

    public void onClickNumber6(View view) {

        screen.setText(screen.getText() + "6");
    }

    public void onClickNumber1(View view) {

        screen.setText(screen.getText() + "1");
    }

    public void onClickNumber2(View view) {

        screen.setText(screen.getText() + "2");
    }

    public void onClickNumber3(View view) {

        screen.setText(screen.getText() + "3");
    }

    public void onClickDot(View view) {

        screen.setText(screen.getText() + ".");
    }

    public void onClickNumber0(View view) {

        screen.setText(screen.getText() + "0");
    }


    public void onClickOperatorAdditon(View view) {

        if(screen == null){
            screen.setText("");
        }
        else{
            valueOne = Float.parseFloat(screen.getText() + "");

            rAddition = true;
            screen.setText(null);
        }
    }

    public void onClickOperatorSub(View view) {

        valueOne = Float.parseFloat(screen.getText() + "");

        rSubstraction = true;
        screen.setText(null);
    }

    public void onClickOperatorMul(View view) {

        valueOne = Float.parseFloat(screen.getText() + "");
        rMultiplication = true;
        screen.setText(null);
    }

    public void onClickOperatorDiv(View view) {

      valueOne = Float.parseFloat(screen.getText() + "");

        rDivission = true;
        screen.setText(null);
    }



    public void onClickEqual(View view) {

       valueTwo = Float.parseFloat(screen.getText() + "");

       if(rAddition == true){
           screen.setText(valueOne + valueTwo + "");
           rAddition = false;
       }

        if(rSubstraction == true){
            screen.setText(valueOne - valueTwo + "");
            rSubstraction = false;
        }


        if(rMultiplication == true){
            screen.setText(valueOne * valueTwo + "");
            rMultiplication = false;
        }


        if(rDivission == true){
            screen.setText(valueOne / valueTwo + "");
            rDivission = false;
        }

    }

    public void onClickClear(View view) {

        screen.setText("");


    }


}
