package tp7;

import tp7.katas.kata1.Auto;
import tp7.katas.kata1.Vehiculo;
import tp7.katas.kata2.Circulo;
import tp7.katas.kata2.Figura;
import tp7.katas.kata2.Rectangulo;
import tp7.katas.kata2.Triangulo;

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
        
        
        System.out.println("\nKata IV\n");
        
    }
    
}