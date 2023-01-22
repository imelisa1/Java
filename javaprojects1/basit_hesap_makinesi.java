
import java.util.Scanner;


public class basit_hesap_makinesi {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("iki sayı girin: ");
        double sayı1=scanner.nextDouble();
        double sayı2=scanner.nextDouble();
        System.out.print("operatör seçin(+,-,*,/): ");
        char op=scanner.next().charAt(0); //char almak için.
        
        switch(op){
            case '+':
                System.out.println(sayı1+" + "+sayı2+" = "+(sayı1+sayı2));
                break;
            case '-':
                System.out.println(sayı1+" - "+sayı2+" = "+(sayı1-sayı2));
                break;
            case '*':
                System.out.println(sayı1+" * "+sayı2+" = "+(sayı1*sayı2));
                break;
            case '/':
                System.out.println(sayı1+" / "+sayı2+" = "+(sayı1/sayı2));
        }
    }
    
}
