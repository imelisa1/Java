/*
 Beyblade den kalıtım ile draciel oluşturuyoruz ve yeni özellik ekliyoruz.
 */
public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String Beybladeçi, int dönüş_hızı, int saldırı_gücü,String kutsalCanavar,String gizliYetenek) {
        super(Beybladeçi, dönüş_hızı, saldırı_gücü);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgiler() {
        super.bilgiler(); 
        System.out.println("Kutsal Canavar: "+kutsalCanavar);
        System.out.println("gizliYetenek: "+gizliYetenek);
    }

    @Override
    public void kutsalCanavarıortayaçıkar() {
        System.out.println(getBeybladeçi()+" "+kutsalCanavar+"'ı ortaya çıkarıyor...");
        System.out.println(getBeybladeçi()+"'ın saldırısı: Hayalet Kasırgası");
    }
    
    
    
    
}
