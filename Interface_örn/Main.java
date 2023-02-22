
public class Main {
    public static void main(String[] args) throws InterruptedException{
        
        System.out.print("İstanbul Havalimanı'na Hoşgeldiniz! ");
        
        String şartlar = "Yurtdışı Çıkış Kuralları:\n"
                + "Herhangi bir çıkış yasağınız olmamalı.\n"
                + "Çıkış harcını tam olarak yatırmış olmanız gerekiyor.\n "
                +"Uygun vizeye sahip olmanız gerekiyor.\n";
        
        String mesaj="Şartların hepsini sağlamanız gerekiyor...";
        
        while(true){
            System.out.println("**********************");
            System.out.println(mesaj);
            System.out.println(şartlar);
            
            Yolcu yolcu = new Yolcu();
            
            System.out.print("Harç bedeli kontrol ediliyor.... ");
            Thread.sleep(3000);
            
            if(yolcu.yurtdisiHarcıKontrol() == false){
                System.out.print(mesaj);
                continue;
            }
            System.out.print("Yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.yasakKontrol() == false){
                System.out.print(mesaj);
                continue;
            }
            
            System.out.print("Vize durumu kontrol ediliyor... ");
            Thread.sleep(3000);
            
            if(yolcu.vizeKontrol() == false){
                System.out.print(mesaj);
                continue;
            }
            
            System.out.print("Yurtdışı çıkış işlemleriniz tamamdır. İyi yolculuklar!");
            break;
        }
                
    }
    
}
