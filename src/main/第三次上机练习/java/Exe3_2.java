class Complex {
    private double real; // 实部
    private double imag; // 虚部

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // 显示复数
    public void display() {
        if (imag >= 0) {
            System.out.println(real + "+" + imag + "i");
        } else {
            System.out.println(real + "" + imag + "i");
        }
    }

    // 复数加法
    public Complex add(Complex c) {
        double r = real + c.real;
        double i = imag + c.imag;
        return new Complex(r, i);
    }

    // 复数减法
    public Complex sub(Complex c) {
        double r = real - c.real;
        double i = imag - c.imag;
        return new Complex(r, i);
    }

    // 复数乘法
    public Complex mul(Complex c) {
        double r = real * c.real - imag * c.imag;
        double i = real * c.imag + imag * c.real;
        return new Complex(r, i);
    }

    // 获取实部
    public double getReal() {
        return real;
    }

    // 获取虚部
    public double getImag() {
        return imag;
    }
}

public class Exe3_2 {
    public static void main(String[] args) {
            Complex C1 = new Complex(0, 1.0);
            Complex C2 = new Complex(3.2, 5.2);
            Complex C3 = new Complex(1 , -1);
            Complex C4 = new Complex(0, 0);
            Complex C5 = new Complex(5.5, 0);

            // 显示复数
            C2.display();

            // 复数加法
            Complex result1 = C2.add(C3);
            result1.display();

            // 复数减法
            Complex result2 = C2.sub(C3);
            result2.display();

            // 复数乘法
            Complex result3 = C2.mul(C3);
            result3.display();

            // 获取实部和虚部
            System.out.println("Real part of C2: " + C2.getReal());
            System.out.println("Imaginary part of C2: " + C2.getImag());

    }
}
