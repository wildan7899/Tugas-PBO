import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("[=====================================]");
            System.out.println("[    Pemrograman Berorientasi Objek   ]");
            System.out.println("[=====================================]");
            System.out.println("[                                     ]");
            System.out.println("[       PROGRAM INPUT GEOMETRI        ]");
            System.out.println("[                                     ]");
            System.out.println("[=====================================]");
            System.out.println("[ Nama : Wildan Afandika              ]");
            System.out.println("[ NIM  : F1D02510141                  ]");
            System.out.println("[=====================================]");

            System.out.println("\n[1] INPUT BUJUR SANGKAR");
            System.out.print("Masukkan warna Bujur Sangkar : ");
            String warnaBujur = scanner.nextLine();
            System.out.print("Masukkan sisi Bujur Sangkar  : ");
            double sisi = scanner.nextDouble();
            scanner.nextLine();
            BujurSangkar bujurSangkar = new BujurSangkar(sisi, warnaBujur);

            System.out.println("\n[2] INPUT LINGKARAN");
            System.out.print("Masukkan warna Lingkaran     : ");
            String warnaLingkaran = scanner.nextLine();
            System.out.print("Masukkan radius Lingkaran    : ");
            double radius = scanner.nextDouble();
            scanner.nextLine();
            Lingkaran lingkaran = new Lingkaran(radius, warnaLingkaran);

            System.out.println("\n[3] INPUT SILINDER");
            System.out.print("Masukkan warna Silinder      : ");
            String warnaSilinder = scanner.nextLine();
            System.out.print("Masukkan radius Silinder     : ");
            double radiusSilinder = scanner.nextDouble();
            System.out.print("Masukkan tinggi Silinder     : ");
            double tinggi = scanner.nextDouble();
            Silinder silinder = new Silinder(tinggi, radiusSilinder, warnaSilinder);

            System.out.println("\n[=====================================]");
            System.out.println("[          HASIL OUTPUT OBJEK         ]");
            System.out.println("[=====================================]");
            bujurSangkar.printInfo();
            lingkaran.printInfo();
            silinder.printInfo();
            System.out.println("[====================================]\n");
        }
    }
}
