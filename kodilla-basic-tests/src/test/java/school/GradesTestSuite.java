package school;

import com.kodilla.school.Grades;
import com.kodilla.school.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[]values = grades.getValues();
        assertEquals(0, values.length);
    }


    @Test
    public void shouldAddTwoValuesToArray(){
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int values[] = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2,values[1]);
    }
    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
        Student student = new Student("Martin");
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(3.33, geographyAverage, 0.01);
        assertEquals(3, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(0, physicsAverage, 0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }

}
