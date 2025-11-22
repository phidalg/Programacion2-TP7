package tp7.katas.kata4;

/**
 *
 * @author Pedro Hidalgo
 */
public class Gato extends Animal {

    private static final String DESCRIPCION = "Es independiente y cazador.";
    private static final String SONIDO = "Miau miau!";
    
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
        return "Gato";
    }
}