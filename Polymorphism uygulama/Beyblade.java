/*
 tüm beybladelerin ortak özellikleri/ superclass
 */
public class Beyblade {
    private String Beybladeçi;
    private int dönüş_hızı;
    private int saldırı_gücü;

    public Beyblade(String Beybladeçi, int dönüş_hızı, int saldırı_gücü) {
        this.Beybladeçi = Beybladeçi;
        this.dönüş_hızı = dönüş_hızı;
        this.saldırı_gücü = saldırı_gücü;
    }

    public String getBeybladeçi() {
        return Beybladeçi;
    }

    public void setBeybladeçi(String Beybladeçi) {
        this.Beybladeçi = Beybladeçi;
    }

    public int getDönüş_hızı() {
        return dönüş_hızı;
    }

    public void setDönüş_hızı(int dönüş_hızı) {
        this.dönüş_hızı = dönüş_hızı;
    }

    public int getSaldırı_gücü() {
        return saldırı_gücü;
    }

    public void setSaldırı_gücü(int saldırı_gücü) {
        this.saldırı_gücü = saldırı_gücü;
    }
    public void saldır(){
        System.out.println(Beybladeçi+" "+saldırı_gücü+" saldırı gücü ve "+dönüş_hızı+" dönüş hızı ile saldırıyor...");
    }
    public void kutsalCanavarıortayaçıkar(){
        System.out.println("Kutsal canavarı bulunmuyor.");
    }
    public void bilgiler(){
        System.out.println("Beybladeçi ismi: "+Beybladeçi);
        System.out.println("Saldırı Gücü: "+saldırı_gücü);
        System.out.println("Dönüş Hızı: "+dönüş_hızı);
    }
    
    
    
}
