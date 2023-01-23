import java.util.Scanner;
/*
 Faiz oranı: %6/yıl.
 */
public class faiz_hesabı {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Anapara miktarını giriniz: ");
        double anapara = scanner.nextDouble();
        System.out.print("kaç yıl faizde kalacak?: ");
        int yıl = scanner.nextInt();
        
        double faiz_oranı = 0.06;
        double toplampara = anapara;
        
        for( int i=1;i<=yıl;i++){
            toplampara = (toplampara*faiz_oranı)+toplampara;
        }
        
        System.out.print(yıl + "yıl sonra yeni paranız: "+ toplampara);
    }
    
}
