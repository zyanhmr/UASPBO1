public class Majalah {

    private int id;
    private String judul; 
    private String penerbit; 
    private int jumlahHalaman; 
    private double harga; 

    // Constructor
    public Majalah() {
        System.out.println("Object Majalah telah diciptakan, constructor berjalan");  
    }

    // Methods
    public void naikkanHarga() {
        System.out.println("Harga naik ");
    }

    public void tampilkanDetailMajalah() {
        System.out.println("ini detail majalah");
    }

    public void tambahDiskon(double diskon) {
            System.out.println("ini tambahan diskon");
    }

    

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
}
