public class Exe1_4 {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            for(int z=0;z<5-x;++z)
                System.out.print(" ");
            for (int y=0;y<2*x-1;++y)
                System.out.print("*");
            for(int z=0;z<5-x;++z)
                System.out.print(" ");
            System.out.println();
        }
        for (int x = 4; x >0; x--) {
            for(int z=0;z<5-x;++z)
                System.out.print(" ");
            for (int y=2*x-1;y>0;--y)
                System.out.print("*");
            for(int z=0;z<5-x;++z)
                System.out.print(" ");
            System.out.println();
        }
    }
}
