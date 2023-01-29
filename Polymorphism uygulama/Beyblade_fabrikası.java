/*
Beyblade üreten program
 */
public class Beyblade_fabrikası {
    public Beyblade beybladeUret(String beyblade_türü){
        
        if(beyblade_türü.equals("Dragon")){
            return new Dragon("Takao",800,300,"Mavi Ejderha","Kutsal Canavarlarla Konuşma");
        }
        else if(beyblade_türü.equals("Dranza")){
            return new Dranza("Kai",600,400,"Kırmızı Anka Kuşu");
        }
        else if(beyblade_türü.equals("Drayga")){
            return new Drayga("Rei",800,250,"Beyaz Kaplan");
        }
        else if(beyblade_türü.equals("Draciel")){
            return new Draciel("Max",400,1400,"Kara Kaplumbağa");
        }
        else{
            return null;
        }
        
    }
    
}
