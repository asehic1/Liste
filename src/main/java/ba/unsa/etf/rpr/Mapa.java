package ba.unsa.etf.rpr;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Mapa {
    public static void main(String[] args) {
            Map<Integer, Integer> a = new HashMap<>();

            // stavljanje elemenata u mapu
            a.put(1,1);
            a.put(2,2);
            a.put(3,6);
            a.put(4,9);

            System.out.println(a);

            int n=a.size();
            System.out.println("\nVeličina mape: " + n);

            Integer l=a.get(1);
            System.out.println(l);

            a.remove(2);
            System.out.println(a);

            //dohvaca skup svih kljuceva
            Set<Integer> keys = a.keySet();

            Collection<Integer> v = a.values();
        System.out.println("\n \n \n");
            Iterator<Map.Entry<Integer,Integer>> it=a.entrySet().iterator();

            while(it.hasNext()){
                Map.Entry<Integer, Integer> ulaz = it.next();
               Integer b = ulaz.getKey();
                Integer c = ulaz.getValue();

                System.out.println(it.next());
            }
    }
}