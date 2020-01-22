package week3.opdracht2_15;

public class AutoHuur {
    private int aantalDagen;
    private Auto auto;
    private Klant klant;
    private double prijs;

    public AutoHuur(){
    this.aantalDagen = 0;
    this.prijs = 0;
    this.auto = new Auto();
    this.klant = new Klant();
    }

    public void setGehuurdeAuto(Auto auto) {
        this.auto = auto;
    }

    public String getGehuurdeAuto(){
            return "Gehuurd: " + auto;
    }

    public void setHuurder(Klant klant) {
        this.klant = klant;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public double getPrijs(){
        if (aantalDagen != 0){
            this.prijs = this.aantalDagen * (auto.getPrijsPerDag() * (1 - (klant.getKorting()/100)));
        }
        else{
            this.prijs = 0;
        }
        return this.prijs;
    }

    public double getHuurderKorting(){
        return klant.getKorting();
    }

    @Override
    public String toString() {
        return "\nAutotype: " + auto + '\n' + klant + '\n' + "aantal dagen: " + aantalDagen + " en dat kost " + getPrijs() + '\n';
    }
}

