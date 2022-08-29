import java.util.Scanner;

class Emlak {
    public static void emlak()
    {

        String baslik;
        String aciklama;
        String odaSayisi;
        int alan;
        int kat;
        int banyoSayisi;
        boolean site;
        String sehir;
        String ilce;
        boolean sahibinden;

        Scanner input = new Scanner(System.in);

        System.out.print("İlan başlığını giriniz :");
        baslik = input.nextLine();
        System.out.print("İlan açıklaması giriniz :");
        aciklama = input.nextLine();
        System.out.print("Şehir giriniz :");
        sehir = input.nextLine();
        System.out.print("İlçe giriniz :");
        ilce = input.nextLine();
        System.out.print("Oda sayısı giriniz :");
        odaSayisi = input.nextLine();
        System.out.print("Alan bilgisi (m2) giriniz :");
        alan = input.nextInt();
        System.out.print("Kat bilgisi giriniz :");
        kat = input.nextInt();
        System.out.print("Banyo sayısı giriniz :");
        banyoSayisi = input.nextInt();
        System.out.print("Site içerisinde mi? (True/False) :");
        site = input.nextBoolean();
        System.out.print("Sahibinden mi?  (True/False) :");
        sahibinden = input.nextBoolean();


        System.out.printf("İlan başlığı: " + baslik + "\n" +
                "İlan açıklaması: " + aciklama + "\n" +
                "Oda sayısı: " + odaSayisi + "\n" +
                "Alan (m2): " + alan + "\n"+
                "Kat: " + kat + "\n" +
                "Banyo sayısı: " + banyoSayisi + "\n" +
                "Site içerisinde mi?: " + site + "\n" +
                "İl: " +sehir +"\n" +
                "İlçe: " + ilce + "\n"+
                "Sahibinden mi?: "+ sahibinden + "\n");

    }
}