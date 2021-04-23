package entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Activity {

    public static final String ACTIVE_STATE = "active";
    public static final String CLOSED_STATE = "closed";
    public static final String PENDING_STATE = "pending";
    public static final String CANCELED_STATE = "canceled";

    /**
     * Creacion de atributos
     */
    private String name;
    private String state;
    private Iteration iteration;
    private ArrayList<Log> logs;
    private int estimatedDuration;


    /**
     * Constructor
     *
     * @param name
     * @param state
     * @param iteration
     */
    public Activity(String name, String state, Iteration iteration) {
        this.name = name;
        this.state = state;
        this.iteration = iteration;
        this.iteration.addActivity(this);
    }

    /**
     * Evaluate if an activity is active.
     *
     * @return true if the activity is in state pending or active, otherwise return false.
     */
    public boolean isActive() {
        boolean resultado = false;
        if (this.state == PENDING_STATE || this.state == ACTIVE_STATE) {
            resultado = true;

        }
        return resultado;
    }

}
