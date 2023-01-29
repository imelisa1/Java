/*
- Class oluştururken başına public yazmazsak birden fazla classı aynı dosyada yazabiliriz
ve belgenin adı class ile aynı olmak zorunda olmaz.
- Polymorphism de ana class tan ürettiğimiz bir obje alt classların referansı gibi davranabilir.
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


public class polymorphism {
    public static void main(String[] args){
        
        Hayvan hayvan1 = new Hayvan("limon");
    }
}
