/*
1-1000 aralığındaki asal sayıları bulan metod.
 */
public class asal_sayı {
    public static boolean asal(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        for(int i=2;i<1001;i++){
            if(asal(i)){
                System.out.println(i);
            }
        }
    }
}
     

