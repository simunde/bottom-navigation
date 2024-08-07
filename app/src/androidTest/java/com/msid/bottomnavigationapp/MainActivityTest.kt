package com.msid.bottomnavigationapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule

    var activityScenarioRule:ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_navigation(){
        // Navigate to DashBoard
        onView(withId(R.id.nav_dashboard)).perform(click())
        onView(withId(R.id.text_dashboard)).check(matches(isDisplayed()))

        // Navigate to Notifications
        onView(withId(R.id.nav_notifications)).perform(click())
        onView(withId(R.id.text_notifications)).check(matches(isDisplayed()))

        // Navigate to Profile
        onView(withId(R.id.nav_profile)).perform(click())
        onView(withId(R.id.text_profile)).check(matches(isDisplayed()))

        // Navigate to Home
        onView(withId(R.id.nav_home)).perform(click())
        onView(withId(R.id.text_home)).check(matches(isDisplayed()))
    }
}