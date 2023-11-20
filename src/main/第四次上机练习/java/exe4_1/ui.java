package exe4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ui {
     static void show(ArrayList array) {
        while (true) {

            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查询学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    business.addStudent(array);
                    break;
                case "2":
                    business.deleteStudent(array);
                    break;
                case "3":
                    business.updateStudent(array);
                    break;
                case "4":
                    business.findStudent(array);
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
