public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = 3.14159;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println(" [+] Lingkaran");
        System.out.println("     - Warna  : " + getWarna());
        System.out.println("     - Radius : " + radius);
        System.out.println("     - Luas   : " + hitungLuas());
        System.out.println();
    }
}
