import java.util.Scanner;
public class Main
{


    public static void main(String[] args)
    {
        int ilanTipi;
        Scanner input = new Scanner(System.in);
        System.out.print("İlan Türünü seçiniz (emlak için 2 vasıta için 1)");
        ilanTipi = input.nextInt();
        if (ilanTipi == 1){
            Vasita.vasita();
        } else if (ilanTipi == 2) {
            Emlak.emlak();

        }

    }

}
