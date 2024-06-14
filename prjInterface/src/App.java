import animal.Leon;
import animal.Mosca;
import animal.spider;

public class App {
    public static void main(String[] args) throws Exception {

        Leon leo        = new Leon("Alex");
        spider arana    = new spider("Peter");
        Mosca mosca     = new Mosca("Bill");

        System.out.println(leo.comer());
        System.out.println(leo.comer("Filete de jirafa"));
        System.out.println(arana.comer());
        System.out.println(arana.comer("Water"));
        System.out.println(arana.comer(mosca));
    }
}
