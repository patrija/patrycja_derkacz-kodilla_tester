package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task2;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task2, Integer> {
    List<Task2> findByDuration(int duration);
}