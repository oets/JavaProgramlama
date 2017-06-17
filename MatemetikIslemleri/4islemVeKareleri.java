/**
 * Created by OETS on 17.06.2017.
 */
import java.util.*; //Bizim için gerekli olan util bölümüne bağlı tüm paketleri içermektedir.(*) Yerine Scanner kullandığımız için sadece Scanner da yazabilirsiniz.
public class 4islemVeKareleri {
    public static void main(String[] args) {
        int sayi1,sayi2,toplama,bolme,carpma,cikarma,sayi1karesi,sayi2karesi; //İsterseniz bu değişkenleri başlarına int koyarak alt alta da yazabilirsiniz.
        Scanner giris = new Scanner(System.in); //Kullanıcıdan sayı girmesini sağlayan okuma kodumuz.
        System.out.println("1. Sayıyı Giriniz: ");
        sayi1 = giris.nextInt(); //Kullanıcının girdiği sayıyı sayi1 değişkenine atamaktadır.
        System.out.println("2. Sayıyı Giriniz: ");
        sayi2 = giris.nextInt(); //Kullanıcının girdiği sayıyı sayi2 değişkenine atamaktadır.

        //Girilen sayıları printf ile yazdıralım.
        System.out.printf("1. Sayı: %d\n", sayi1); //printf kullanıdığımız için imleç aynı satırda kalacaktır. \n ile bir alt satıra geçiyoruz.
        System.out.printf("2. Sayı: %d\n", sayi2);

        toplama = sayi1 + sayi2; //Toplama İşlemi
        cikarma = sayi1 - sayi2; //Çıkarma İşlemi (Tam tersini de yapabilirsiniz.)
        bolme   = sayi1 / sayi2; //Bölme İşlemi (Tam tersini de yapabilirsiniz.Değişkenimiz integer olduğu için sayıyı yuvarlayacaktır.)
        carpma  = sayi1 * sayi2; //Çarpma İşlemi
        sayi1karesi = sayi1 * sayi1; //Sayı1 Karesi
        sayi2karesi = sayi2 * sayi2; //Sayı2 Karesi

        //İşlemlerin yazdırılması

        System.out.printf("Toplama: %d\n",toplama);
        System.out.printf("Çıkarma: %d\n",cikarma);
        System.out.printf("Bölme: %d\n", bolme);
        System.out.printf("Çarpma: %d\n",carpma);
        System.out.printf("Sayı1 Karesi: %d\n", sayi1karesi);
        System.out.printf("Sayı2 Karesi: %d\n", sayi2karesi);

    }
}
