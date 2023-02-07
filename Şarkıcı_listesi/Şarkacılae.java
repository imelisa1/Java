import java.util.ArrayList;

public class Şarkacılae {
    private ArrayList<String> şarkıcı_listesi = new ArrayList<String>();
    
    public void şarkıcıları_bastır(){
        System.out.println("Şarkıcı Listesinde "+şarkıcı_listesi.size()+ " tane şarkıcı var:");
        
        for(int i=0;i<şarkıcı_listesi.size();i++){
            System.out.println((i+1)+".Şarkıcı: "+ şarkıcı_listesi.get(i));
        }
    }
    public void şarkıcı_ekle(String isim){
        şarkıcı_listesi.add(isim);
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    public void şarkıcı_sil(String isim){
        şarkıcı_listesi.remove(isim);
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    public void şarkıcı_güncelle(String isim, int sıra){
        şarkıcı_listesi.set(sıra, isim);
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    public void şarkıcı_ara(String isim){
        int sıra = şarkıcı_listesi.indexOf(isim);
        if(sıra>=0){
            System.out.println(isim+" isimli şarkıcı "+(sıra+1)+".sırada.");
        }
        else{
            System.out.println(isim+" isimli şarkıcı listede yok.");
        }
    }
}
