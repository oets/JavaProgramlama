/**
 * Created by tariksune on 7.11.2017.
 */
import java.io.*;
import java.util.Scanner;
public class BisecMet {

    public static void main(String argv[]) {
        double epsilon = 0.00001, midPoint = 0; 
        int iteration = 0; // Kaç adet iterasyon yaptığımızı belirlememiz için
        Scanner input = new Scanner(System.in); 
        System.out.printf("Enter interval for left: "); //Aralığımızın x değeri
        double left = input.nextDouble();
        System.out.printf("Enter interval for right: "); //Aralığımızın y değeri
        double right = input.nextDouble();
        System.out.println("Left Interval: " + f(left)); //Alt kısımda yer alan fonksiyon işlemimize göre aralıklar otomatik olarak değer alacaktır.
        System.out.println("Right Interval: " + f(right)); //Alt kısımda yer alan fonksiyon işlemimize göre aralıklar otomatik olarak değer alacaktır.

        if (f(left) * f(right) > 0) { //Bisection Metodunda - ve + değerler olmalı ki kök bulunsun eğer bu değerlerin çarpımı 0'dan büyükse kök yoktur.
            System.out.println("Same Sign Error!");
            return;
        }
                while (Math.abs(right - left) > epsilon) { //Math.abs ile mutlak değere alıyoruz.
                    midPoint = (left + right) / 2; //Orta noktayı buluyoruz.

                    if ((f(left) * f(midPoint)) < 0) { //Dediğim gibi kök olması için - ve + değerlerine sahip iki fonksiyon sonucu olmalıdır.
                        right = midPoint; 
                    }
                    else {
                        left = midPoint;
                    }
                    iteration++; //İterasyon devam ettikçe artacaktır.
                    System.out.println(iteration + ". interval:  " + left + " ... " + right); //Yazdırma kısmımız.
                }
        System.out.println("Obtained Root: " + midPoint); //Elde edilen kök değerini yazdırıyoruz.
    }
    public static double f(double x) {
        return (Math.exp(x) - Math.cos(x) - 0.5); //Buradaki işlem (e üzeri x)-(cos x)-0.5 'değeridir.Yani f(x)=exp(x)-cos(x)-0.5
    }
}
