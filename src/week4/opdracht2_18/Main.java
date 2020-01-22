package week4.opdracht2_18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Point start1 = new Point(0, 4);
        Point end1 = new Point(3, 5);
        Point size1 = new Point(8,0);

        Line line1 = new Line(start1, end1);
        Rectangle rectangle1 = new Rectangle(start1, size1);



        System.out.println(line1);
        System.out.println(rectangle1);

        List<Drawable> lijst = new ArrayList<Drawable>();

        lijst.add(line1);
        lijst.add(rectangle1);

        for (Drawable d: lijst
             ) { d.draw();

        }
    }

}
