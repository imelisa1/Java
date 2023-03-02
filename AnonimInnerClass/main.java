// class tanımlaması olmadan kullanmaktır. Interface veya abstract classların özelliklerini 
//implement ederek class olmadan kullanmamızı sağlar.
public class main {
    
    public interface Iogrenci{
        void ders_çalış();
        void derse_gir();
    }
    
    
    public static void main(String[] args){
        
        Iogrenci öğrenci = new Iogrenci(){  //Anonim innerclassı interface objesiymiş gibi tanımladık.
            @Override
            public void ders_çalış() {
                System.out.println("Ders çalııyor..");
            }

            @Override
            public void derse_gir() {
                System.out.println("Dese giriyorum...");
            }
            
        };
        öğrenci.ders_çalış(); // metodların kullanımı
        öğrenci.derse_gir();
    }
    
}
