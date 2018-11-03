package AdapterPattern;

public class Test {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Does Round Peg fit Round hole: "+roundHole.fits(roundPeg));


        SquarePeg squarePeg = new SquarePeg(4);
        SquarePeg squarePeg1 = new SquarePeg(16);

        roundPeg = new SquareAdapter(squarePeg);
        System.out.println("Does Square Peg fit Round hole: "+roundHole.fits(roundPeg));

        roundPeg = new SquareAdapter(squarePeg1);
        System.out.println("Does Square Peg fit Round hole: "+roundHole.fits(roundPeg));
    }
}
