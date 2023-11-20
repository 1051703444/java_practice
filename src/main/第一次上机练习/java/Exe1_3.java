public class Exe1_3 {
    public static void main(String[] args) {
        String str="Java";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int a=str.charAt(i);
            int b=a+2;
            System.out.println(a+" "+b);
            stringBuffer.append((char)(str.charAt(i)^(str.charAt(i)+2)));
        }
        System.out.println(stringBuffer);
    }
}
