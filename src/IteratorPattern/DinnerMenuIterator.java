package IteratorPattern;

public class DinnerMenuIterator implements Iterator {
    MenuItem [] items;
    private int currentPosition;
    public DinnerMenuIterator(MenuItem[] items)
    {
        this.items = items;
        currentPosition = 0;
    }
    @Override
    public boolean hasNext() {
        //System.out.println(currentPosition+" pip "+items.length);
        return this.currentPosition < items.length && items[currentPosition]!=null;
    }
    @Override
    public Object next() {

        MenuItem item = items[currentPosition];
        this.currentPosition = this.currentPosition + 1;
        return item;
    }


}
