/**
 * Created by OETS on 19.06.2017.
 */
public class BuyukVeKucukHarfCevir {
    public static void main(String[] args) {
        String ilkCumleYeni,ikinciCumleYeni; //Çevirilmiş hallerini, eski halleriyle göstermek için yeni string değerleri oluşturdum.
        String ilkCumle = "küçük harfleri büyük harfe çevirmek"; //İlk cümlemiz
        String ikinciCumle = "BÜYÜK HARFLERİ KÜÇÜK HARFE ÇEVİRMEK"; //İkinci cümlemiz

        ilkCumleYeni = ilkCumle.toUpperCase(); //İlk cümleyi büyük harflere çevirip en başta oluşturduğum yeni string değerine atıyorum.
        ikinciCumleYeni = ikinciCumle.toLowerCase(); //İkinci cümleyi küçük harflere çevirip en başta oluşturduğum yeni string değere atıyorum.

        //Ekrana yazılan kısımda şöyle gözükecektir. ilk hali -> son hali
        System.out.println(ilkCumle + " -> " + ilkCumleYeni); 
        System.out.println(ikinciCumle + " -> " + ikinciCumleYeni);

    }
}
