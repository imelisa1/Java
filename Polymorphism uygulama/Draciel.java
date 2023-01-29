/*
Beyblade den kalıtım ile draciel oluşturuyoruz ve yeni özellik ekliyoruz.
 */
public class Draciel extends Beyblade {
    
    private String kutsalCanavar;

    public Draciel(String Beybladeçi, int dönüş_hızı, int saldırı_gücü,String kutsalCanavar) {
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
        System.out.println(getBeybladeçi()+"'ın savunması: Kale Savunması");

    }
    
    
    
}
