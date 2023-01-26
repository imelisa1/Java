
public class hesap_login_atm_uygulama {
     public static void main(String[] args){
        
         atm_işlemleri ATM = new atm_işlemleri();
         
         hesap Hesap = new hesap("48209817263","sananelan123",5000);
         ATM.çalış(Hesap);
         System.out.print("çıkış yapılıyor..");
         
    }
    
}
