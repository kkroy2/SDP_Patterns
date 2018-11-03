package IteratorPattern;

public class Waitress {

    BreakfastMenu breakfastMenu;
    DinnerMenu dinnerMenu;

    public Waitress()
    {
        breakfastMenu = new BreakfastMenu();
        dinnerMenu = new DinnerMenu();
        breakfastMenu.addItem("NBC", "Nut Butter, Banana, and Chia Seed Toast",110);
        breakfastMenu.addItem("NC", "Nut Butter, and Chia Seed Toast",70);
        breakfastMenu.addItem("PE", "Porata with Egg",30);

        dinnerMenu.addItem("RE","Rice with Egg",40);
        dinnerMenu.addItem("RC","Rice with Chicken",80);
        dinnerMenu.addItem("RB","Rice with Beaf",70);
    }

    public void printMenu()
    {
        DinnerMenuIterator dinnerMenuIterator = new DinnerMenuIterator(dinnerMenu.getDinnerItems());
        BreakfastMenuIterator breakfastMenuIterator = new BreakfastMenuIterator(breakfastMenu.getBreakfastItems());
        System.out.println("Breakfast Menu items:");
        printMenu(breakfastMenuIterator);
        System.out.println("Dinner Menu items:");
        printMenu(dinnerMenuIterator);


    }
    private void printMenu( Iterator iterator)
    {
        while(iterator.hasNext())
        {
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.getName()+": "+ item.getDescription()+" Price:"+item.getPrice());
        }
    }

}
