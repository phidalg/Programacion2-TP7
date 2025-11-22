package tp7.katas.kata3;

/**
 *
 * @author Pedro Hidalgo
 */
public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(String nombre, double valorHora) {
        super(nombre, valorHora);
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{nombre=" + super.getNombre() + ", valorHora=" + super.getValorHora() + '}';
    }
    
}