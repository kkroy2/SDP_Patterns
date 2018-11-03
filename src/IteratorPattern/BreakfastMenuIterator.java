package IteratorPattern;

import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator {

    ArrayList menuItems;
    int currentPosition;
    public BreakfastMenuIterator(ArrayList menuItems)
    {
        this.menuItems = menuItems;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < menuItems.size();
    }

    @Override
    public Object next() {
        MenuItem item  = (MenuItem) menuItems.get(currentPosition);
        this.currentPosition = currentPosition + 1;
        return item;
    }

    @Override
    public void remove(int position)
    {
        if(position >= 0 || position < menuItems.size())
        menuItems.remove(position);
        return;
    }
}
