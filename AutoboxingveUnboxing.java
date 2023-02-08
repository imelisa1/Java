import java.util.ArrayList;

public class AutoboxingveUnboxing {
    
    ArrayList<String> array1 = new ArrayList<String>(); // String veri tipi bir class şeklinde tanımlandığından bir sıkıntı çıkmıyor.
    /* Ancak int ya da souble gibi ilkel veri tipleri primitiv olduğundan hata veriyor.
     ArrayList<int> array2 = new ArrayList<int>();
     Bunu engellemek için wrapper classlar bulunur:

     boolean ----> Boolean
     char -----> Character
     byte -----> Byte
     short -----> Short
     int -----> Integer
     long -----> Long
     float -----> Float
     double -----> Double */
    
    ArrayList<Integer> array2 = new ArrayList<Integer>(); // int tipinde veri tutan bir arraylist.
    
    for(int i=0; i<10; i++){
    
    array2.add(Integer.valueOf(i)); // Autoboxing
}
    for(int i=0; i<10; i++){
    
    System.out.println(array2.get(i).intValue()); // Unboxing
} 
    
    // Bunları java otomatik olarak yaptığı için aşağıdaki gibi yazmamız yeterli:
    
    for(int i=0; i<10; i++){
    
    array2.add(i); 
}
    for(int i=0; i<10; i++){
    
    System.out.println(array2.get(i);
} 
    
    
}
