package latihan10.abstractclass.teori10;
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Mobil mobil = new Mobil();
        System.out.println("=====CLASS MOTOR=====");
        motor.jumlahRoda();
        motor.jenisBahanBakar();
        System.out.println("=====CLASS MOBIL=====");
        mobil.jumlahRoda();
        mobil.jenisBahanBakar();
    }
}