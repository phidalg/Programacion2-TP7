package tp7.katas.kata2;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double calcularArea() {
        double area = 0;
        return area;
    }
}