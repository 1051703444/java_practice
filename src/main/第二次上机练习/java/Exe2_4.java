import java.util.Scanner;

public class Exe2_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("请输入:");
        String next = scanner.next();
        int i,j;
        for (i=0,j=next.length()-1;i<=j;++i,--j){
            if(next.charAt(i)!=next.charAt((j))){
                System.out.println("不是回文数！");
                return ;
            }
        }
        System.out.println("是回文数！");
    }
}
