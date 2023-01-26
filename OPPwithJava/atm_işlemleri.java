
import java.util.Scanner;

// atm çalıştırma
public class atm_işlemleri {
    public void çalış(hesap Hesap){
        login Login = new login();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hoşgeldiniz....");
        System.out.println("Kullanıcı Girişi");
        
        int giriş_hakkı=3;
        
        while(true){
            if (Login.login(Hesap)){
                System.out.print("Başarıyla giriş yaptınız...");
                break;
            }
            else{
                System.out.print("hatalı bilgi girdiniz...");
                giriş_hakkı-=1;
                System.out.print("kalan giriş hakkınız: " + giriş_hakkı);
                
            }
            if(giriş_hakkı==0){
                System.out.print("giriş hakkınız bitti...");
                return;
            }
        }
        System.out.print("İŞLEMLER:\n"
                + "1-Bakiye Görüntüleme\n"
                + "2-Para Yatırma\n"
                + "3-Para Çekme\n"
                + "Çıkış için: q");
        while(true){
            System.out.print("işlem seçiniz: ");
            String işlem = scanner.nextLine();
            if(işlem.equals('q')){
                break;
            }
            else if(işlem.equals('1')){
                System.out.print("Bakiyeniz: "+ Hesap.getBakiye());
            }
            else if(işlem.equals('2')){
                System.out.print("Tutar: ");
                double tutar = scanner.nextDouble();
                scanner.nextLine(); // hata önlemek için
                Hesap.para_yatır(tutar);
            }
            else if(işlem.equals('3')){
                System.out.print("Tutar: ");
                double tutar = scanner.nextDouble();
                scanner.nextLine(); // hata önlemek için
                Hesap.para_çek(tutar);
            }
            else{
                System.out.print("hatalı giriş...");
            }
        }
    }
}
