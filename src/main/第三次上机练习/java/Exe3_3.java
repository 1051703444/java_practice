import java.util.*;
import java.lang.*;


class point {
    private double x;//x坐标
    private double y;//y坐标
    point(){
        Scanner read1=new Scanner(System.in);
        double x=read1.nextDouble();
        double y=read1.nextDouble();
        this.x=x;
        this.y=y;
    }//无参数构造函数
    point(double x,double y){//带参数构造函数

        this.x=x;
        this.y=y;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    int getArea() {//点的面积为零
        int area= 0;
        return area;

    }
    int getGirth() {//点的周长也为0
        int Girth=0;
        return Girth;
    }
}

class line{
    private double x1,y1;
    private double x2,y2;
    line(){
        Scanner read2=new Scanner (System.in);
        double x1=read2.nextDouble();
        double y1=read2.nextDouble();
        double x2=read2.nextDouble();
        double y2=read2.nextDouble();
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;

    }
    line(double x1,double y1,double x2,double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }



    double getGirth(){
        double Girth=Math.sqrt((x2*x2-x1*x1)+(y2*y2-y1*y1));
        return Girth;
    }
    int getArea() {//面积为零
        int area= 0;
        return area;

    }
}

class circle{
    private double radius;
    circle(){
        Scanner read3=new Scanner(System.in);
        double r=read3.nextDouble();
        this.radius=r;
    }//无参数构造函数
    circle(double r){
        this.radius=r;
    }

    double getGirth() {//计算圆的周长
        double Girth=2*3.14*radius;
        return Girth;
    }
    double getArea() {//计算圆的面积
        double area= 3.14*radius*radius;
        return area;
    }

}

class Rectangle{
    private double length;
    private double width ;
    Rectangle (){
        Scanner read4=new Scanner(System.in);
        double a =read4.nextDouble();
        double b =read4.nextDouble();
        this.length=a;
        this.width=b;
    }
    Rectangle (double a,double b){
        this.length=a;
        this.width=b;

    }
    double getGirth() {
        double Girth=2*(length +width);
        return Girth;
    }
    double getArea() {
        double area= length*width;
        return area;
    }

}

class triangle{
    private double x;
    private double y;
    private double z;

    triangle(){
        Scanner read5=new Scanner(System.in);
        double a=read5.nextDouble();
        double b=read5.nextDouble();
        double c=read5.nextDouble();
        this.x=a;
        this.y=b;
        this.z=c;

    }//无参数构造函数
    triangle(double a ,double b,double c){
        this.x=a;
        this.y=b;
        this.z=c;

    }
    double getGirth() {
        double Girth=x+y+z;
        return Girth;
    }

    double getArea(){
        double m=(x+y+z)/2.0;
        double area=  Math.sqrt(m  * (m- x) * (m- y) * (m- z));
        return area;
    }

}
public class Exe3_3 {
    public static void main(String[] args) {

        System.out.println("请输入点坐标:x y");
        point a = new point();
        a.getArea();
        a.getGirth();
        System.out.println("点的面积为：" + a.getArea());
        System.out.println("点的周长为：" + a.getGirth());

        System.out.println("请输入线的起始坐标：x1 y1 x2 y2");
        line b = new line();
        b.getArea();
        b.getGirth();
        System.out.println("线的面积为：" + b.getArea());
        System.out.println("线的周长为：" + b.getGirth());

        System.out.println("请输入圆半径：r");
        circle c = new circle();
        c.getArea();
        c.getGirth();
        System.out.println("圆的面积为：" + c.getArea());
        System.out.println("圆的周长为：" + c.getGirth());


        System.out.println("请输入长方形的长和宽：L h");
        Rectangle d = new Rectangle();
        d.getArea();
        d.getGirth();
        System.out.println("长方形的面积为：" + d.getArea());
        System.out.println("长方形的周长为：" + d.getGirth());


        System.out.print("请输入三角行三条边长 x y z：");
        triangle e = new triangle();
        e.getArea();
        e.getGirth();
        System.out.println("三角形的面积为：" + e.getArea());
        System.out.println("三角形的周长为：" + e.getGirth());
    }
}