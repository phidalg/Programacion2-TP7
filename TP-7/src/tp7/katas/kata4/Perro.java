package tp7.katas.kata4;

/**
 *
 * @author Pedro Hidalgo
 */
public class Perro extends Animal {

    private static final String DESCRIPCION = "Es el mejor amigo del hombre.";
    private static final String SONIDO = "Guau guau!";
    
    @Override
    public void hacerSonido() {
        System.out.println(SONIDO);
    }

    @Override
    public void describirAnimal() {
        System.out.println(DESCRIPCION);
    }
    
    @Override
    public String toString() {
        return "Perro";
    }
}