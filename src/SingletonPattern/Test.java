package SingletonPattern;

import javax.print.DocFlavor;

public class Test {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler;
        chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println("Is empty: "+chocolateBoiler.isEmpty());
        System.out.println("Is Boiled: "+chocolateBoiler.isBoiled());
        chocolateBoiler.fill();
        System.out.println("Is empty: "+chocolateBoiler.isEmpty());
        System.out.println("Is Boiled: "+chocolateBoiler.isBoiled());
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        chocolateBoiler1.boil();
        System.out.println("");
        System.out.println("Is empty: "+chocolateBoiler.isEmpty());
        System.out.println("Is Boiled: "+chocolateBoiler.isBoiled());
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        chocolateBoiler2.drain();
        System.out.println("");
        System.out.println("Is empty: "+chocolateBoiler.isEmpty());
        System.out.println("Is Boiled: "+chocolateBoiler.isBoiled());


    }
}
