package week2.opdracht2_14;

public class Main {
    public static void main(String [] args){
        Huis h1 = new Huis("Nijenoord 1", 1970);
        Persoon p1 = new Persoon("Ronald Plasterk", 52);
        System.out.println(h1.getHuisbaas());
        h1.setHuisbaas(p1);
        System.out.println(h1);
        System.out.println();

        Huis h2 = new Huis("Vredenburg", 1991);
        Persoon p2 = new Persoon("Annie Brouwers", 59);
        h2.setHuisbaas(p2);
        System.out.println(h2);
        System.out.println();
        System.out.println("huisbaas 1: " + h1.getHuisbaas());
        System.out.println("huisbaas 2: " + h2.getHuisbaas());
    }
}
