package laReptiles;

import laFanerozoico.laTurtle;

public class Turtle extends laTurtle {
    private String laNombreTurtle;

    // Constructor con metodo heredado
    public Turtle() {
        laPresentar("Turtle", 21);
    }

    // Metodo pedir nombre

    // Polimorfismo
    public void laSaludar() {
        System.out.println("Hola soy la tortuga");
    }

    public void laSaludar(String laNombreTurtle) {
        System.out.println("Hola soy la tortuga " + laNombreTurtle);
    }

    public String getLaNombreTurtle() {
        return laNombreTurtle;
    }

    public void setLaNombreTurtle(String laNombreTurtle) {
        this.laNombreTurtle = laNombreTurtle;
    }

}
