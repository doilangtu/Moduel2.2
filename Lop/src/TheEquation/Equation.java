package TheEquation;

public class Equation {
    //
    private double a, b, c;
    private double delta;
    //Constructor


    public Equation() {
    }

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //
    public double getCaculation() {
        delta = Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
        return delta;
    }

    public double getNghiemKep() {
        return this.getB() / (2 * this.getA());
    }

    public double getNghiem2() {
        return ((-this.getB() + Math.sqrt(delta)) / (2 * this.getA()));
    }

    public double getNghiem3() {
        return ((-this.getB() - Math.sqrt(delta)) / (2 * this.getA()));
    }

    @Override
    public String toString() {
        return "Equation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", delta=" + delta +

                '}';
    }
}




