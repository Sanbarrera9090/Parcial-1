package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Iteration {
    /**
     * Atributos y llamados de clases
     */
    private String goal;
    private Project project;
    private List<Activity> activities;
    private LocalDate dateInit;
    private LocalDate dateEnd;


    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public int countOpenActivities() {
        int resultado = 0;
        for (int i = 0; i < activities.size(); i++) {
            if (activities.get(i).isActive()) ;
            {
                resultado++;
            }
        }
        return resultado;
    }
}
