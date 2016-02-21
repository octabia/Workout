package com.hfad.workout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    // This is the ID of the workout the user chooses
    private long workoutId;


    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    // This is the onCreateView() method.
    // It’s called when Android needs the fragment’s layout.
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            //    Set the value of the workoutId
            workoutId = savedInstanceState.getLong("workoutId");
        }


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    // Save the value of the workoutId in the fragment gets destroyed.
    // We're retrieving it in the onCreateView() method.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("workoutId", workoutId);
    }

    @Override
    public void onStart() {
        super.onStart();
        // To get a reference to a fragment’s views, we first have to get a reference
        // to the fragment’s root view using the getView() method, and use that
        // to find its child views.
        // The getView() method gets the fragment's root View. We can then use this
        // to get references to the workout title and description text views.
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.tv_textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.tv_textDescription);
            description.setText(workout.getDescription());
        }
    }

    // This is a setter method for the workout ID. The activity will use this method
    // to set the value of the workout ID.
    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }
}
