// local inner classlar methodların içinde onlara özgü şekilde tanımlanır. Erişim belirleyiciler
// kullanılamaz çünkü erişim belirleyiciler classlara tanımlıdır.
//Interface örneği
public class main {
    public static void main(String[] args){
        
        class Alan{ // local inner class. Sadece main methodunda geçerli.
            
            public void daire_alanı(int yarıcap){
                
                System.out.println("Dairenin alanı: "+yarıcap*yarıcap*Math.PI);
            }
            
        }
        
        Alan objem = new Alan();
        
        objem.daire_alanı(10);
        
        Alan objem2 = new Alan();
        
        objem2.daire_alanı(3);
    }
    
    
}
