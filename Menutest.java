import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class Menutest extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        stage.setTitle("Menu Sample");
        Scene scene = new Scene(new VBox(), 400, 350);
        scene.setFill(Color.OLDLACE);
 
        MenuBar menuBar = new MenuBar();
 
        // --- Menu File
        Menu menuListUser = new Menu("Lister user");
        menuListUser.setOnAction(new EventHandler<ActionEvent>() {
            
			@Override
			public void handle(ActionEvent event) {
			}
		});

        
        // --- Menu Edit
        Menu menuNew = new Menu("Nouvel évènement");
 
        // --- Menu View
        Menu menuView = new Menu("Liste des évènement");
 
        menuBar.getMenus().addAll(menuListUser, menuNew, menuView);
 
 
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
 
        stage.setScene(scene);
        stage.show();
    }
 
    
    
}