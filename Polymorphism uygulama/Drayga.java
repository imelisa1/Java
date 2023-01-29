/*
 Beyblade den kalıtım ile drayga oluşturuyoruz ve yeni özellik ekliyoruz.
 */
public class Drayga extends Beyblade {
    
    private String kutsalCanavar;
    
    public Drayga(String Beybladeçi, int dönüş_hızı, int saldırı_gücü,String kutsalCanavar) {
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
        System.out.println(getBeybladeçi()+"'ın saldırısı: Kaplan Pençesi");
    }
    
    
}
