// para çekme yatırma bakiye sorgulama
public class hesap {
    private String hesapNo;
    private String Şifre;
    private double bakiye;
    
    public hesap(String hesapNo, String Şifre, int bakiye){ // constructor yani referans atanan yer
        this.hesapNo = hesapNo;
        this.Şifre = Şifre;
        this.bakiye = bakiye;
    }

    /** getter setter methodları
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the Şifre
     */
    public String getŞifre() {
        return Şifre;
    }

    /**
     * @param Şifre the Şifre to set
     */
    public void setŞifre(String Şifre) {
        this.Şifre = Şifre;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void para_yatır(double tutar){ //method1
        bakiye+=tutar;
        System.out.print("yeni bakiye: " + bakiye);
         
    }
    
    public void para_çek(double tutar ){  //method2
        if(tutar<bakiye){
            System.out.println("yeterli bakiye yok...");
        }
        else if(tutar<0){
            System.out.println("böylr bir tutar giremezsiniz... ");
        }
        else{
            bakiye-=tutar;
            System.out.print("yeni bakiye: "+ bakiye + "TL");
        }
    }
}
