package Chapter3;

/**
 * @author 马晓晓cloudlet
 */
public class Cylinder extends Circle {
    double height ;

    public Cylinder ( double h) {
        super();
        this.height = h;
    }

    public double getRadius() {
        return this.radius;
    }

    public static void main (String[] args) {
        Circle p1 = new Circle(3);
        Cylinder p2 = new Cylinder(3);
        System.out.println(p2.getRadius());
    }
}
