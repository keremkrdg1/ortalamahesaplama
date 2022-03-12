import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int mat,fiz,kim,türk,tar,müzik;

        System.out.println("Matematik Notunuzu Giriniz");
        mat = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz");
        fiz = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz");
        kim = input.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz");
        türk = input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz");
        tar = input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz");
        müzik = input.nextInt();

        double toplam,ortalama;
        toplam  = mat+fiz+kim+türk+tar+müzik;
        ortalama = toplam / 6;

        System.out.println(ortalama>=60 ? "Sınıfı Geçtiniz Ortalamanız ="+ortalama:"Sınıfta Kaldınız Ortalamanız = "+ortalama);
        }
}
