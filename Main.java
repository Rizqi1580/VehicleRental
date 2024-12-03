public class Main {
    public static void main(String[] args) {
        Rental rentalSystem = new Rental();
 
        Kendaraan mobil1 = new Mobil("Mitsubishi", "Xpander", 2024, 4);
        Kendaraan motor1 = new Motor("Honda", "Beat", 2022, 2);
        Kendaraan sepeda1 = new Sepeda("United", "Detrot", 2020, "Gunung");
 
        rentalSystem.tambahKendaraan(mobil1);
        rentalSystem.tambahKendaraan(motor1);
        rentalSystem.tambahKendaraan(sepeda1);
 
        rentalSystem.tampilkanKendaraan();
 
        rentalSystem.tambahPenyewa("Rizqi", mobil1);
        rentalSystem.tambahPenyewa("Rasyid", motor1);
 
        rentalSystem.tampilkanPenyewa();
    }
}