public class Padre {

    private String nombre;

    // Constructor con parametros
    public Padre(String nombre) {
        setNombre(nombre);
    }

    // Constructor sin parametro
    public Padre() {
        setNombre("I am your father");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = " ";
        if (nombre != null) {
            this.nombre = nombre.toUpperCase();
        }
    }

    public void saludar() {
        System.out.println("Good morning my friend, my name is " + nombre);
    }

}
