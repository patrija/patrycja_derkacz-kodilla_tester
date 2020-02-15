package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask(){
    List<Task> tasks = new ArrayList<>();

    tasks.add(new Task("Learn Spanish words", LocalDate.of(2020,2,1), LocalDate.of(2020,2,25)));
    tasks.add(new Task("Give Maks food", LocalDate.of(2020,2,14),LocalDate.of(2020,2,14)));
    tasks.add(new Task("Clean kitchen", LocalDate.of(2020,2,13), LocalDate.of(2020,2,20)));
    tasks.add(new Task("Water plants", LocalDate.of(2020,2,1), LocalDate.of(2020,2,10)));
        return tasks;
    }
}
