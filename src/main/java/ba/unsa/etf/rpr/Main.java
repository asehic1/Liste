package ba.unsa.etf.rpr;

import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>();

//dodavanje elemenata u listu
        a.add(3);
        a.add(4);
        a.add(5);

//rasponska for petlja kroz listu
        for(Integer n : a){
            System.out.println(n);
        }

        int velicina=a.size();
        int index=a.indexOf("3");
        boolean sadrzi=a.contains("3");

        //brisanje jednog elementa it liste
        a.remove("4");


        //brisanje svega iz liste
        a.clear();


        Scanner sc= new Scanner(System.in);
        System.out.println("unesite broj elemenata liste: ");
        int broj= sc.nextInt();

        System.out.println("Unesite elemente liste: ");
        for(int i=0;i<broj;i++){
            int e=sc.nextInt();
            a.add(e);
        }
        Collections.sort(a);

        boolean jePrazna=a.isEmpty();

        System.out.print("lista je prazna: "+ jePrazna);
        System.out.print("\n");

        int element=a.get(2);
        System.out.print("Element na indexu 3 je: "+element);
        System.out.print("\n");
        System.out.println("Uneseni elementi liste su: ");
        for(int e : a){
            System.out.print(e + "\n");
        }


        Iterator<Integer> it = a.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }



    }
}