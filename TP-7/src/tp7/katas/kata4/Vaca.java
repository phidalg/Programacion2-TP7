package tp7.katas.kata4;

/**
 *
 * @author Pedro Hidalgo
 */
public class Vaca extends Animal {
    
    private static final String DESCRIPCION = "Es productora de leche.";
    private static final String SONIDO = "Muuu!";

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
        return "Vaca";
    }
    
}