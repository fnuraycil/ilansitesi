import java.util.Scanner;

class Vasita {
    public static void vasita()
    {

        String baslik;
        String aciklama;
        String vitesTipi;
        String renk;
        String kazalimi;
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
        System.out.print("Vites bilgisi  giriniz :");
        vitesTipi = input.nextLine();
        System.out.print("Renk giriniz :");
        renk = input.nextLine();
        System.out.print("Hasar bilgisi giriniz :");
        kazalimi = input.nextLine();
        System.out.print("Sahibinden mi?  (True/False) :");
        sahibinden = input.nextBoolean();


        System.out.printf("İlan başlığı: " + baslik + "\n" +
                "İlan açıklaması: " +aciklama + "\n" +
                "Renk: " + renk + "\n" +
                "Vites tipi: " + vitesTipi + "\n"+
                "Kazalı mı?: " + kazalimi + "\n" +
                "İl: " +sehir +"\n" +
                "İlçe: " + ilce + "\n"+
                "Sahibinden mi?: "+sahibinden + "\n");

    }
}