
public class Matematic {
    
    public static class Alan{
        
        public static void dairenin_alanı(int yarıcap){
            
            System.out.println("Dairenin alanı: "+ yarıcap*yarıcap*Math.PI);
        }
        
    }
    public static void main(String[] args){
        
        Matematic.Alan.dairenin_alanı(5);  // dairenin alanı methodu da static yapılırsa böylr tanımlanır.
        
        Matematic.Alan alan = new Matematic.Alan();  // dairenin alanı methodu static değil ise bu şekilde obje oluşturularak tanımlanır.
        alan.dairenin_alanı(7);
    }

}

