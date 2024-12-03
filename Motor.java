public class Motor extends Kendaraan {
    private int jumlahRoda;
 
    public Motor(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }
 
    @Override
    public String displayInfo() {
        return super.displayInfo() + " - Motor, Jumlah Roda: " + jumlahRoda;
    }
}