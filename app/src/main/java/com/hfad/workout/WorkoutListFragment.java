package com.hfad.workout;


import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {

    public WorkoutListFragment() {
        // Required empty public constructor
    }

    static interface WorkoutListListener {
        void itemClicked(long id);
    }

    private WorkoutListListener listener;


    // Here we create a basic list fragment called WorkoutListFragment.
    // As it’s a list fragment, it needs to extend the ListFragment class rather than Fragment.
    // The onCreateView() method gets called when the fragment’s view gets created. We’re
    // including it in our code as we want to populate the fragment’s list view  with data as
    // soon as it gets created. If you don’t need your code to do anything at this point, you
    // don’t need to include the method.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] names = new String[Workout.workouts.length];
        for (int i = 0; i < names.length; i++) {
            // Create a String array of the workout names
            names[i] = Workout.workouts[i].getName();
        }

        // Get the context from the layout inflater
        // As you saw earlier, the Fragment class isn’t a subclass of the Context class,
        // so using this won’t work. Instead, you need to get the current context in some
        // other way. If you’re using the adapter in the fragment’s onCreateView()
        // method as we are here, you can use the LayoutInflator object’s  getContext() method
        // to get the context instead
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1,
                names);
        // Bind the array adapter to the list view
        setListAdapter(adapter);

        // Calling the superclass onCreateView() method gives you the default layout
        // for the ListFragment.
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    // This is called when the fragment gets attached to the activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (WorkoutListListener)context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null){
            //Tell the listener when an item in the ListView is clicked
            listener.itemClicked(id);
        }
        // super.onListItemClick(l, v, position, id);
    }
}
