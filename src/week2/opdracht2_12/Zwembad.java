package week2.opdracht2_12;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad() {
        this.breedte = 0;
        this.lengte = 0;
        this.diepte = 0;
    }

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    @Override
    public String toString() {
        return  "GEGEVENS ZWEMBAD: Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}

