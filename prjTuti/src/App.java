public class App {
    public static void main(String[] args) {

        Persona oP = new Persona();
        Persona oP2 = new Persona(null, null, null);
        Supervisor oSu = new Supervisor();

        oP.setCedula("175342");
        oP.setNombre("Lenin");
        oP.setApellido(null);

        System.out.println(oP.getCedula());
        System.out.println(oP.getNombre());
        System.out.println(oP.getApellido());

        System.out.println(oP2.getCedula());
        System.out.println(oP2.getNombre());
        System.out.println(oP2.getApellido());

    }
}
