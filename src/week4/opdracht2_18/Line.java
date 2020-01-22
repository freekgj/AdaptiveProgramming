package week4.opdracht2_18;

public class Line implements Drawable{
    Point start;
    Point end;
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Lijn met beginpunt " + this.start + " eindpunt " + this.end;
    }

    @Override
    public void draw() {
        System.out.println("lijn tekent");
    }

    @Override
    public void update() {

    }
}