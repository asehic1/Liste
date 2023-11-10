package ba.unsa.etf.rpr;
import java.util.Set;
import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();


        a.add(1);
        a.add(2);
        a.add(1);
        a.add(7);
        a.add(1);
        a.add(8);
        a.add(0);

        System.out.println("Elementi seta su: ");
        System.out.println(a);

        int velicina = a.size();
        System.out.println("\nVeličina seta: " + velicina);

        a.remove(1);
        System.out.println(a);

        boolean jePrazan = a.isEmpty();
        System.out.println("\nSet je prazan: " + jePrazan);

        a.clear();
    }
}