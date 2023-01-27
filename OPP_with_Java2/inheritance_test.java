
public class inheritance_test {  // is a mantığı
    public static void main(String[] args){
        
        inheritance_yönetici_örn yönetici = new inheritance_yönetici_örn("İrem Melisa", "Taş", 20, "IT", 2500);
    
        yönetici.bilgiler();
        
        yönetici.departman_değiştir("CEO");
        
        yönetici.yönetici_zam();
        
        inheritance_çalışan_örn çalışan = new inheritance_çalışan_örn("Nilay", "Taş", 18, "Human Resources", 2500);
        
        çalışan.bilgiler();
        
        çalışan.çalışan_zam();
        
        
    }
    
    
    
}
