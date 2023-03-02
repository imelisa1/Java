
import java.util.Scanner;


public class Yolcu implements YurtDışıKuralları {
    private int harc;
    private boolean siyasi_yasak;
    private boolean vize;
    
    
    public Yolcu(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız harç miktarı: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir çıkış yasağınız var mı(evet/hayır): ");
        String cevap = scanner.nextLine();
        
        if(cevap.equals("evet")){
            this.siyasi_yasak = true;
        }
        else{
            this.siyasi_yasak = false;
        }
        
        System.out.print("Uygun vizeniz var mı(evet/hayır): ");
        String cevap2 = scanner.nextLine();
        
        if(cevap2.equals("evet")){
            this.vize = true;
        }
        else{
            this.vize = false;
        }
        
    }

    @Override
    public boolean yurtdisiHarcıKontrol() {
        if(this.harc<15){
            System.out.println("Lüthen çıkış harcını tam yatırın... ");
            return false;
        }
        else{
            System.out.println("Harc işlemi tamamlandı... ");
            return true;
        }
    }

    @Override
    public boolean yasakKontrol() {
        if(this.siyasi_yasak == true){
            System.out.println("Siyasi yasağınızdan dolayı yurtdışına çıkamazsınız... ");
            return false;
        }
        else{
            System.out.println("Yasağınız bulunmuyor.... ");
            return true;
        }
    }

    @Override
    public boolean vizeKontrol() {
        if(this.vize == true){
            System.out.println("Vize işlemleriniz tamamlandı...");
            return true;
        }
        else{
            System.out.println("Vizeniz olmadan çıkış yapamazsınız... ");
            return false;
        }
    }
    
    
    
}
