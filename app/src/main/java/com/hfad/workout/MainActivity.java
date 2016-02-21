package com.hfad.workout;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        WorkoutListFragment.WorkoutListListener {
    // Implement the listener defined in WorkoutListFragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    // This method is defined in the listener
    @Override
    public void itemClicked(long id) {
        WorkoutDetailFragment details = new WorkoutDetailFragment();

        details.setWorkoutId(id);

        // getSupportFragmentManager() --> Return the FragmentManager for interacting
        // with fragments associated with this activity
        FragmentManager fm = getSupportFragmentManager();

        // Pop the top state off the back stack. Return true if there was ont of the pop,
        // else false
        fm.popBackStack();

        // Start the fragment transaction and commit the transaction
        fm.beginTransaction()
                .replace(R.id.fragment_container, details)
                .commit();

    }

}
