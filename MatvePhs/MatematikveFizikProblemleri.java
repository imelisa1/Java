
import java.util.Scanner;
// çıkış ve 2.işlemde hata var.
/* 
Matematik problemleri
-Dairenin Alanı 
-Üçgenin Çevresi
Fizik Problemleri
-Vektörlerin iç çarpımları (i,j,k)
*/
public class MatematikveFizikProblemleri {
    
   public static class vektor{
       
       private String isim;
       private int i,j,k;

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            this.k = k;
        }
       
       

        public vektor(String isim) {
            this.isim = isim;
            
            Scanner scan = new Scanner(System.in);
            
            System.out.println(isim+"'in i,j,k değerlerini sırasıyla giriniz: ");
            System.out.print("i: ");
            this.i=scan.nextInt();
            System.out.print("j: ");
            this.j=scan.nextInt();
            System.out.print("k: ");
            this.k=scan.nextInt();
            
        }
       
       
            }
   
    public static class Problem{
        
        public static class Matematic{
            public static void daire_alanı(int yarıcap){
                System.out.println("Dairenin alanı: "+(yarıcap*yarıcap*Math.PI));
            }
            public static void üçgen_çevresi(int Kenar1,int Kenar2,int Kenar3){
                System.out.println("Üçgenin Çeresi: "+(Kenar1+Kenar2+Kenar3));
            }
    }
        public static class Fizik{
            public static void VecÇarpım(vektor vec1,vektor vec2){
                int iççarpım=(vec1.getI()*vec2.getI())+(vec1.getJ()*vec2.getJ())+(vec1.getK()*vec2.getK());
                System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+"'in iç çarpımları: "+iççarpım);
            }
    }
          
    }
    
    public static void main(String[] args){
        
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problem Sihirbazı'na Hoşgeldiniz!");
        String işlemler= "MEVCUT ISLEMLER: \n"
                + "1-Dairenin Alan Hesabı\n"
                + "2-Üçgenin Çevre Hesabı\n"
                + "3-Vektörlerin İççarpımları Hesabı\n"
                +"Çıkış için'q'";
        
        while(true){
            System.out.println(işlemler);
            System.out.println("İşlem seçiniz: ");
            String işlemno = myScan.nextLine();
            
            if(işlemno.equals('q')){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else {
                switch(işlemno){
                    case "1":
                        System.out.println("Yarıçap değeri giriniz: ");
                        int yarç = myScan.nextInt();
                        myScan.nextLine();
                        Problem.Matematic.daire_alanı(yarç);
                        break;
                    case "2":
                        System.out.println("Sırasıyla 3 kenar uzunluğunu giriniz: ");
                        int kenar1 = myScan.nextInt();
                        int kenar2 = myScan.nextInt();
                        int kenar3 = myScan.nextInt();
                        Problem.Matematic.üçgen_çevresi(kenar1, kenar2, kenar3);
                        break;
                    case "3":
                        vektor vec1 = new vektor("Vektor1");
                        vektor vec2= new vektor("Vector2");
                        Problem.Fizik.VecÇarpım(vec1, vec2);
                        break;
                    case "q":
                        break; 
                }
                        
            }
           
        }
    }
        }
      
  
