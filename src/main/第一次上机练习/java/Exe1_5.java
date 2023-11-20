public class Exe1_5 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        for (int s=0;s<9;s++)
        {
            for (int q=0;q<=s;q++)
            {
                if(s==q||0==q)
                    arr[s][q]=1;
                else
                    arr[s][q]=arr[s-1][q]+arr[s-1][q-1];
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-5d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
