package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task2;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskRepositoryTestSuite {
    @Autowired
    private TaskRepository taskRepository;


    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskRepositorySave() {
        //Given
        Task2 task = new Task2(DESCRIPTION, 7);

        //When
        taskRepository.save(task);

        //Then
        int id = task.getId();
        Optional<Task2> readTask = taskRepository.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        taskRepository.deleteById(id);
    }

    @Test
    public void TestTaskRepositoryFindByDuration() {
        //Given
        Task2 task = new Task2(DESCRIPTION, 7);
        taskRepository.save(task);
        int duration = task.getDuration();

        //When
        List<Task2> readTask = taskRepository.findByDuration(duration);

        //Then
        Assert.assertEquals(1, readTask.size());

        //CleanUp
        int id = readTask.get(0).getId();
        taskRepository.deleteById(id);
    }

    @Test
    public void testTaskRepositorySaveWithFinancialDetails() {
        //Given
        Task2 task = new Task2(DESCRIPTION, 30);
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(120), false);
        task.setTaskFinancialDetails(taskFinancialDetails);

        //When
        taskRepository.save(task);
        int id = task.getId();


        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskRepository.deleteById(id);


    }
}
