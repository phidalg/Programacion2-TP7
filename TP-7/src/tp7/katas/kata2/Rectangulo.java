package tp7.katas.kata2;

/**
 *
 * @author Pedro Hidalgo
 */
public class Rectangulo extends Figura {
    
    private double a;
    private double b;

    public Rectangulo(double a, double b) {
        super("Rectángulo");
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    @Override
    public double calcularArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "a=" + a + ", b=" + b + '}';
    }

}