package IteratorPattern;

import java.util.ArrayList;

public class BreakfastMenu implements Menu{
    ArrayList breakfastItems;

    public BreakfastMenu()
    {
        breakfastItems = new ArrayList<MenuItem>();

    }

    @Override
    public Iterator createIterator() {
        return new BreakfastMenuIterator(this.breakfastItems);
    }

    public void addItem(String name, String description , double price)
    {
        MenuItem item = new MenuItem(name, description , price);
        breakfastItems.add(item);
    }
    public ArrayList getBreakfastItems()
    {
        return this.breakfastItems;
    }
}
