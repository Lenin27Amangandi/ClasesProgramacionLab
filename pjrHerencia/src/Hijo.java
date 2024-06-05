public class Hijo extends Padre {

    private String nombreHijo;

    public Hijo() {
        // Always debe estar la palabra super al inicio
        super("Father Lenin The End");
    }

    public Hijo(String nombreHijo) {
        // Para llamar al constrfutor padre utilizamos la palabra super
        super("Liam");
        this.nombreHijo = nombreHijo;
    }

    @Override
    public void saludar() {
        System.out.println("I am " + nombreHijo);
        System.out.println("My Father is " + getNombre());
    }

}
