package com.barist_v.testspike;

import android.support.test.filters.MediumTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

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


    @Test
    public void test_activityStarts() {
        onView(withText("Click me to show toast")).check(matches(isDisplayed()));
    }
}
