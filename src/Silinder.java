public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println(" [+] Silinder");
        System.out.println("     - Warna  : " + getWarna());
        System.out.println("     - Radius : " + getRadius());
        System.out.println("     - Tinggi : " + tinggi);
        System.out.println("     - Luas   : " + hitungLuas());
        System.out.println("     - Volume : " + hitungVolume());
        System.out.println();
    }
}
