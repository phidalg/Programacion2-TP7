package tp7.katas.kata1;

/**
 *
 * @author Pedro Hidalgo
 */
public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Puertas:  " + cantidadPuertas);
    }

    @Override
    public String toString() {
        return "Auto{marca=" + super.getMarca() + ", modelo=" + super.getModelo() + ", cantidadPuertas=" + cantidadPuertas + '}';
    }
    
}