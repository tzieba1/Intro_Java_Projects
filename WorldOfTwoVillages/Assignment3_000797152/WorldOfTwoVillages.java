package Assignment3_000797152;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.lang.Math;

import static javafx.application.Application.launch;

/**
 * The deployment application which uses a JavaFX graphics template provided for classes in this package.
 */
public class WorldOfTwoVillages extends Application
    {
    @Override
    public void start(Stage stage) throws Exception
        {
        // *** JavaFX Graphics Template
        Group root = new Group();
        Scene scene = new Scene(root, Color.DARKBLUE); // Set scene with background colour.
        Canvas canvas = new Canvas(1200, 800); // Set canvas Size in Pixels
        stage.setTitle("World of Two Villages"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        // *** Creating first Village object; oriented in upper left side of canvas.
        Village village1 = new Village("Madalachawa", 10 + 150 * Math.random(), 250 + 100 * Math.random(),
            Color.ORANGERED);
        village1.draw(gc);      // Calling draw method to draw 'village1'.

        // *** Creating second Village object; oriented in lower left side of canvas.
        Village village2 = new Village("Konkiczemi", 10 + 150 * Math.random(), 600 + 100 * Math.random(),
            Color.FORESTGREEN);
        village2.draw(gc);      // Calling draw method to draw 'village2'.

        // *** Creating House object for the kings house; oriented in right side of canvas.
        House kings_house = new House(780, 600);
        kings_house.draw(gc);   // Calling draw method to draw 'kings_house'.
        
        stage.show();   // Showing the stage after drawing all of the objects.
        }
    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args)
        {
        launch(args);
        }
    }

