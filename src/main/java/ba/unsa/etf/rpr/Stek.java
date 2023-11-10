package ba.unsa.etf.rpr;
import java.util.Stack;

public class Stek{
    public static void main(String[] args){
    Stack<Integer> stek = new Stack<Integer>();


    stek.push(1);
    stek.push(2);
    stek.push(3);
    stek.push(4);
    stek.push(7);

    System.out.println("ELementi steka su:");
    System.out.println(stek);

    int velicina=stek.size();
    int vrhSteka = stek.peek();
    System.out.println("Zadnji element steka je: "+ vrhSteka + "\n");

    int uklonjeniElement=stek.pop();
    System.out.println("Uklonjeni element sa steka je: "+ uklonjeniElement+"\n");

    System.out.println("\nElementi steka nakon uklanjanja:");
    System.out.println(stek);

    int indeksElementa = stek.search(2);
    System.out.println("\nIndeks elementa 2 na steku: " + indeksElementa);

    System.out.println("ELementi steka su:");
    System.out.println(stek);

    }
}