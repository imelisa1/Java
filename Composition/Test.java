// Composition alt küme mantığındadır. İç içe objelerden oluşur. "has a" ilişkisi vardır.
public class Test {
    public static void main(String[] args){
        Resolution resolution = new Resolution(1920,1080);
        
        Monitor monitör = new Monitor("VS197DE","ASUS",18.5,resolution);
        
        Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli Cam");
        
        Anakart anakart = new Anakart("5250-PRO","ASUS",10,"Windows 10");
        
        Bilgisayar pc = new Bilgisayar (anakart,kasa,monitör); // pc objemiz altkümeleriyle oluşturuldu.
        
        //pc.getKasa().bilgisayarı_aç(); // kasa objesinin metodunu kullanma
        
        //pc.getMonitör().monitor_kapat(); // monitör objesinin metodunu kullanma
        
        pc.getAnakart().isletim_sistemi_yükle("Windows 11"); // anakart objesinin metodunu kullanma
        
        System.out.print("işletim sistemi: "+ pc.getAnakart().getIslemim_sistemi());
    }
    
}
