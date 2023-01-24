
import java.util.Scanner;


public class ebob {
    public static int ebobul(int sayı1, int sayı2){
        
        int ebob = 1;
        
        for(int i=1; i<=sayı1 && i<=sayı2; i++){
            if(sayı1%i==0 && sayı2%i==0){
                ebob=i;
            }
        }
        return ebob;
    }
    public static void main(String[] args){
        int sayı1, sayı2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("sayı1: ");
        sayı1=scanner.nextInt();
        System.out.print("sayı2: ");
        sayı2=scanner.nextInt();
        
        System.out.print(sayı1 + "ve " + sayı2 + "'nin ebobu: " + ebobul(sayı1,sayı2 )) ;
    }
}
