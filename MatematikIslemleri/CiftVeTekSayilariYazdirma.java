/**
 * Created by OETS on 19.06.2017.
 */
import java.util.*; //Scanner için gereklidir.
public class CiftVeTekSayilariYazdirma {
    public static void main(String[] args) {
        int giris,giris1,giris2;
        Scanner deger = new Scanner (System.in); //Girilen değerlerin okunması için gereklidir.
        do { //do-while döngüsü while kısmında açıklama mevcuttur.
            System.out.println("1.Tek Sayı Döngüleri");
            System.out.println("2.Çift Sayı Döngüleri");
            System.out.println("Lütfen seçim yapınız: ");
            giris = deger.nextInt(); //Kullanıcı seçim yapıyor.

                if (giris == 1) { //Eğer 1. seçeneği seçerse ekrana aşağıdakiler yazacaktır ve tekrar seçim yapacaktır.
                    System.out.println("1. 0'dan 100'e kadar tek sayıları yazdır");
                    System.out.println("2. 100'den 0'a kadar tek sayıları yazdır");
                    System.out.println("Lütfen seçim yapınız: ");
                    giris1 = deger.nextInt(); //Kullanıcı seçim yapıyor.

                    switch (giris1) { //switch-case ile seçeneklerimizdeki işlemleri rahatça yapabiliriz.
                        case 1:
                            for (int i = 0; i < 100; i++) { //Altta i+1 ile 1 den başlatarak hem for döngüsünde sayıyı 1 arttırıyorum hem de printten sonra 1 arttırıyorum.
                                System.out.println(i + 1); //System.out.printf((i+1)+" "); yaparsanız yan yana yazdırmış olursunuz.
                                i++;
                            }
                            break;
                        case 2:
                            for (int i = 100; i > 0; i--) { //Altta i-1 ile 100 den başlatarak hem for döngüsünde sayıyı 1 azaltıyorum hem de printten sonra 1 azaltıyorum.
                                System.out.println(i - 1); //System.out.printf((i-1)+" "); yaparsanız yan yana yazdırmış olursunuz.
                                i--;
                            }
                            break;
                        default:
                            System.out.println("Yanlış Giriş Yaptınız!\n"); //Seçeneklerden farklı bir seçenek girildiğinde alınan hata mesajıdır.
                            break;
                    }
                }
                else if (giris == 2) { //Eğer 2. seçeneği seçerse ekrana aşağıdakiler yazacaktır ve tekrar seçim yapacaktır.
                    System.out.println("1. 0'dan 100'e kadar çift sayıları yazdır");
                    System.out.println("2. 100'den 0'a kadar çift sayıları yazdır");
                    System.out.println("Lütfen seçim yapınız: ");
                    giris2 = deger.nextInt();//Kullanıcı seçim yapıyor.

                    switch (giris2) { //switch-case ile seçeneklerimizdeki işlemleri rahatça yapabiliriz.
                        case 1:
                            for (int i = 0; i <= 100; i++) { //For döngüsünde sayıyı 1 arttırıyorum ayrıca printten sonra da 1 arttırıyorum.
                                System.out.println(i); //System.out.printf(i+" "); yaparsanız yan yana yazdırmış olursunuz.
                                i++;
                            }
                            break;
                        case 2:
                            for (int i = 100; i >= 0; i--) { //For döngüsünde sayıyı 1 azaltıyorum ayrıca printten sonra da 1 azaltıyorum.
                                System.out.println(i); //System.out.printf(i+" "); yaparsanız yan yana yazdırmış olursunuz.
                                i--;
                            }
                            break;
                        default:
                            System.out.println("Yanlış Giriş Yaptınız!\n"); //Seçeneklerden farklı bir seçenek girildiğinde alınan hata mesajıdır.
                            break;
                    }
                }
                else
                    System.out.println("Lütfen geçerli bir seçenek giriniz!\n"); //Seçeneklerden farklı bir seçenek girildiğinde alınan hata mesajıdır.

            }while(giris != 1 || giris != 2); // 1 ve 2 seçenekleri dışında bir seçenek girdiğinizde sistem else bölümündeki hata mesajını verir ve tekrar seçim yapmanızı ister. Bu döngü sınırsızdır.
        }
    } //If-else,Switch-case,for ve do-while döngülerini kullanarak karma bir kod yığını oluşturdum. Bu sistemi normalde çok basit bir şekilde sadece bir döngüyle yazabileceğinizi unutmayın.
