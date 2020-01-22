package week2.opdracht2_14;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adres, int bouwjaar){
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon persoon){
        this.huisbaas = persoon;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    @Override
    public String toString() {
        return  "huis " + adres + " is gebouwd in " + bouwjaar + '\n' +
                "en heeft huisbaas " + huisbaas;
    }
}
