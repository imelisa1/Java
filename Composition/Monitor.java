/*
 Resolution classından resolution objesini composite edeceğiz.
 */
public class Monitor {
    private String model;
    private String üretici;
    private double boyut;
    private Resolution resolution;

    public Monitor(String model, String üretici, double boyut, Resolution resolution) {
        this.model = model;
        this.üretici = üretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    
    public void monitor_kapat(){
        System.out.println("monitor kapanıyor...");
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the üretici
     */
    public String getÜretici() {
        return üretici;
    }

    /**
     * @param üretici the üretici to set
     */
    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    /**
     * @return the boyut
     */
    public double getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(double boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
}
