package IteratorPattern;

public interface Iterator {
    public Object next();
    public boolean hasNext();
    public void remove(int position);
}
