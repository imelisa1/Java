import java.util.Scanner;

public class test {
    public static void main(String[] args){
        System.out.println("Beyblade dünyasına hoşgeldiniz...");
        System.out.println("Çıkmak için 'q'ya basın.");
        
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi Beyblade i üretmek istersiniz(Dranza,Drayga,Draciel,Dragon): ");
            String üret = scanner.nextLine();
            if(üret.equals('q')){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            else {
                Beyblade_fabrikası fabrika = new Beyblade_fabrikası(); // polymorphism
                Beyblade beyblade = fabrika.beybladeUret(üret); // ne girilmişse beyblade ona göre hareket eder.
                
                if(beyblade == null){
                    System.out.println("Yanlış tür girdiniz...");
                }
                else{
                    beyblade.bilgiler();
                    beyblade.saldır();
                    beyblade.kutsalCanavarıortayaçıkar(); // ne girilmişse onun methodları uygulanır.
                }
                
                
            }
        }
    }
    
}
