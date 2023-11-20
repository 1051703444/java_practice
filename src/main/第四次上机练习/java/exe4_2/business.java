package exe4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class business {
    static boolean isUsed(ArrayList<Course> array, String no) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Course s = array.get(i);
            if (s.getNo().equals(no)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    static void addCourse(ArrayList<Course> array) {
        Scanner sc = new Scanner(System.in);
        String no;
        while (true) {
            System.out.println("请输入课程号：\r\n" + "（输入\"b\"返回主菜单）");
            no = sc.nextLine();
            // 优化1：返回管理主菜单
            if (no.equals("b")) {
                return;
            } else {
                boolean flag = isUsed(array, no);
                if (flag) {
                    System.out.println("你输入的课程号已经被占用，请重新输入！");
                } else {
                    break;
                }
            }
        }

        System.out.println("请输入课程名：");
        String name = sc.nextLine();
        System.out.println("请输入学分：");
        String grade = sc.nextLine();
        Course c = new Course();
        c.setNo(no);
        c.setName(name);
        c.setGrade(grade);
        array.add(c);
        System.out.println("添加课程成功!");
    }

    static void deleteCourse(ArrayList<Course> array) {
        Scanner sc = new Scanner(System.in);
        // 优化3：信息不存在则在修改页面重新编辑
        int index = -1;
        while (index == -1) {
            System.out.println("请输入你要删除的课程号：\r\n" + "（输入\"b\"返回主菜单）");
            String no = sc.nextLine();
            // 优化4：返回管理主菜单
            if (no.equals("b")) {
                return;
            } else {
                for (int i = 0; i < array.size(); i++) {
                    Course s = array.get(i);
                    if (s.getNo().equals(no)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("该信息不存在，请重新输入!");
                } else {
                    array.remove(index);
                    System.out.println("删除课程成功!");
                }
            }
        }
    }

    static void updateCourse(ArrayList<Course> array) {
        // 优化5：检索是否存在成员
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String no = null;
        String name = null;
        String grade = null;
        while (!flag) {
            System.out.println("请输入你要修改的课程号: \r\n" + "（输入\"b\"返回主菜单）");
            no = sc.nextLine();
            // 优化6：返回管理主菜单
            if (no.equals("b")) {
                return;
            } else {
                for (int i = 0; i < array.size(); i++) {
                    Course course = array.get(i);
                    if (course.getNo().equals(no)) {
                        flag = true;
                        name = course.getName();
                        grade=course.getGrade();
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("该信息不存在，请重新输入!");
                }
            }
        }
        // 优化7：可选择性更改学生信息
        System.out.println("-----修改课程: \"" + no + "\"-----");
        System.out.println("1修改课程的多组信息");
        System.out.println("2仅修改课程的课程名");
        System.out.println("3仅修改课程的学分");
        System.out.println("4返回主菜单");
        System.out.println("请输入你的选择：");
        String line = sc.nextLine();
        switch (line) {
            case "1":
                System.out.println("请输入课程新课程名：");
                name = sc.nextLine();
                System.out.println("请输入课程新学分：");
                grade = sc.nextLine();
                break;
            case "2":
                System.out.println("请输入课程新课程名：");
                name = sc.nextLine();
                break;
            case "3":
                System.out.println("请输入课程新学分：");
                grade = sc.nextLine();
                break;
            case "4":
                return;
        }

        Course c = new Course();
        c.setNo(no);
        c.setName(name);
        c.setGrade(grade);
        for (int i = 0; i < array.size(); i++) {
            Course course = array.get(i);
            if (course.getNo().equals(no))
                array.set(i, c);
        }
        System.out.println("修改学生成功");
    }
    static void findCourse(ArrayList<Course> array) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String no = null;
        String name = null;
        String grade = null;
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询!");
            return;
        }
        while (!flag) {
            System.out.println("请输入你要查询的课程号: \r\n" + "（输入\"b\"返回主菜单）");
            no = sc.nextLine();
            // 优化6：返回管理主菜单
            if (no.equals("b")) {
                return;
            } else {
                for (int i = 0; i < array.size(); i++) {
                    Course course = array.get(i);
                    if (course.getNo().equals(no)) {
                        flag = true;
                        name = course.getName();
                        grade = course.getGrade();
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("该信息不存在，请重新输入!");
                }
            }
        }

            System.out.println(no + "\t\t" + name + "\t\t" + grade + "分" );
    }


}
