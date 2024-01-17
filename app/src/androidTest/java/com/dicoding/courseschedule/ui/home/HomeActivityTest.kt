package com.dicoding.courseschedule.ui.home

import org.junit.Assert.*
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.ui.add.AddCourseActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class HomeActivityTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(HomeActivity::class.java)

    @Before
    fun setUp() {
        Intents.init()
        activityScenarioRule.scenario
    }

    @Test
    fun isAddCourseDisplayed() {
        onView(withId(R.id.action_add))
            .perform(click())

        intended(hasComponent(AddCourseActivity::class.java.name))
    }

}