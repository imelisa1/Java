
import java.util.Scanner;


public class test {
    private static Scanner scanner = new Scanner(System.in);
    private static Şarkacılae şarkıcılar = new Şarkacılae(); 
    public static void işlemleri_bastır(){
        System.out.println("0-İşlemleri Görüntüle");
        System.out.println("1-Şarkıcıları Görüntüle");
        System.out.println("2-Şarkıcı Ekle");
        System.out.println("3-Şarkıcı Sil");
        System.out.println("4-Şarkıcı Güncelle");
        System.out.println("5-Şarkıcı Ara");
        System.out.println("6-Uygulamadan Çık");
      
    }
    public static void göster(){
        şarkıcılar.şarkıcıları_bastır();
    }
    public static void ekle(){
        System.out.print("Eklemek istediğiniz şarkıcı adı: ");
        String ad = scanner.nextLine();
        şarkıcılar.şarkıcı_ekle(ad);
    }
    public static void sil(){
        System.out.print("Silmek istediğiniz şarkıcı adı: ");
        String şarkıcı = scanner.nextLine();
        şarkıcılar.şarkıcı_sil(şarkıcı);
    }
    public static void güncelle(){
        System.out.print("Önce göncellemek istediğiniz sırayı giriniz: ");
        int sıra = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Yeni şarkıcı adını giriniz: ");
        String yeni_ad = scanner.nextLine();
        şarkıcılar.şarkıcı_güncelle(yeni_ad, sıra-1);
    }
    public static void ara(){
        System.out.print("Hangi şarkıcıyı arıyorsunuz: ");
        String ara = scanner.nextLine();
        şarkıcılar.şarkıcı_ara(ara);
    }
    public static void main(String[] args){
       
        System.out.println(".....ŞARKICI UYGULAMASNA HOŞGELDİNİZ.....");
        
        işlemleri_bastır();
        
        boolean çıkış = false;
        int işlem;
        
        while(!çıkış){
            System.out.print("Bir İşlem Seçiniz:");
            işlem = scanner.nextInt();
            scanner.nextLine();
            
            switch(işlem) {
                case 0:
                    işlemleri_bastır();
                    break;
                case 1:
                    göster();
                    break;
                case 2:
                    ekle();
                    break;
                case 3:
                    sil();
                    break;
                case 4:
                    güncelle();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    çıkış = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
                    
            }
        }
    
    }
    
}
