package week4.opdracht2_18;

public class Rectangle implements Drawable{
    Point start;
    Point size;
    Line top;
    Line bottem;
    Line left;
    Line right;


    public Rectangle(Point start, Point size){
        this.start = start;
        this.size = size;

        top = new Line(start, new Point(size.getPosx(), start.getPosy()));
        right = new Line(new Point(size.getPosx(), start.getPosy()), start);
        bottem = new Line(start, new Point(size.getPosy(),start.getPosx()));
        left = new Line(new Point(size.getPosy(), start.getPosx()), start);
    }

    @Override
    public String toString() {
        return "rechthoek = " +
                "top=" + top +
                ", bottem=" + bottem +
                ", left=" + left +
                ", right=" + right;
    }

    @Override
    public void draw() {
        System.out.println("rechthoek tekent");
        top.draw();right.draw();bottem.draw();left.draw();
    }

    @Override
    public void update() {

    }
}
