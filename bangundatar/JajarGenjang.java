public class JajarGenjang extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuas(){
        return alas * tinggi;
    }

    public double hitungKeliling(){
        return 2 * (alas + sisiMiring);
    }

    public void getInfo(){
        System.out.println("Luas: " + luas ());
        System.out.println("Keliling: " + keliling());
    }
}
