package week4.opdracht2_21;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        //square
        Rectangle square = new Rectangle();
        square.setHeight(500);
        square.setWidth(500);
        square.setX(350);
        square.setY(100);
        square.setFill(Color.BLACK);
        square.setStrokeWidth(3);
        square.setStroke(Color.RED);

        //text
        Text text = new Text("Click on the square to update.");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.CRIMSON);
        text.setX(450);
        text.setY(50);

        //on mouse click
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
               square.setWidth(square.getWidth() - 10);
               square.setHeight(square.getHeight() - 10);
            }
        };
        square.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        Group root = new Group(square, text);
        Scene scene = new Scene(root, 1200, 800);

        primaryStage.setTitle("opdracht 20");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}