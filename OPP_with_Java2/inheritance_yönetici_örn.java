
public class inheritance_yönetici_örn extends inheritance_çalışan_örn { // subclass

    public inheritance_yönetici_örn(String isim, String soyisim, int yaş, String departman, int maaş) {
        super(isim, soyisim, yaş, departman, maaş); // çalışanın constractorını çağırır.
    }
    public void yönetici_zam(){
        System.out.println("Maaş: " + maaş);
        maaş=(maaş*130)/100;
        System.out.println("Güncel Maaş: " + maaş);
    }    
   
    
}
