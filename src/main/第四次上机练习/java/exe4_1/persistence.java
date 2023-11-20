package exe4_1;

import java.util.ArrayList;
class Student {
    private String sid;
    private String name;
    private String age;
    private String gender;

    Student() {
    }

    Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String getSid() {
        return sid;
    }

    void setSid(String sid) {
        this.sid = sid;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAge() {
        return age;
    }

    void setAge(String age) {
        this.age = age;
    }

    String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }
}

public class persistence {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        ui.show(array);
    }
}
