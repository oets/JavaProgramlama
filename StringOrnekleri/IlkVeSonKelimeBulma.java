/**
 * Created by OETS on 19.06.2017.
 */
public class IlkVeSonKelimeBulma {
    public static void main(String[] args) {

        String cumle = "Bu cümle içerisinde ilk ve son kelimeyi bulacağız";
        //Öncelikle bu cümledeki ilk ve son kelimeyi bulabilmemiz için boşluklardan yararlanmalıyız.
        //Boşluk indeximizi bir integer değere atarsak, kelimeleri kolaylıkla ayırabilir ve istediğimizi alabiliriz.
        int Bosluk1 = cumle.indexOf(" ");
        int Bosluk2 = cumle.lastIndexOf(" ");

        String ilkKelime = cumle.substring(0,Bosluk1); //İlk kelimeyi cümlenin başlangıcından(0) ilk boşluk yerine(Bosluk1) kadar aralıyorum.
        String sonKelime = cumle.substring(Bosluk2); //Son kelime için sadece son bosluğu(Bosluk2) taban almam yeterli oluyor.

        System.out.printf("İlk kelime: %s\n",ilkKelime); //Ekrana Bu yazdıracaktır.
        System.out.printf("Son kelime: %s\n",sonKelime); //Ekrana bulacağız yazdıracaktır.

    }
}
