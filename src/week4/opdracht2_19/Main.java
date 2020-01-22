package week4.opdracht2_19;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating a line object
        Line line = new Line();
        Line line1 = new Line();
        int strokeWidth = 3;
        int arcWidth = 30;
        int arcHeight = 30;
        Color strokeColor = Color.GREEN;

        Rectangle square = new Rectangle(40, 40, 80, 80);
        square.setFill(Color.YELLOW);
        square.setStroke(strokeColor);
        square.setStrokeWidth(strokeWidth);

        //Setting the properties to a line
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);

        //creating a Group object
        //dit is een boomstructuur, gebruikt het observer pattern
        //kijk eens hoe dat werkt en hoe javaFX het gebruikt
        Group group = new Group();

        group.getChildren().addAll(line, square);

        //Creating a Scene by passing the group object, height and width
        Scene scene = new Scene(group ,1500, 750);

        //setting color to the scene
        scene.setFill(Color.BROWN);

        //Setting the title to Stage.
        primaryStage.setTitle("Sample Application");

        //Adding the scene to Stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}