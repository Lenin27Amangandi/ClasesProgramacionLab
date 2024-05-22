
// import java.lang.reflect.Array;
// import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        flujoDeTeclado();
        flujoDeTeclado();
        // flujoDeString();

        Persona oP = new Persona();
        Persona oP2 = new Persona(null, null, null);
        Supervisor oSu = new Supervisor();

        oP.setNombre("Lenin");
        oP.setApellido(null);
        oP.setCedula("1753193828");

        System.out.println(oP.getCedula());
        System.out.println(oP.getNombre());
        System.out.println(oP.getApellido());

        System.out.println(oP2.getCedula());
        System.out.println(oP2.getNombre());
        System.out.println(oP2.getApellido());

    }

    // private static void flujoDeString() {
    // int total = 0;
    // String datos = "1-2-20";
    // Scanner sc = new Scanner(datos);sc.useDelimiter("-");

    // while(sc.hasNext())
    // {
    //     total += sc.nextInt();
    // }System.out.println("El total es: "+total);
    // }

    private static void flujoDeTeclado() {
        int total = 0;
        // Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa valores a sumar");
        while (sc.hasNext()) {
            total += sc.nextInt();
        }
        System.out.println(total);
        sc.next();
        // sc.close();
    }
}