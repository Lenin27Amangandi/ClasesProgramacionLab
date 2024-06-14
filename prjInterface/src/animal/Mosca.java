package animal;

import clasificacionAnimal.Insecto;

public class Mosca extends Insecto {
    public Mosca(String nombre) {
        setNombre(nombre);
        System.out.println("Nacion una mosca: " + getNombre());
    }
}
