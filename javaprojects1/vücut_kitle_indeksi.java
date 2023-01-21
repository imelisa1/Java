
import java.util.Scanner; // ctrl+ shift+ı

//Vücut kitle indeksi, vücut ağırlığının boy uzunluğunun karesine bölünmesiyle (kg/m²) hesaplanır.
public class vücut_kitle_indeksi {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("please enter your weight: ");
        double weight= scanner.nextDouble();
        System.out.print("please enter your height(ex.1,73): ");
        double height= scanner.nextDouble();
        
        double sqrheight= height*height;
        double index= weight/sqrheight;
        
        System.out.print("your body mass index: "+ index);
        
    }
    
}
