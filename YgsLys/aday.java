

public abstract class aday{
    private int turkçe;
    private int matematik;
    private int fizik;
    private int edebiyat;
    private int yabancı_dil;
    private String isim;

    public aday(int turkçe, int matematik, int fizik, int edebiyat, int yabancı_dil,String isim) {
        this.turkçe = turkçe;
        this.matematik = matematik;
        this.fizik = fizik;
        this.edebiyat = edebiyat;
        this.yabancı_dil = yabancı_dil;
        this.isim = isim;
        }

        public int getTurkçe() {
            return turkçe;
        }

        public void setTurkçe(int turkçe) {
            this.turkçe = turkçe;
        }

        public int getMatematik() {
            return matematik;
        }

        public void setMatematik(int matematik) {
            this.matematik = matematik;
        }

        public int getFizik() {
            return fizik;
        }

        public void setFizik(int fizik) {
            this.fizik = fizik;
        }

        public int getEdebiyat() {
            return edebiyat;
        }

        public void setEdebiyat(int edebiyat) {
            this.edebiyat = edebiyat;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getYabancı_dil() {
            return yabancı_dil;
        }

        public void setYabancı_dil(int yabancı_dil) {
            this.yabancı_dil = yabancı_dil;
        }
        
        
        
        abstract int puanHesapla();
        
    }
