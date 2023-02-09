
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class şehir_turlama {
    public static void işlemleri_bastır(){
        
        System.out.println("0- İşlemleri Görüntüle");
        System.out.println("1- Sonraki Şehre Git");
        System.out.println("2- Önceki Şehre Git");
        System.out.println("3- Uygulamadan Çık");
    }
    public static void şehir_turla(LinkedList<String> şehirler){
        
        ListIterator<String> itr = şehirler.listIterator();
        
        int işlem;
        
        işlemleri_bastır();
        
        Scanner scanner = new Scanner(System.in);
        
        if(!itr.hasNext()){
            
            System.out.println("Herhangi bir şehir bulunmuyor....");
        }
        
        boolean çıkış = false;
        boolean ileri = true;
        
        while(!çıkış){
            System.out.print("Lütfen işelm seçiniz: ");
            işlem = scanner.nextInt();
            
            switch(işlem){
                case 0:
                    işlemleri_bastır();
                    break;
                case 1:
                    if(!ileri){
                        if(itr.hasNext()){
                            itr.next();
                        }
                        ileri = true;
                    }
                    if(itr.hasNext()){
                        System.out.println("Şehre Gidiliyor..."+itr.next());
                        
                    }
                    else{
                        System.out.println("Gidilecek Şehir Kalmadı....");
                        ileri = true;
                    }
                    break;
                case 2:
                    if(ileri){
                        if(itr.hasPrevious()){
                            itr.previous();
                        }
                        ileri = false;
                    }
                    if(itr.hasPrevious()){
                        System.out.println("Şehre Gidiliyor..."+itr.previous());
                    }
                    else{
                        System.out.println("Şehir Turu Başladı....");
                    }
                    break;
                case 3:
                    çıkış = true;
                    System.out.println("Çıkış Yapılıyor...");
                    break;
            }
        }
     
    }
    public static void main(String[] args){
        
        LinkedList<String> şehirler = new LinkedList<String>();
        
        şehirler.add("Ankara");
       şehirler.add("Eskişehir");
        şehirler.add("İstanbul");
        
        şehir_turla(şehirler);
        
        
    }
    
}
