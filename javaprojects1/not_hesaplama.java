
import java.util.Scanner;

/*  vizenin %40 ı ve finalin %60 ı toplam not.
90-100 -- AA
85-90 -- BA
80-85 -- BB
75-80 -- CB
70-75 -- CC
65-70 -- DC
65-60 -- DD
55-60 -- FD
50-55 -- FF
*/
public class not_hesaplama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("vize: ");
        double vize = scanner.nextDouble();
        System.out.print("final: ");
        double finall = scanner.nextDouble();
        
        double netviz = (40*vize)/100;
        double netfin = (60*finall)/100;
        double toplam = netviz + netfin; 
        
        System.out.println("ortalama: "+toplam );
        
        if(toplam>90){
            System.out.println("AA, GEÇTİ");
        }
        else if (toplam<=90 && toplam>85){
            System.out.println("BA, GEÇTİ");
        }
        else if (toplam<=85 && toplam>80){
            System.out.println("BB, GEÇTİ");
        }
        else if (toplam<=80 && toplam>75){
            System.out.println("CB, GEÇTİ");
        }
        else if (toplam<=75 && toplam>70){
            System.out.println("CC, GEÇTİ");
        }
        else if (toplam<=70 && toplam>65){
            System.out.println("DC, ŞARTLI BAŞARI");
        }
        else if (toplam<=65 && toplam>60){
            System.out.println("DD, ŞARTLI BAŞARI");
        }
        else if (toplam<=60 && toplam>55){
            System.out.println("FD, KALDI");
        }
        else if (toplam<=55){
            System.out.println("FF, KALDI");
        }
    }
    
}
