import java.util.Scanner;

public class Exe2_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("请输入一个四位数字的年份:");
        int i = scanner.nextInt();
        if (i%400==0||(i%4 == 0 && i%100 != 0))
            System.out.print("是闰年");
        else
            System.out.print("不是闰年");
    }
}
