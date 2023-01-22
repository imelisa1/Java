
import java.util.Scanner;


public class en_büyük {
    public static void main(String[] arsg){
        
        int enb;
        System.out.print("lütfen bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        
        int sayı1 = scanner.nextInt();
        System.out.print("lütfen bir sayı giriniz: ");
        int sayı2 = scanner.nextInt();
        System.out.print("lütfen bir sayı giriniz: ");
        int sayı3 = scanner.nextInt();
        
        enb=-1; // bir değer atanmazsa hata verir.
        
        if(sayı2>sayı1 && sayı2>sayı3){
            enb=sayı2;
        }
        else if(sayı1>sayı2 && sayı1>sayı3){
            enb=sayı1;
        }
        else if(sayı3>sayı1 && sayı3>sayı2){
            enb=sayı3;
        }
        
        System.out.println("sayı 1: "+ sayı1);
        System.out.println("sayı2: "+ sayı2);
        System.out.println("sayı3: "+ sayı3);
        System.out.println("en büyük sayı: "+ enb);
        
        
    }
    
}
