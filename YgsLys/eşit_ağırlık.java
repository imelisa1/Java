
public class eşit_ağırlık extends aday {

        public eşit_ağırlık(int turkçe, int matematik, int fizik, int edebiyat,int yabancı_dil ,String isim) {
            super(turkçe, matematik, fizik, edebiyat,yabancı_dil,isim);
        }

        @Override
        int puanHesapla() {
            return getTurkçe()*5 + getMatematik()*5 + getEdebiyat()*4 + getFizik()*1;
        }
        
    }
