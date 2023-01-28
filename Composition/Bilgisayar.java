/*
 oluşturduğumuz bütün classlardan buraya obje oluşturuyoruz.
Bilgisayar class ı bizim en kapsamlı kümemiz oluyor.
 */
public class Bilgisayar {
    private Anakart anakart;
    private Kasa kasa;
    private Monitor monitör; // burada resolution zaten olduğu için tekrar yazmıyoruz.

    public Bilgisayar(Anakart anakart, Kasa kasa, Monitor monitör) {
        this.anakart = anakart;
        this.kasa = kasa;
        this.monitör = monitör;
    }

    /**
     * @return the anakart
     */
    public Anakart getAnakart() {
        return anakart;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    /**
     * @return the monitör
     */
    public Monitor getMonitör() {
        return monitör;
    }

    /**
     * @param monitör the monitör to set
     */
    public void setMonitör(Monitor monitör) {
        this.monitör = monitör;
    }
    
    
}
