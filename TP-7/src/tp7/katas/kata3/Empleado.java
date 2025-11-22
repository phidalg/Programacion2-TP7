package tp7.katas.kata3;

/**
 *
 * @author Pedro Hidalgo
 */
public class Empleado {

    private String nombre;
    private double valorHora;

    public Empleado(String nombre, double valorHora) {
        this.nombre = nombre;
        this.valorHora = valorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public void calcularSueldo(double horasTrabajadasMes) {
        System.out.println("Horas trabajadas: " + horasTrabajadasMes);
        System.out.println("Valor hora: $" + valorHora);
        System.out.println("Sueldo: $" + horasTrabajadasMes * valorHora);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", valorHora=" + valorHora + '}';
    }
    
}