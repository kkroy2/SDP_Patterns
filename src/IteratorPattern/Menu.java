package IteratorPattern;

public interface Menu {
    public Iterator createIterator();
    public void addItem(String name, String description, double price);
}
