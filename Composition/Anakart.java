
public class Anakart {
    private String model;
    private String üretici;
    private int yuva_sayısı;
    private String islemim_sistemi;

    public Anakart(String model, String üretici, int yuva_sayısı, String islemim_sistemi) {
        this.model = model;
        this.üretici = üretici;
        this.yuva_sayısı = yuva_sayısı;
        this.islemim_sistemi = islemim_sistemi;
    }
    
    public void isletim_sistemi_yükle(String işletim_sistemi){
        this.islemim_sistemi=işletim_sistemi;
        System.out.println("Yeni işletim sistemi yüklendi: "+ işletim_sistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public int getYuva_sayısı() {
        return yuva_sayısı;
    }

    public void setYuva_sayısı(int yuva_sayısı) {
        this.yuva_sayısı = yuva_sayısı;
    }

    public String getIslemim_sistemi() {
        return islemim_sistemi;
    }

    public void setIslemim_sistemi(String islemim_sistemi) {
        this.islemim_sistemi = islemim_sistemi;
    }
    
}
