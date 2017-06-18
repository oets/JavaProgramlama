/**
 * Created by OETS on 19.06.2017.
 */
import java.util.*; //Scanner için gereklidir.
public class MaksimumVeMinimum {
    public static void main(String[] args) {
        Scanner giris = new Scanner (System.in); //Girilen değeri okuma kodudur.
        int maksimum,minimum,toplamDeger; //Program içerisinde kullanılabilecek değerler.
        int [ ] sayi = new int[99]; //Kullanıcıdan girilebilecek maksimum sayı adetini 100 olarak belirledim. İsterseniz değiştirebilirsiniz.

        System.out.println("Toplam girilecek sayı adeti: ");
        toplamDeger = giris.nextInt();

        for (int i=0; i < toplamDeger; i++){ //Kullanıcıdan alınan adet değerini, for döngüsü ile dönderiyoruz. Örneğin 5 yazaarsa kullanıcı 0,1,2,3,4 adet değer belirleyerek sırayla alınan değerleri sayi[i] dizisine atayacaktır.
            System.out.printf("%d.Sayi = ",i+1); //i sayısını 0'dan başlattığımız için i+1 yaparak ekrana 0.Sayı yerine 1.Sayi yazdırıyoruz.
            sayi[i] = giris.nextInt(); //Toplam değer kadar girilen tüm sayıları dizilerin içinde saklıyoruz.
        }
        maksimum = minimum = sayi[0]; // Maksimum ve minimum sayılarımızı dizimizin ilk değerine atıyoruz.

        for ( int i=0; i < toplamDeger; i++){ //Toplam değerimiz kadar döndürüyoruz.
            if (sayi[i] < minimum) //0. indexteki değer minimumdan küçükse onu minimum yapar. Bu işlem toplam değer kadar dönecektir.
                minimum = sayi[i]; 
            if (sayi[i] > maksimum) //0. indexteki değer maksimumdan büyükse onu maksimum yapar. Bu işlem toplam değer kadar dönecektir.
                maksimum = sayi[i];
        }

        System.out.printf("Maksimum Değer = %d\n",maksimum); //Elde edilen maksimum değeri yazacaktır.
        System.out.printf("Minimum Değer = %d\n",minimum); //Elde edilen minimum değeri yazacaktır.
    }
}
