package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
    List<LocalDate> listDeadlines = TaskRepository.getTask()
            .stream()
            .filter(u-> u.getDeadline().isAfter(LocalDate.now()))
            .map(TaskManager :: getDeadline)
            .collect(Collectors.toList());
        System.out.println(listDeadlines);

    }

    public static LocalDate getDeadline(Task task){
        return task.getDeadline();
    }
}
