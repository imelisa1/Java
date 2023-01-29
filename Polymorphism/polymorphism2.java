/*
polymorphism dosyasındaki örneğin farklı bi yöntemi
 */
class Hayvan(){
    
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konuş(){
        return "hayvan konuşuyor...";
    }
} 
class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konuş() {
        return this.getIsim()+ "miyavlıyor...";
    } 
}
class Köpek extends Hayvan{

    public Köpek(String isim) {
        super(isim);
    }

    @Override
    public String konuş() {
        return this.getIsim() + "havlıyor...";
    }
}
class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konuş() {
        return this.getIsim() + "kişniyor...";
    }  
}

public class polymorphism2 {
    public static void konuştur(Hayvan hayvan){
        System.out.println(hayvan.konuş());
    }
    public static void main(String[] args){
        konuştur(new Kedi("minnoş"));
        konuştur(new Köpek("Köpke"));
        konuştur(new At("atim"));
    }
    
}
