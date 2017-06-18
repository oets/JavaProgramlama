/**
 * Created by OETS on 18.06.2017.
 */
import java.util.*; //Scanner için gereklidir.
public class SayiTekmiCiftmi {
    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in); //Kullanıcıdan sayı girmesini sağlayan okuma kodumuz.
        System.out.println("Sayıyı Giriniz: ");
        sayi = giris.nextInt();//Kullanıcının girdiği sayıyı sayi değişkenine atamaktadır.

        if ( sayi%2 == 0 ){ //Sayının modunu alarak 2 ile bölümünden kalanını elde ederiz. Böylece sayının kalanı eğer 0 ise çift, 1 ise tek olacaktır.
            System.out.println("Girilen sayı çifttir.");
        }
        else
            System.out.println("Girilen sayı tektir.");
    }
}
