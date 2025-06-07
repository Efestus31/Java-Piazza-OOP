public class Dough {

    private String flourType;
    private boolean hydrated;
    private boolean stuffedCrust;
    private double weight;
    private int proofHours;


    public Dough(String flourType, boolean hydrated, boolean stuffedCrust, double weight, int proofHours) {
        this.flourType = flourType;
        this.hydrated = hydrated;
        this.stuffedCrust = stuffedCrust;
        this.weight = weight;
        this.proofHours = proofHours;
    }

    public String getFlourType() {
        return flourType;
    }

    public double getWeight() {
        return weight;
    }

    public int getProofHours() {
        return proofHours;
    }
}
