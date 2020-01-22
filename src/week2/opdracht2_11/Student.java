package week2.opdracht2_11;

import java.util.ArrayList;

public class Student {
    private String studentNaam;
    private int studentLeeftijd;
    private ArrayList<Integer> lijstMetCijfers = new ArrayList<>();
    private String studentHuisdier;
    private int sum;

    public Student(String naam, int leeftijd, String huisdier) {
        this.studentNaam = naam;
        this.studentLeeftijd = leeftijd;
        this.studentHuisdier = huisdier;
    }
    public void setCijfer(int cijfer) {
        this.lijstMetCijfers.add(cijfer);
    }
    public String getNaam(){
        return this.studentNaam;
    }
    public Integer getLeeftijd(){
        return this.studentLeeftijd;
    }
    public ArrayList<Integer> getLijstMetCijfers(){
        return this.lijstMetCijfers;
    }
    public String getHuisdier(){
        return studentHuisdier;
    }
    public double getGemiddeldeCijfer(){
        for (int cijfer : lijstMetCijfers){
            this.sum+= cijfer;
        }
        int gemSum = this.sum / lijstMetCijfers.size();
        return gemSum;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentNaam='" + studentNaam + '\'' +
                ", studentLeeftijd=" + studentLeeftijd +
                ", lijstMetCijfers=" + lijstMetCijfers +
                ", studentHuisdier='" + studentHuisdier + '\'' +
                ", sum=" + sum +
                '}';
    }
}

