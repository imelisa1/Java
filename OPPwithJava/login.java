
import java.util.Scanner;

// hesap giriş 
public class login {
    public boolean login(hesap Hesap){
        Scanner scanner = new Scanner(System.in);
        
        String numara;
        String parola;
        
        System.out.print("Hesap No: ");
        numara = scanner.nextLine();
        System.out.print("Şifre: ");
        parola = scanner.nextLine();
        
        if (numara.equals(Hesap.getHesapNo()) && parola.equals(Hesap.getŞifre())){
            
            return true;
        }
        else{
            
            return false;
        }
        
    }
}
