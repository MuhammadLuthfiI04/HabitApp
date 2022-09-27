package com.dicoding.habitapp.ui.list

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.habitapp.R
import org.junit.Rule
import org.junit.Test

//TODO 16 : Write UI test to validate when user tap Add Habit (+), the AddHabitActivity displayed
class HabitActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(HabitListActivity::class.java)

    @Test
    fun validateAddHabit() {
        Espresso.onView(ViewMatchers.withId(R.id.fab)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withText("Add Habit"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}