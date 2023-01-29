/*
Beyblade den kalıtım ile dranza oluşturuyoruz ve yeni özellik ekliyoruz.
 */
public class Dranza extends Beyblade {
    
    private String kutsalCanavar;
    
    public Dranza(String Beybladeçi, int dönüş_hızı, int saldırı_gücü,String kutsalCanavar) {
        super(Beybladeçi, dönüş_hızı, saldırı_gücü);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgiler() {
        super.bilgiler(); 
        System.out.println("Kutsal Canavar: "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarıortayaçıkar() {
        System.out.println(getBeybladeçi()+" "+kutsalCanavar+"'ı ortaya çıkarıyor...");
        System.out.println(getBeybladeçi()+"'ın saldırısı: Alev Kılıcı");
        
    }
    
    
}
