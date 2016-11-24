package com.barist_v.testspike;

import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.MediumTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.jraska.falcon.FalconSpoon;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTests {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup(){
    }


    @Test
    public void test_onStart_buttonIsVisible() {
        FalconSpoon.screenshot(mActivityRule.getActivity(), "main-running");
        onView(withText("Click me to show a dialog")).check(matches(isDisplayed()));
    }

    @Test
    public void test_onButtonClick_showDialog() {
        FalconSpoon.screenshot(mActivityRule.getActivity(), "main-beforeClick");

        onView(withText("Click me to show a dialog")).perform(ViewActions.click());

        FalconSpoon.screenshot(mActivityRule.getActivity(), "main-afterClick");

        onView(withText("it works!")).check(matches(isDisplayed()));
    }
}
