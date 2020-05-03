package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Monday tasks", "What should be done on Mondays");
        taskListRepository.save(taskList);
        String taskName = taskList.getListName();

        //When
        List<TaskList> readTask = taskListRepository.findByListName(taskName);

        //Then
        Assert.assertEquals("Monday tasks", readTask.get(0).getListName());

        //Cleanup
        int id = readTask.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
