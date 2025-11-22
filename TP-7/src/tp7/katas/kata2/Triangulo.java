package tp7.katas.kata2;

/**
 *
 * @author Pedro Hidalgo
 */
public class Triangulo extends Figura {

    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        super("Triángulo");
        validarTriangulo(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void validarTriangulo(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return;
        } else {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        validarTriangulo(a, this.b, this.c);
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        validarTriangulo(this.a, b, this.c);
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        validarTriangulo(this.a, this.b, c);
        this.c = c;
    }
    
    public double calcularPerimetro() {
        return a + b + c;
    }
    
    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}