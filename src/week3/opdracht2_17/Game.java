package week3.opdracht2_17;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Game {
    public String naam;
    public int releasejaar;
    public double nieuwprijs;

    public Game(String naam, int releasejaar, double nieuwprijs){
        this.naam = naam;
        this.releasejaar = releasejaar;
        this.nieuwprijs = nieuwprijs;
    }
    public String getNaam(){
        return this.naam;
    }

    public double getHuidigeWaarde(){
        double huidigeWaarde = 0;
        if (LocalDate.now().getYear() - this.releasejaar == 1) {
            huidigeWaarde = nieuwprijs * 0.7;
        } else if (LocalDate.now().getYear() - this.releasejaar == 2) {
            huidigeWaarde = nieuwprijs * 0.7 * 0.7;
        }
        BigDecimal bd = new BigDecimal(huidigeWaarde);
        BigDecimal rounded = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return rounded.doubleValue();
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return releasejaar == game.releasejaar &&
                Double.compare(game.nieuwprijs, nieuwprijs) == 0 &&
                Objects.equals(naam, game.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, releasejaar, nieuwprijs);
    }

    @Override
    public String toString() {
        return  naam + ", uitgegeven in " + releasejaar + "; nieuwprijs: " + nieuwprijs + " nu voor: €" + getHuidigeWaarde() + "\n";
    }
}