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

        /* We'll remove these lines as we're no longer hardcoding which workout to display

        // This gets us a reference to WorkoutDetailFragment. Its id in the
        // activity’s layout is detail_frag
        // use getSupportFragmentManager() instead getFragmentManager(),
        // but this only works for ActionBarActivites
        
        WorkoutDetailFragment frag = (WorkoutDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detail_frag);

        // We’re going to get WorkoutDetailFragment to display details of a workout
        // here to check it’s working.
        frag.setWorkoutId(1);

        */

    }

    // This method is defined in the listener
    @Override
    public void itemClicked(long id) {
        WorkoutDetailFragment details = new WorkoutDetailFragment();

        details.setWorkoutId(id);


        FragmentManager fm = getSupportFragmentManager();
        // fm.popBackStack();
        fm.beginTransaction()
                .replace(R.id.fragment_container, details)
                .commit();

        // Start the fragment transaction
        // FragmentTransaction ft = getFragmentManager().beginTransaction();
        // Replace the fragment and add it to the back stack
        // ft.replace(R.id.fragment_container, details);
        // ft.addToBackStack(null);

        // Get the new and old fragments to fade in and out
        // ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        // Commit the transaction
        // ft.commit();

    }

}
