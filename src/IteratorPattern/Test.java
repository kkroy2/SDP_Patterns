package IteratorPattern;

public class Test {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu;
        DinnerMenu dinnerMenu;
        breakfastMenu = new BreakfastMenu();
        dinnerMenu = new DinnerMenu();
        breakfastMenu.addItem("NBC", "Nut Butter, Banana, and Chia Seed Toast",110);
        breakfastMenu.addItem("NC", "Nut Butter, and Chia Seed Toast",70);
        breakfastMenu.addItem("PE", "Porata with Egg",30);

        dinnerMenu.addItem("RE","Rice with Egg",40);
        dinnerMenu.addItem("RC","Rice with Chicken",80);
        dinnerMenu.addItem("RB","Rice with Beaf",70);

        Waitress waitress = new Waitress(breakfastMenu , dinnerMenu);
        waitress.printMenu();
    }
}
