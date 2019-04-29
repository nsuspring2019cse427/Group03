package com.example.asus.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    /*......Initialization.......*/

    private TextView screen;
    private String display = "";
    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonDot, buttonClear, buttonEqual;
    double valueOne,valueTwo;

    boolean rAddition,rSubtraction, rMultiplication,rDivission;

    Calculator cal = new Calculator();



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





        /*....Set OnClickListener for all numeric & operating buttons.......*/
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button7OnClickAction();


            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button8OnClickAction();


            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button9OnClickAction();


            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button4OnClickAction();


            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button5OnClickAction();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button6OnClickAction();


            }
        });



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1OnClickAction();



            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button2OnClickAction();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button3OnClickAction();


            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonDotOnClickAction();


            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button0OnClickAction();


            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonAddOnClickAction();


            }
        });


        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonSubOnClickAction();


            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonMulOnClickAction();


            }
        });


        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonDivOnClickAction();

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonEqualOnClickAction();






            }
        });


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                buttonClearOnClickAction();



            }
        });











    }









    /*.......OnClickAction methods of all numeric buttons......*/


    private void button0OnClickAction() {

        screen.setText(screen.getText() + "0");
    }


    private void button1OnClickAction() {
        screen.setText(screen.getText() + "1");
    }

    private void button2OnClickAction() {

        screen.setText(screen.getText() + "2");
    }

    private void button3OnClickAction() {
        screen.setText(screen.getText() + "3");
    }

    private void button4OnClickAction() {

        screen.setText(screen.getText() + "4");
    }


    private void button5OnClickAction() {
        screen.setText(screen.getText() + "5");
    }

    private void button6OnClickAction() {

        screen.setText(screen.getText() + "6");
    }

    private void button7OnClickAction() {

        screen.setText(screen.getText() + "7");
    }

    private void button8OnClickAction() {

        screen.setText(screen.getText() + "8");
    }


    private void button9OnClickAction() {

        screen.setText(screen.getText() + "9");
    }


    private void buttonDotOnClickAction() {
        screen.setText(screen.getText() + ".");
    }








    /*......OnClickAction methods of operating {+,-,*,*} buttons......*/

    private void buttonAddOnClickAction() {

        try{
            if(screen == null){
                screen.setText("");
            }
            else{
                valueOne = Double.parseDouble(screen.getText() + "");

                rAddition = true;
                screen.setText(null);
            }
        } catch(NumberFormatException e) {
           Toast.makeText(MainActivity.this,"Wrong Input",Toast.LENGTH_LONG).show();
        }

    }

    private void buttonSubOnClickAction() {

            screen.setText("-");
            rSubtraction = true;

            /*valueOne = Double.parseDouble(screen.getText() + );

            rSubtraction = true;*/
            screen.setText(null);

    }


    private void buttonMulOnClickAction() {

        try{
            if(screen == null){
                screen.setText("");
            }
            else{
                valueOne = Double.parseDouble(screen.getText() + "");

                rMultiplication = true;
                screen.setText(null);
            }
        } catch(NumberFormatException e) {
            Toast.makeText(MainActivity.this,"Wrong Input",Toast.LENGTH_LONG).show();
        }
    }

    private void buttonDivOnClickAction() {
        try{
            if(screen == null){
                screen.setText("");
            }
            else{
                valueOne = Double.parseDouble(screen.getText() + "");

                rDivission = true;
                screen.setText(null);
            }
        } catch(NumberFormatException e) {
            Toast.makeText(MainActivity.this,"Wrong Input",Toast.LENGTH_LONG).show();
        }


    }

    /*.....End of OnClickAction methods of operating {+,-,*,/} buttons..... */


/*.......OnClickAction methods for Equal(=) operator button.........*/
    private void buttonEqualOnClickAction() {

        valueTwo = Double.parseDouble(screen.getText() + "");

        if(rAddition == true){
            screen.setText(cal.Addition(valueOne,valueTwo) + "");
            rAddition = false;

            //cal.Addition(valueOne,valueTwo) + ""
        }

        if(rSubtraction == true){
            screen.setText(cal.Subtraction(valueOne,valueTwo) + "");
            rSubtraction = false;
        }


        if(rMultiplication == true){
            screen.setText(cal.Multiplication(valueOne,valueTwo) + "");
            rMultiplication = false;
        }


        if(rDivission == true){
            try {
                screen.setText(cal.Division(valueOne, valueTwo) + "");
                rDivission = false;
            }
            catch (ArithmeticException e){
                if(valueTwo==0) {
                    Toast.makeText(MainActivity.this, "You should not divide a number by zero", Toast.LENGTH_LONG).show();
                }
            }
        }



    }


    /*.......OnClickAction methods for Clear button.........*/

    private void buttonClearOnClickAction() {

        screen.setText("");
    }

    /*........Finish...........*/







}
