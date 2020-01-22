package week3.opdracht2_15;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(){
        this.type = "er is geen auto bekend";
        this.prijsPerDag = 0;
    }
    public Auto(String autoType, double autoPrijs){
        this.type = autoType;
        this.prijsPerDag = autoPrijs;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }


    public double getPrijsPerDag() {
        return this.prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
