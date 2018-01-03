/**
 * Created by tariksune on 3.01.2018.
 */
 
import java.io.*;
import java.util.*;
public class EulerMethod {
    public static void main(String arg[]) {
        double h = 0.1; //Δx değerimiz. Bazı sorularda ((b-a)/(N-1)) formülü ile bulunmaktadır. b ve a aralık değerleridir.
        double x = 0; //y'nin içinde yer alan değer yani y(x) değerindeki x 'i temsil etmektedir.
        double y = 1; // y değerimiz problemde verilmiştir.
        int step = 0; // aralığın ilk değeri ilk adımımız olmaktadır.
        while (x <= 4) {
            step++;
            x = x + h; //x değerimiz verilen h değerine istinaden artacaktır.
            y= y+( h * f(y) ); //Euler metodunda y=y+h*f(y) fonksiyonunu kullanmamız gerekmektedir. Formülü bu şekildedir.
            System.out.println(step + ".Step--> x="+x+"  |   y="+y); //yazdırma kısmıdır.
        }
    }
    public static double f(double y) {
        return( (2*y) + Math.pow(y,3) ); //2.y+y^3 işlemini yapıp double olarak döndürmektedir.
    }
}
// problem: y'=2y+y^3,y(0)=1,for x in [0,4], h=0.1 
