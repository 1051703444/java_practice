import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        String str = null;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        //System.out.println("输入的字符 = " + str);

        System.out.println("原字符串的每个ascii值");

        int[] asc = new int[str.length()];  //获得每个字符的ascii值
        for (int i = 0; i < str.length(); i++) {
            asc[i] = str.charAt(i);
            System.out.print(asc[i] + "    ");
        }
        System.out.println();

        String[][] binary = new String[str.length()][8];

        System.out.println("隐藏前==============");

        ConvertBinary(asc, binary);  //将字符串的ascii转换成对应的二进制

        for (int i = 0; i < asc.length; i++) {
            for (int j = 0; j < binary[i].length; j++) {
                System.out.print(binary[i][j]);
            }
            System.out.println();
        }

        String FF = new String("Lcxc");

        System.out.println("隐藏后==============");
        exclusive_OR(FF, binary);  //异或运算，进行编码隐藏

        for (int i = 0; i < asc.length; i++) {
            for (int j = 0; j < binary[i].length; j++) {
                System.out.print(binary[i][j]);
            }
            System.out.println();
        }

        int[] asc1 =  ConvertTen(binary);  //把二进制转换成十进制

        System.out.print("转换后的字符串 = ");
        for (int i = 0; i < asc1.length; i++) {
            System.out.print((char) asc1[i]);
        }

        System.out.println();

        System.out.println("字符串还原=========================");

        exclusive_OR(FF, binary);  //再次进行异或运算，进行字符串编码还原

        int[] asc2 = ConvertTen(binary);  //将还原后的二进制转化成十进制

        System.out.print("还原后的字符串 = ");
        for (int i = 0; i < asc2.length; i++) {
            System.out.print((char) asc2[i]);
        }

    }

    public static String[][] ConvertBinary(int[] asc, String[][] binary) {
        for (int i = 0; i < asc.length; i++) {
            int j = 7;
            while (asc[i] != 0) {
                binary[i][j] = String.valueOf(asc[i] % 2);
                asc[i] /= 2;
                j--;
            }
            for (int k = j; k >= 0; k--) {
                binary[i][k] = String.valueOf(0);
            }
        }
        return binary;
    }

    public static String[][] exclusive_OR(String FF, String[][] binary) {
        for (int i = 0; i < binary.length; i++) {
            for (int j = 0; j < 8; j++) {
                if (binary[i][j].charAt(0) == FF.charAt(j)) {
                    binary[i][j] = String.valueOf(0);
                }
                else {
                    binary[i][j] = String.valueOf(1);
                }
                //System.out.print(binary[i][j]);
            }
            //System.out.println();
        }
        return binary;
    }

    public static int[] ConvertTen(String[][] binary) {
        int[] asc = new int[binary.length];
        //System.out.println("转换后的ascii = ");
        for (int i = 0; i < binary.length; i++) {
            int k = binary[i].length - 1;
            for (int j = 0; j < binary[i].length; j++) {
                //System.out.println("当前的asc[i] = " + asc[i]);
                asc[i] += abs(binary[i][j].charAt(0) - 48, binary[i].length - 1 - j);
                //System.out.println("第" + (j+1) + "步asc[i] += abs  " + abs(binary[i][j].charAt(0) - 48, binary[i].length - 1 - j));
            }
            //System.out.println(asc[i]);
            //System.out.println();
        }
        return asc;
    }

    public static int abs(int a, int b) {
        //System.out.println("a = " + a + ", b = " + b);
        for (int i = 0; i < b; i++) {
            a *= 2;
        }
        //System.out.println("a = " + a);
        return a;
    }

}

