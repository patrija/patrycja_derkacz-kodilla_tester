package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Ola", new Teacher("Janusz Nowak")));
        student.add(new Student("Kasia", new Teacher("Jolanta Nowak")));
        student.add(new Student("Karolina", null));
        student.add(new Student("Maciek", null));

        for(Student studentElement : student){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(studentElement.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + studentElement.getName() + " Teacher: " + teacherName);
        }
    }
}
