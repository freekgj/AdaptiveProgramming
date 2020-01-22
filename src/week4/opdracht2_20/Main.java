    package week4.opdracht2_20;

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
            Rectangle square = new Rectangle(100, 100, 100, 100);
            square.setX(200);
            square.setY(150);
            square.setFill(Color.BLACK);
            square.setStrokeWidth(3);
            square.setStroke(Color.RED);

            //text
            Text text = new Text("Click on the square to update.");
            text.setFont(Font.font(null, FontWeight.BOLD, 15));
            text.setFill(Color.CRIMSON);
            text.setX(150);
            text.setY(50);

            //button
            EventHandler<javafx.scene.input.MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent e) {
                    if(square.getFill()!= Color.BLACK){
                        square.setFill(Color.BLACK);
                    } else {
                        square.setFill(Color.WHITE);
                    }
                }
            };
            square.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

            Group root = new Group(square, text);
            Scene scene = new Scene(root, 600, 300);

            primaryStage.setTitle("opdracht 20");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String args[]){
            launch(args);
        }
    }