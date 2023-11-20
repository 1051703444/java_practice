public class Exe2_5 {
    public static void main(String[] args) {
        int fruit=0;
        int[] arr = new int[5];
        int index;
        for (int i=1;i<=5;++i){
            index=fruit;
            fruit=(fruit+1)*2;
            arr[5-i]=fruit-index;
        }
        System.out.println("水果一共有"+fruit+"个");
        int day=1;
        for (int eat: arr) {
            System.out.println("猴子第"+day+"天吃"+eat+"个水果");
        }
    }
}
