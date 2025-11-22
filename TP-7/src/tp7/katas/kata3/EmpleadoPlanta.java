package tp7.katas.kata3;

/**
 *
 * @author Pedro Hidalgo
 */
public class EmpleadoPlanta extends Empleado {
    
    private int horasContrato;

    public EmpleadoPlanta(int horasContrato, String nombre, double valorHora) {
        super(nombre, valorHora);
        this.horasContrato = horasContrato;
    }

    public double getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }

    @Override
    public void calcularSueldo(double horasExtra) {
        System.out.println("Horas contrato: " + horasContrato);
        System.out.println("Valor hora $: " + super.getValorHora());
        System.out.println("Sueldo: $" + horasContrato * super.getValorHora());
    }

    @Override
    public String toString() {
        String nombre = super.getNombre();
        double valorHora = super.getValorHora();
        return "EmpleadoPlanta{nombre=" + nombre + ", horasContrato=" + horasContrato + ", valorHora=" + valorHora + '}';
    }
    
}