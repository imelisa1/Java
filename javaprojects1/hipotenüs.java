
import java.util.Scanner;


public class hipotenüs {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner( System.in);
        
        System.out.print("ilk dik kenar uzunluğu: ");
        double ilk = scanner.nextDouble();
        
        System.out.print("ikinci dik kenar: ");
        double iki = scanner.nextDouble();
        
        double hipo = (ilk*ilk)+(iki*iki);
        System.out.print("hipotenüs: "+ Math.sqrt(hipo));
    }
    
}
