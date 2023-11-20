package exe4_2;

import java.util.ArrayList;

class Course {
    private String no;
    private String name;
    private String grade;


    Course() {
    }

    public Course(String no, String name, String grade) {
        this.no = no;
        this.name = name;
        this.grade = grade;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class persistence {
    public static void main(String[] args) {
        ArrayList<Course> array = new ArrayList<>();
        ui.show(array);
    }
}
