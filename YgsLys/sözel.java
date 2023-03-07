 
public class sözel extends aday{

        public sözel(int turkçe, int matematik, int fizik, int edebiyat, int yabancı_dil, String isim) {
            super(turkçe, matematik, fizik, edebiyat, yabancı_dil, isim);
        }

        @Override
        int puanHesapla() {
            return getTurkçe() * 5 + getMatematik() * 2 + getFizik() * 1 + getEdebiyat() * 5;

        }
    }