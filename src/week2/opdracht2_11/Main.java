package week2.opdracht2_11;

public class Main {

    public static void main(String[] args){

        Student student1 = new Student("Henk", 19, "hond");
        student1.getLijstMetCijfers();
        Student student2 = new Student("Harry", 18, "kat");
        student1.setCijfer(6);
        student1.setCijfer(8);
        student2.setCijfer(6);
        student2.setCijfer(4);
        Student student3 = new Student("Klaas", 21, "goudvis");
        student3.setCijfer(8);
        student3.setCijfer(7);
        Docent docent1 = new Docent("Meneer Jansen");
        Klas klas1 = new Klas("V1A");

        klas1.setDocent(docent1);
        klas1.setStudenten(student1);
        klas1.setStudenten(student2);
        System.out.println(klas1.getGemiddeldeCijferklas());
    }
}
