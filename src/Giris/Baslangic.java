import java.util.Scanner ;
public class Baslangic {
    public static void main(String[] args) {
// Değişkenleri oluştur.
        int mat,fizik,kimya,turkce,muzik;
// Scanner sınımızı tanımladık
        Scanner inp = new Scanner(System.in) ;
//  Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz : ");
    mat = inp.nextInt();
System.out.println(mat);
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt() ;
        System.out.println(fizik);
System.out.println("Kimya Notunuzu Giriniz : ");
    kimya=inp.nextInt() ;
            System.out.println(kimya);
    System.out.println("Turkce Notunuzu Giriniz");
    turkce=inp.nextInt();
    System.out.println(turkce);
    System.out.println("Muzik Notunuzu Giriniz :");
    muzik=inp.nextInt();
    System.out.println(muzik);
    int toplam = (mat+fizik+kimya+turkce+muzik);
    double sonuc = toplam / 5.0 ;
    System.out.println(sonuc);
        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);
    }
}
