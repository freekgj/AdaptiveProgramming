package week4.opdracht2_18;

public class Point {
    public int posx;
    public int posy;

    public Point(int x, int y){
        this.posx = x;
        this.posy = y;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    @Override
    public String toString() {
        return "x " + this.posx + ", y " + this.posy;
    }
}
