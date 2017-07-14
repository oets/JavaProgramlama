/**
 * Created by OETS on 14.07.2017.
 */
 
import java.util.*;
public class BinarySearch 
{
  public static void main(String args[])
  {
    int arr[], ilkSayi, sonSayi, ortadakiSayi, girilenDeger, arananSayi;
 
    Scanner girdi = new Scanner(System.in);
    System.out.println("Kaç adet sayı gireceksiniz ?");
    girilenDeger = girdi.nextInt(); 
    
    arr = new int[girilenDeger]; //girdiğiniz sayı büyüklüğünde array oluşturmaktadır.
 
    System.out.println("Lütfen " + girilenDeger + " tane sayı yazınız.");
  
    for (int i = 0; i < girilenDeger; i++)
      arr[i] = girdi.nextInt(); //index numaralarına göre sırayla girilen sayıları arrayin içerisine işlemektedir.
 
    System.out.println("Hangi sayıyı bulmak istiyorsunuz ?");
    arananSayi = girdi.nextInt(); //aradığınız sayıyı arananSayi değişkenine atamaktadır.
 
    ilkSayi  = 0; 
    sonSayi   = girilenDeger - 1; 
    ortadakiSayi = (ilkSayi + sonSayi)/2;
 
    while( ilkSayi <= sonSayi ) //aranan sayının yerini bulmak için yapılan işlemlerdir.
    {
      if ( arr[ortadakiSayi] < arananSayi )
        ilkSayi = ortadakiSayi + 1;
      else if ( arr[ortadakiSayi] == arananSayi ) 
      {
        System.out.println(arananSayi + ". sayı " + (ortadakiSayi + 1) + ". sıradadır.");
        break;
      }
      else
        sonSayi = ortadakiSayi - 1;
      	ortadakiSayi = (ilkSayi + sonSayi)/2;
   }
   if ( ilkSayi > sonSayi )
      System.out.println(arananSayi + " değeri listede bulunmamaktadır.\n");
  }
}
