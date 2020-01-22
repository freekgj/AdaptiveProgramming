package week3.opdracht2_15;

public class Klant {
    private String naam;
    private double korting;

    public Klant(){
        this.naam = "er is geen huurder bekend";
        this.korting = 0;
    }
    public Klant(String naam){
        this.naam = naam;
        this.korting = 0 ;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKorting() {
        return this.korting;
    }

    public void setKorting(double korting) {
        this.korting = korting;
    }

    @Override
    public String toString() {
        return "op naam van: "+ naam + " (korting: " + korting + "%)";
    }
}
