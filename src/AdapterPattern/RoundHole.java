package AdapterPattern;

public class RoundHole {
    private double radius;
    public RoundHole(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    boolean fits(RoundPeg roundPeg)
    {
        return (boolean)(this.radius >= roundPeg.getRadius());
    }
}
