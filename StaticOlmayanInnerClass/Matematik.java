
import java.util.Scanner;

//Çoklu kalıtım yapmamızı da sağlarlar.
public class Matematik {
    
    private double Pı = Math.PI;
    
    public class Factorial{  // inner class 1
        
        public void faktoriyel(){
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Lütfen sayı giriniz: ");
            int sayı = scanner.nextInt();
            int fact=1;
            
            for(int i=2;i<=sayı;i++){
                 
                fact*=i;
                
            }
            
            System.out.print("Faktöriyel sonucu: "+ fact);
        }
    }
    
    public class Asal{  //inner class 2
        
        public boolean asal_mi(int sayı){
            
            int i=2;
            
            while(i<sayı){
                
                if(sayı%i==0){
                    return false;
                }
            }
            return true;
        } 
    }
    
    public class Alan{ // inner class 3
        
        public void daire_alan(int yarıçap){  // Ana class olan Matematiğin private özelliklerine de erişebilir.
            //Bütün özelliklerine erişebilir.
            System.out.print("Dairenin alanı: "+ yarıçap*yarıçap*Pı); 
        }
    }
    
    public static void main(String[] args){
        
        Matematik.Factorial facto = new Matematik().new Factorial(); // Factorial classından bir obje.
        Matematik.Asal sayı = new Matematik().new Asal(); // Asal classından bir obje.
        Matematik.Alan şekil = new Matematik().new Alan(); // Alan classından bir obje.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();
        
        if(sayı.asal_mi(num)){ // asal mı metodunu kullanmak
            System.out.println("Asal sayı.");
        }
        else{
            System.out.println("Asal sayı değil.");

        }
        
        facto.faktoriyel(); // faktöriyel metodu
        şekil.daire_alan(num); // alan metodu
    }
}



