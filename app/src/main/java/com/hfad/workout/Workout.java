package com.hfad.workout;

/**
 * Created by gigabyte on 13.02.16.
 */
public class Workout {

    // Each Workout has a name and description
    private String name;
    private String description;

    // workouts is an array of four Workouts
    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony WPL",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"),
            new Workout("The Limb Loosener#2",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony WPL#2",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special#2",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length#2",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"),
            new Workout("The Limb Loosener#3",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony WPL#3",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special#3",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length#3",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"),
            new Workout("The Limb Loosener#4",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony WPL#4",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special#4",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length#4",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    // Constructor, each Workout has a name and description
    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // The String representation of a Workout is its name
    public String toString() {
        return this.name;
    }

}
