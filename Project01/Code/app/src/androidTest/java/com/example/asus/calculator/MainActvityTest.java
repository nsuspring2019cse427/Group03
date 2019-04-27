package com.example.asus.calculator;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

@RunWith(AndroidJUnit4.class)
    public class MainActvityTest {

        @Rule
        public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);



        @Test
        public void button0OnClickActionTest(){

            ViewInteraction appCompatButton = onView(
                    allOf(withId(R.id.btn0), withText("0"), isDisplayed()));
            appCompatButton.perform(click());
        }

    @Test
    public void button1OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn1), withText("1"), isDisplayed()));
        appCompatButton.perform(click());
    }

    @Test
    public void button2OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn2), withText("2"), isDisplayed()));
        appCompatButton.perform(click());
    }

    @Test
    public void button3OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn3), withText("3"), isDisplayed()));
        appCompatButton.perform(click());
    }

    @Test
    public void button4OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn4), withText("4"), isDisplayed()));
        appCompatButton.perform(click());
    }

    @Test
    public void button5OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn5), withText("5"), isDisplayed()));
        appCompatButton.perform(click());
    }
    
    @Test
    public void button6OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn6), withText("6"), isDisplayed()));
        appCompatButton.perform(click());
    }
    
    @Test
    public void button7OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn7), withText("7"), isDisplayed()));
        appCompatButton.perform(click());
    }
    
    @Test
    public void button8OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn7), withText("8"), isDisplayed()));
        appCompatButton.perform(click());
    }

    @Test
    public void button9OnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn9), withText("9"), isDisplayed()));
        appCompatButton.perform(click());
    }
    

    
    @Test
    public void buttonDotOnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnDot), withText("."), isDisplayed()));
        appCompatButton.perform(click());
    }
    
    
    @Test
    public void buttonClearOnClickActionTest(){

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnClear), withText(""), isDisplayed()));
        appCompatButton.perform(click());
    }
    
    
    
    
    






}
