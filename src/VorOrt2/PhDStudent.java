package VorOrt2;

import java.util.ArrayList;

public class PhDStudent extends Student{

    private String dissTopic;

    public PhDStudent(String firstName, String lastName, int age, int matNr, int semester, ArrayList<String> listCourses, String dissTopic) {
        super(firstName, lastName, age, matNr, semester, listCourses);
        this.dissTopic = dissTopic;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "Topic: " + this.dissTopic;
    }

}
