package math;

public class Math extends BaseMath {
    public Math() {

    }
    public Vector add(Vector a, Vector b) {
        return new Vector (a.getX() + b.getX(), a.getY() + b.getY());
    }
    public Vector subtract(Vector a, Vector b) {
        return new Vector(a.getX() - b.getX(), a.getY() - b.getY() );
    }
    public Vector multiply (Integer r, Vector a) {
        return new Vector(r * a.getX(), r * a.getY());
    }

    public Vector over (Integer r, Vector a) {
        return new Vector(a.getX() / r, a.getY() / r);
    }
    public void print (Vector result) {
        System.out.println("Result (x = " + result.getX() +  ", y = " + result.getY() + ")");
    }
}
