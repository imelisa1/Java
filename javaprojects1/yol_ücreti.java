
import java.util.Scanner;

// bir aracın km başına ne kadar yaktığını ve kaç km yol yaptığı 
// bilgilerini alarak toplam ücreti hesaplayın.
public class yol_ücreti {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Araciniz km basina kac kr yakiyor(örn.0,32): ");
        double kurus = scanner.nextDouble();
        
        System.out.print("kac km yol gidiyorsun(12,5): ");
        double yol = scanner.nextDouble();
        
        double hesap = kurus*yol;
        
        System.out.print("ödemeniz gereken ücret: "+ hesap + "TL.");
        
    }
    
}
