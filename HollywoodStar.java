/*
 * Displays a Hollywood Star!
 * It can be you!
 * 
 * nope.
 * 
 * @version     4/05/2021
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.TextAlignment;

public class HollywoodStar extends Application
{
    public static void main(String[] args) 
    {
        launch();
    }

    @Override 
    public void start(Stage primaryStage) throws Exception 
    {
        Polygon star = new Polygon();
        star.getPoints().addAll(new Double[]{ 
                20.0, 170.0,
                170.0, 150.0,
                220.0, 20.0,
                270.0, 150.0,
                420.0, 170.0,
                305.0, 250.0,
                340.0, 390.0,
                220.0, 320.0,
                100.0, 390.0,
                135.0, 250.0
            });
            
        // Add pattern
        Image pattern = new Image("starpattern.jpg");
        star.setFill(new ImagePattern(pattern, 0,0,1,1,true));
        star.setStroke(Color.GOLD);
        
        // Add icon
        Image icon = new Image("staricon.png");
        ImageView iconView = new ImageView();
        iconView.setImage(icon);
        iconView.setX(190);
        iconView.setY(250);
        iconView.setFitWidth(60);
        iconView.setPreserveRatio(true);
        
        // Add text
        Text text = new Text(150, 190, "YOUR NAME\nCAN BE HERE");
        text.setFont(Font.font ("Verdana", 20));
        text.setTextAlignment(TextAlignment.CENTER);
        text.setFill(Color.GOLD);
        text.setStroke(Color.BLACK);
       
        Pane pane = new Pane(star, text, iconView); 

        Scene scene = new Scene(pane, 440, 440, Color.BLACK);  

        primaryStage.setTitle("Hollywood Star"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    } 
}