public class Exe2_2 {
    public static void main(String[] args) {
        double flag=1;
        double res=0.0,term=4.0,temp=1.0;
        while(Math.abs(term)>=1e-6){
            res=res+term;
            flag=flag*-1.0;
            temp=temp+2.0;
            term=4.0/temp*flag;

        }
        System.out.printf("pi=%f",res);
    }
}
