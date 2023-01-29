
public class inctanceof {
    public static void main (String[] args){
        
        Köpek kopek = new Köpek (" köpke ");
        
        if (kopek instanceof Köpek){ // Köpek yerine Hayvan yazarsak yine kabul olurdu çünkü Köpek Hayvan ın alt sınıfı.
            System.out.println("bu nesne köpek nesnesidir.");
        }
        /*if (kopek instanceof Kedi){ // burda hata verirdi çünkü kopek Köpek classına ait.
            System.out.println("bu nesne köpek nesnesidir.");*/
        }
    }
}
    
    
   

