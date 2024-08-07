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

        onView(withId(R.id.nav_dashboard)).perform(click())
        onView(withId(R.id.text_dashboard)).check(matches(isDisplayed()) )
    }
}