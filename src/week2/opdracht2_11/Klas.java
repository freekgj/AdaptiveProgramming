package week2.opdracht2_11;

import java.util.ArrayList;

public class Klas {
    private String klassennaam;
    private ArrayList<Docent> docenten = new ArrayList<>();
    private ArrayList<Student> studenten = new ArrayList<>();
    private int sumKlas;

    public Klas(String klassennaam) {
        this.klassennaam = klassennaam;
    }

    public void setDocent(Docent docent)  {
        docenten.add(docent);
    }
    public void setStudenten(Student student) {
        studenten.add(student);
    }
    public ArrayList<Docent> getDocent(String klassennaam){
        return this.docenten;
    }
    public double getGemiddeldeCijferklas() {
        for (Student studentx: this.studenten) {
            this.sumKlas += studentx.getGemiddeldeCijfer();
        }
        int sumGemKlas = sumKlas / studenten.size();
        return sumGemKlas;
    }
    public ArrayList<Student> getStudent() {
        return this.studenten;
    }
}