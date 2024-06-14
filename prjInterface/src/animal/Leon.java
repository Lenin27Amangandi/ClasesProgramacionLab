package animal;

import clasificacionAnimal.Vertebrado;

public class Leon extends Vertebrado implements IComportamientoNatural {
    public Leon(String nombre){
        setNombre(nombre);
        nacer();
    }
    @Override
    public void nacer() {
        System.out.println("The lion is born ... "+getNombre());
    }
    @Override
    public String comer(String comida) {
        return "This lion ha comido " + comida;
    }
    @Override
    public String comer() {
        return "This lion ha camido hambre";
    }
}
