import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // değişkenleri oluşturalım
        int n1, n2, select;
        double sonuc;

       //Kullanıcıdan veri isteyelim
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        System.out.print("Yapmak istediğiniz işlemi seçin: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                sonuc = n1 + n2;
                System.out.print(sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.print(sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.print(sonuc);
                break;
            case 4:
                sonuc = (n1 / n2) ;
                System.out.print(sonuc);
                break;
            default:
                System.out.print("Yanlış işlem seçtiniz. Seçimizi değiştirin.") ;
        }

    }
}