package exe4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class business {
    static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生学号：\r\n" + "（输入\"b\"返回主菜单）");
            sid = sc.nextLine();
            // 优化1：返回管理主菜单
            if (sid.equals("b")) {
                return;
            } else {
                boolean flag = isUsed(array, sid);
                if (flag) {
                    System.out.println("你输入的学号已经被占用，请重新输入！");
                } else {
                    break;
                }
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生性别：");
        String gender = sc.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setGender(gender);
        array.add(s);
        System.out.println("添加学生成功!");
    }

    static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        // 优化3：信息不存在则在修改页面重新编辑
        int index = -1;
        while (index == -1) {
            System.out.println("请输入你要删除的学生的学号：\r\n" + "（输入\"b\"返回主菜单）");
            String sid = sc.nextLine();
            // 优化4：返回管理主菜单
            if (sid.equals("b")) {
                return;
            } else {
                for (int i = 0; i < array.size(); i++) {
                    Student s = array.get(i);
                    if (s.getSid().equals(sid)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("该信息不存在，请重新输入!");
                } else {
                    array.remove(index);
                    System.out.println("删除学生成功!");
                }
            }
        }
    }

    static void updateStudent(ArrayList<Student> array) {
        // 优化5：检索是否存在成员
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String sid = null;
        String name = null;
        String age = null;
        String gender = null;
        while (!flag) {
            System.out.println("请输入你要修改的学生学号: \r\n" + "（输入\"b\"返回主菜单）");
            sid = sc.nextLine();
            // 优化6：返回管理主菜单
            if (sid.equals("b")) {
                return;
            } else {
                for (int i = 0; i < array.size(); i++) {
                    Student student = array.get(i);
                    if (student.getSid().equals(sid)) {
                        flag = true;
                        name = student.getName();
                        age = student.getAge();
                        gender = student.getGender();
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("该信息不存在，请重新输入!");
                }
            }
        }
        // 优化7：可选择性更改学生信息
        System.out.println("-----修改学生: \"" + sid + "\"-----");
        System.out.println("1修改学生的多组信息");
        System.out.println("2仅修改学生的姓名");
        System.out.println("3仅修改学生的年龄");
        System.out.println("4仅修改学生的性别");
        System.out.println("5返回主菜单");
        System.out.println("请输入你的选择：");
        String line = sc.nextLine();
        switch (line) {
            case "1":
                System.out.println("请输入学生新姓名：");
                name = sc.nextLine();
                System.out.println("请输入学生新年龄：");
                age = sc.nextLine();
                System.out.println("请输入学生新性别：");
                gender = sc.nextLine();
                break;
            case "2":
                System.out.println("请输入学生新姓名：");
                name = sc.nextLine();
                break;
            case "3":
                System.out.println("请输入学生新年龄：");
                age = sc.nextLine();
                break;
            case "4":
                System.out.println("请输入学生新性别：");
                gender = sc.nextLine();
                break;
            case "5":
                return;
        }

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setGender(gender);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid))
                array.set(i, s);
        }
        System.out.println("修改学生成功");
    }
    static void findStudent(ArrayList<Student> array) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String sid = null;
        String name = null;
        String age = null;
        String gender = null;
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询!");
            return;
        }
        while (!flag) {
            System.out.println("请输入你要查询的学生学号: \r\n" + "（输入\"b\"返回主菜单）");
            sid = sc.nextLine();
            // 优化6：返回管理主菜单
            if (sid.equals("b")) {
                return;
            } else {
                for (int i = 0; i < array.size(); i++) {
                    Student student = array.get(i);
                    if (student.getSid().equals(sid)) {
                        flag = true;
                        name = student.getName();
                        age = student.getAge();
                        gender = student.getGender();
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("该信息不存在，请重新输入!");
                }
            }
        }

            System.out.println(sid + "\t\t" + name + "\t\t" + age + "岁\t\t" + gender);
    }


}
