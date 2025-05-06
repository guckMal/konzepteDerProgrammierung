package VorOrt2;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {

    int matNr;
    int semester;
    ArrayList<String> listCourses = new ArrayList<>();


    public Student(String firstName, String lastName, int age, int matNr, int semester, ArrayList<String> listCourses) {
        super(firstName, lastName, age);
        this.matNr = matNr;
        this.semester = semester;
        this.listCourses = listCourses;
    }

    public void addCourse(String course){
        listCourses.add(course);
    }

    public void printCourseList(){
        System.out.println(listCourses.toString());
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "MatNumber: " + this.matNr + " Semester" + this.semester + " " + this.listCourses;
    }
}
