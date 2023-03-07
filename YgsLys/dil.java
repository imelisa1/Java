
public class dil extends aday{

        public dil(int turkçe, int matematik, int fizik, int edebiyat, int yabancı_dil, String isim) {
            super(turkçe, matematik, fizik, edebiyat, yabancı_dil, isim);
        }

        @Override
        int puanHesapla() {
            return getTurkçe() * 3 + getMatematik() * 1 + getYabancı_dil() * 5+ getEdebiyat() * 2;

        }
    }