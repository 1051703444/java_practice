public class Exe2_1 {
    public static void main(String[] args) {
        int x,y,z;
        int count=1;
        for(x=0;x<=100/1;x++){
            for (y=0;y<=100/3;++y){
                for (z=0;z<=100;z=z+3){
                    if(x*1+3*y+z/3==100 && x+y+z==100){
                        System.out.printf("方案%d：鸡公%d只 鸡母%d只 鸡雏%d只\n",count,x,y,z);
                        count++;
                    }
                }
            }
        }
    }
}
