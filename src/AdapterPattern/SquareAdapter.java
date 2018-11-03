package AdapterPattern;

public class SquareAdapter extends RoundPeg{
    SquarePeg squarePeg;

    public SquareAdapter(SquarePeg squarePeg)
    {
        this.squarePeg = squarePeg;
    }


    public double getRadius()
    {
        double radius = squarePeg.getWidth()*squarePeg.getWidth()*2.0;
        radius = Math.sqrt(radius);
        radius = radius/2.0;
        return radius;
    }

    public SquarePeg getSquarePeg() {
        return squarePeg;
    }


}
