package tp7;

import java.util.ArrayList;
import java.util.List;
import tp7.katas.kata1.Auto;
import tp7.katas.kata1.Vehiculo;
import tp7.katas.kata2.Circulo;
import tp7.katas.kata2.Figura;
import tp7.katas.kata2.Rectangulo;
import tp7.katas.kata2.Triangulo;
import tp7.katas.kata3.Empleado;
import tp7.katas.kata3.EmpleadoPlanta;
import tp7.katas.kata3.EmpleadoTemporal;
import tp7.katas.kata4.Animal;
import tp7.katas.kata4.Gato;
import tp7.katas.kata4.Perro;
import tp7.katas.kata4.Vaca;

/**
 *
 * @author Pedro Hidalgo
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("\nKata I\n");
        Vehiculo autito = new Auto(2, "Fiat", "600");
        autito.mostrarInfo();
        
        System.out.println("\nKata II\n");
        Figura[] figuras = new Figura[6];
        figuras[0] = new Triangulo(3.5, 4.5, 5.5);
        figuras[1] = new Rectangulo(6, 4);
        figuras[2] = new Circulo(5.2);
        figuras[3] = new Triangulo(3.1, 4, 7);
        figuras[4] = new Circulo(8);
        figuras[5] = new Rectangulo(3, 4);
        
        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.println("Área: " + figura.calcularArea());
            System.out.println();
        }
        
        System.out.println("Kata III\n");
        
        Empleado[] empleados = new Empleado[5];
        empleados[0] = new EmpleadoPlanta(160, "Fulano", 7000);
        empleados[1] = new EmpleadoTemporal("Juan", 7500);
        empleados[2] = new EmpleadoPlanta(120, "Ana", 7500);
        empleados[3] = new EmpleadoTemporal("María", 7500);
        empleados[4] = new EmpleadoPlanta(160, "Raúl", 8000);
        
        System.out.println("Se crean los siguientes empleados:");
        for(Empleado e : empleados) {
            System.out.println();
            System.out.println(e);
            e.calcularSueldo(120);
        }
        
        System.out.println("\nSe clasifican los empleados:\n");
        List<Empleado> empleadosPlanta = new ArrayList<>();
        List<Empleado> empleadosTemporales = new ArrayList<>();
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                empleadosPlanta.add(empleado);
            }
            if (empleado instanceof EmpleadoTemporal) {
                empleadosTemporales.add(empleado);
            }
        }
        
        System.out.println("Empleados de planta:");
        for (Empleado e : empleadosPlanta) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Empleados de temporales:");
        for (Empleado e : empleadosTemporales) {
            System.out.println(e);
        }
        
        System.out.println("\nKata IV\n");
        
        Animal[] animales = new Animal[3];
        animales[0] = new Vaca();
        animales[1] = new Perro();
        animales[2] = new Gato();
        
        for (Animal animal : animales) {
            System.out.println(animal + ":");
            animal.hacerSonido();
            animal.describirAnimal();
            System.out.println();
        }
    }
    
}