import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kayak = "Hava soguk.\n1) Kayak yapabilirsin.\n2) Evde film izleyebilirsin.";
        String sinema = "Hava serin.\n1) Sinemaya gidebilirsin.\n2) Bir kafede vakit gecirebilirsin.";
        String piknik = "Hava guzel.\n1) Piknik yapabilirsin.\n2) Yuruyuse cikabilirsin.";
        String yuzme = "Hava sicak.\n1) Yuzmeye gidebilirsin.\n2) Dondurma yemeye gidebilirsin.";
        double sicaklik = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sicakliga gore tavsiye uygulamasina hos geldiniz.");
        System.out.print("Hava kac derece: ");
        sicaklik = inp.nextDouble();

        if (sicaklik < 5) {
            System.out.println(kayak);
        } else if (sicaklik < 15) {
            System.out.println(sinema);
        } else if (sicaklik <= 25) {
            System.out.println(piknik);
        } else {
            System.out.println(yuzme);
        }
    }
}