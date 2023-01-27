
public class inheritance_çalışan_örn { // superclass or baseclass
    private String isim;
    private String soyisim;
    private int yaş;
    private String departman;
    int maaş; 
    
    public inheritance_çalışan_örn(String isim, String soyisim, int yaş, String departman, int maaş) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yaş = yaş;
        this.departman = departman;
        this.maaş = maaş;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaaş() {
        return maaş;
    }

    public void setMaaş(int maaş) {
        this.maaş = maaş;
    }
    
    
    
    public void bilgiler(){
        
        System.out.println("İSİM: " + isim);
        System.out.println("SOYİSİM: " + soyisim);
        System.out.println("YAŞ: " + yaş);
        System.out.println("DEPARTMAN: " + departman);
        System.out.println("MAAŞ: " + maaş);
    }
    
    public void departman_değiştir(String yeni_departman){
        departman=yeni_departman;
        System.out.println("Yeni Departman: " + departman);
    }
    
    public void çalışan_zam(){
        System.out.println("Maaş: " + maaş);
        maaş=(maaş*120)/100;
        System.out.println("Güncel Maaş: " + maaş);
    }
}

