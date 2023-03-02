//Abstract class örneği
public class main2 {
    
    public static abstract class aogrencı{ // class olarak kullandığımız için static yapmamız gerekir.
        private String isim;
        private int numara;

        public aogrencı(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        
        abstract void kayıt_yaptır();
        public void selamla(){
            System.out.println("Selamlar...");
        }
    }
    public static void main(String[] args){
        
       aogrencı öğrenci10 = new aogrencı("Melisa",2003021052) { // isim ve numara için constructer ı direkt kullanırız.
           @Override
           void kayıt_yaptır() {
               System.out.println("Kaydınız başarıyla alınmıştır... İsim: "+ getIsim() + " Numara: "+ getNumara() );
           }
       };
       öğrenci10.kayıt_yaptır();
       öğrenci10.selamla(); // selamla metodunu da direkt olarak kullanabiliriz.
    }
    
}
