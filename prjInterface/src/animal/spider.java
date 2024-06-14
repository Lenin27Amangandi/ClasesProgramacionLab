package animal;

import clasificacionAnimal.Insecto;

public class spider extends Insecto implements IComportamientoNatural, IComportaminetoInsecto {

    public spider(String nombre) {
        setNombre(nombre);
        nacer();
    }

    @Override
    public void nacer() {
        System.out.println("This araña is born ... " + getNombre());
    }

    @Override
    public String comer(String comida) {
        return "This araña ha comido " + comida;
    }

    @Override
    public String comer() {
        return "This araña ha camido hambre";
    }

    @Override
    public String comer(Mosca mosca) {

        return "Esta araña ha comido una mosca muerta: " + mosca.getNombre();
    }

}
