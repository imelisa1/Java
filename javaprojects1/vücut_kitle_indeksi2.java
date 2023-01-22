 /*Vücut kitle indeksi, vücut ağırlığının boy uzunluğunun karesine bölünmesiyle (kg/m²) hesaplanır.
18, 5 kg/m² ‘nin altındaki sonuçlar: İdeal kilonun altında
18, 5 kg/m² ile 24, 9 kg/m² arasındaki sonuçlar: İdeal kiloda
25 kg/m² ile 29, 9 kg/m² arasındaki sonuçlar: İdeal kilonun üstünde
30 kg/m² ile 39, 9 kg/m² arasındaki sonuçlar: İdeal kilonun çok üstünde (obez)
40 kg/m² üzerindeki sonuçlar: İdeal kilonun çok üstünde (morbid obez)*/
import java.util.Scanner;
     
public class vücut_kitle_indeksi2 {
    public static void main(String[] args){
    
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("kilonuz: ");
     double kilo = scanner.nextDouble();
     System.out.print("boyunuz(örn.1,72): ");
     double boy = scanner.nextDouble();
     
     double index= (kilo/(boy*boy));
     System.out.print("vücut kitle indeksiniz: "+ index);
     
     
     if(index<=18.5){
        System.out.println(" ideal kilonun altında...");
    }
     else if(index>18.5 && index<=24.9){
         System.out.println(" ideal kiloda...");
     }
     else if(index>24.9 && index<=29.9){
         System.out.println(" ideal kilonun üstünde...");
     }
     else if(index>29.9 && index<=39.9){
         System.out.println(" ideal kilonun çok üstünde(obez)...");
     }
     else{
         System.out.println(" ideal kilonun çok üstünde(morbit obez)...");
     }
    }
    
}
