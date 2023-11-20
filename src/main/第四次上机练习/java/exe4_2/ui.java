package exe4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ui {
     static void show(ArrayList array) {
        while (true) {

            System.out.println("--------欢迎来到课程管理系统--------");
            System.out.println("1 添加课程");
            System.out.println("2 删除课程");
            System.out.println("3 修改课程");
            System.out.println("4 查询课程");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    business.addCourse(array);
                    break;
                case "2":
                    business.deleteCourse(array);
                    break;
                case "3":
                    business.updateCourse(array);
                    break;
                case "4":
                    business.findCourse(array);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    System.exit(0);// JVM退出
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
