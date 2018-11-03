package IteratorPattern;

import java.util.ArrayList;

public class BreakfastMenu {
    ArrayList breakfastItems;

    public BreakfastMenu()
    {
        breakfastItems = new ArrayList<MenuItem>();

    }
    public void addItem(String name, String description ,double price)
    {
        MenuItem item = new MenuItem(name, description , price);
        breakfastItems.add(item);
    }
    public ArrayList getBreakfastItems()
    {
        return this.breakfastItems;
    }
}
