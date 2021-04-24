package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {
    /**
     * Atributos de la clase
     */
    private String name;
    private int id;
    private LocalDate createdAt;
    private String area;
    private Student lider;
    private ArrayList<Student> miembros;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

    public int countActiveProjects() {
        int resultado = 0;
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).isActive()) {
                resultado++;
            }
        }
        return resultado;
    }

}
