package week3.opdracht2_17;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games = new ArrayList<>();

    public Persoon(String naam, double budget){
        this.naam = naam;
        this.budget = budget;
    }

    public boolean koop(Game game){
        if(this.games.contains(game) || this.budget < game.getHuidigeWaarde()){
            System.out.println(this.naam + " koopt " + game.naam + ": niet gelukt");
            return false;
        } else {
            System.out.println(this.naam + " koopt " + game.naam + ": gelukt");
            this.games.add(game);
            this.budget = this.budget - game.getHuidigeWaarde();
            return true;
        }
    }

    public void verkoop(Game game, Persoon persoon) {
        if (this.games.contains(game) && persoon.budget >= game.getHuidigeWaarde() && persoon.games.contains(game) == false) {
            persoon.budget = persoon.budget - game.getHuidigeWaarde();
            persoon.games.add(game);
            System.out.println(this.naam + " verkoopt " + game.naam + " aan " + persoon.naam + ": gelukt");
        } else {
            System.out.println(this.naam + " verkoopt " + game.naam + " aan " + persoon.naam + ": niet gelukt");
        }
    }
    
    @Override
    public String toString() {
        String gamesInBezit = "";
        for (Game item : this.games) {gamesInBezit += item;}
        return this.naam + " heeft een budget van €" + this.budget + " en bezit de volgende games: \n" + gamesInBezit;
    }
}
