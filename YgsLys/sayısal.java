
public class sayısal extends aday {

        public sayısal(int turkçe, int matematik, int fizik, int edebiyat,int yabancı_dil ,String isim) {
            super(turkçe, matematik, fizik, edebiyat,yabancı_dil ,isim);
        }

        @Override
        int puanHesapla() {
           return getTurkçe() * 3 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;

        }
    }