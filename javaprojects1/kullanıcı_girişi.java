
import java.util.Scanner;


public class kullanıcı_girişi {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);
        int giris_hakkı =3;
        String username = "iremelisa02";
        String password = "Sananelan123";
        
        
        while (true){
            
            System.out.print("Kullanıcı Adı: ");
            String kullanıcı_adı = scanner.nextLine();
            System.out.print("Şifre: ");
            String şifre = scanner.nextLine();
            
            if(kullanıcı_adı.equals(username) && şifre.equals(password)){
                System.out.println("Hoşgeldiniz...");
                break;
            }
            else if(kullanıcı_adı.equals(username) && !şifre.equals(password)){ // eşit değil!
                System.out.println("hatalı şifre...");  
                giris_hakkı-=1;
                System.out.println("kalan giriş hakkınız: "+ giris_hakkı);
            }
            else if(!kullanıcı_adı.equals(username) && şifre.equals(password)){
                System.out.println("Hatalı kullanıcı adı...");
                giris_hakkı-=1;
                System.out.println("kalan giriş hakkınız: "+ giris_hakkı);
            }
            else if(!kullanıcı_adı.equals(username) && !şifre.equals(password)){
                System.out.println("Hatalı kullanıcı adı ve şifre...");
                giris_hakkı-=1;
                System.out.println("kalan giriş hakkınız: "+ giris_hakkı);
            }
            
            if(giris_hakkı==0){
                System.out.println("Giriş hakkınız tükendi...");
                break;
            }
            
        
        
        
    }
    
}
}
