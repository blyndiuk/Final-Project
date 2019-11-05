package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onPostExecute() throws Exception {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(activityTestRule.getActivity());
        Thread.sleep(5000);
        assertNotNull(task.get());
    }
}