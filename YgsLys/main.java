
import java.util.Scanner;
// tek bir sayfada herşeyi yazınca hata veriyor!

public class main {
    public static <E extends aday> E birinci(E e1,E e2,E e3) {  // Generic method tanımlaması
        
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            
            return e1;
        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            
            return e2;
        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
            
            return e3;
        }
        else {
            return e1;
        }
    }
    
    public static void main(String[] args){
        
        System.out.println("YGS-LYS Birincileri....");
        
        Scanner scan = new Scanner(System.in);
        
        String işlem = "İşlemler:\n"
                + "1-Sayısal Birincisi\n"
                +"2-Eşit Ağırlık Birincisi\n"
                +"3-Sözel Birincisi\n"
                +"4-Dil Birincisi\n"
                +"5-Çıkış";
                
        System.out.println("*******************************************");
        System.out.println(işlem);
        System.out.println("*******************************************");
        
        while(true){
            
            System.out.print("Bir işlem seçiniz: ");
            int cevap = scan.nextInt();
            
            if (cevap == 5) {
                System.out.println("Program Sonlandırılıyor...");
                break;
            }
            
            //birinci öğrenci
            System.out.print("Birinci Öğrenci İsmi : ");
            String isim1 = scan.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik Dil) : ");
            int turkce1 = scan.nextInt();
            int matematik1 = scan.nextInt();
            int edebiyat1 = scan.nextInt();
            int fizik1 = scan.nextInt();
            int dil1 = scan.nextInt();
            scan.nextLine();
            
            //ikinci öğrenci
            System.out.print("İkinci Öğrenci İsmi : ");
            String isim2 = scan.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik Dil) : ");
            int turkce2 = scan.nextInt();
            int matematik2 = scan.nextInt();
            int edebiyat2 = scan.nextInt();
            int fizik2 = scan.nextInt();
            int dil2 = scan.nextInt();
            scan.nextLine();
            
            //üçüncü öğrenci
            System.out.print("Üçüncü Öğrenci İsmi : ");
            String isim3 = scan.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik Dil) : ");
            int turkce3 = scan.nextInt();
            int matematik3 = scan.nextInt();
            int edebiyat3 = scan.nextInt();
            int fizik3 = scan.nextInt();
            int dil3 = scan.nextInt();
            scan.nextLine();
            
            switch(cevap){
                
                case 1:
                    sayısal ogrenci1 = new sayısal(turkce1,matematik1,edebiyat1,fizik1,dil1,isim1);
                    sayısal ogrenci2 = new sayısal(turkce2,matematik2,edebiyat2,fizik2,dil2,isim2);
                    sayısal ogrenci3 = new sayısal(turkce3,matematik3,edebiyat3,fizik3,dil3,isim3);

                    sayısal birinciS = birinci(ogrenci1,ogrenci2,ogrenci3);
                    
                    System.out.println("Birinci Sayısal Öğrencisi : " + birinciS.getIsim());
                    System.out.println("Öğrenci Puanı : " + birinciS.puanHesapla());
                    break;
                case 2:
                    eşit_ağırlık ogrenci4 = new eşit_ağırlık(turkce1,matematik1,edebiyat1,fizik1,dil1,isim1);
                    eşit_ağırlık ogrenci5 = new eşit_ağırlık(turkce2,matematik2,edebiyat2,fizik2,dil2,isim2);
                    eşit_ağırlık ogrenci6 = new eşit_ağırlık(turkce3,matematik3,edebiyat3,fizik3,dil3,isim3);

                    eşit_ağırlık birinciE = birinci(ogrenci4,ogrenci5,ogrenci6);
                    System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + birinciE.getIsim());
                    System.out.println("Öğrenci Puanı : " + birinciE.puanHesapla());
                    break;
                case 3:
                    sözel ogrenci7 = new sözel(turkce1,matematik1,edebiyat1,fizik1,dil1,isim1);
                    sözel ogrenci8 = new sözel(turkce2,matematik2,edebiyat2,fizik2,dil2,isim2);
                    sözel ogrenci9 = new sözel(turkce3,matematik3,edebiyat3,fizik3,dil3,isim3);

                    sözel birinciÖ = birinci(ogrenci7,ogrenci8,ogrenci9);
                    System.out.println("Birinci Sözel Öğrencisi : " + birinciÖ.getIsim());
                    System.out.println("Öğrenci Puanı : " + birinciÖ.puanHesapla());
                    break;
                case 4:
                    dil ogrenci10 = new dil(turkce1,matematik1,edebiyat1,fizik1,dil1,isim1);
                    dil ogrenci11 = new dil(turkce2,matematik2,edebiyat2,fizik2,dil2,isim2);
                    dil ogrenci12 = new dil(turkce3,matematik3,edebiyat3,fizik3,dil3,isim3);

                    dil birinciD = birinci(ogrenci10,ogrenci11,ogrenci12);
                    System.out.println("Birinci Dil Öğrencisi : " + birinciD.getIsim());
                    System.out.println("Öğrenci Puanı : " + birinciD.puanHesapla());
                    break;  
            }                
        }
    }
    
}
