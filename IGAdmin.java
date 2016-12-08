import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class IGAdmin extends Stage {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage) interface
	 * graphique
	 */
	
	public IGAdmin() throws Exception {
		// ---------------path and extension box--------------------------
		
		// ----------------Destination----------------------------------------
		

		// ---------------New name--------------------------------------------
		
		// -------------button to launch---------------------------------------
		Button butt = new Button("Renommer");
		butt.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
			}
		});
		HBox line3 = new HBox();
		line3.setSpacing(8);
		line3.setAlignment(Pos.CENTER);
		line3.getChildren().add(butt);

		TitledPane t1 = new TitledPane("Dossier d'Origine",null );
		TitledPane t2 = new TitledPane("Dossier de Destination",null );
		TitledPane t3 = new TitledPane("Nouveaux Noms",null);
		Accordion accordion = new Accordion();
		accordion.getPanes().addAll(t1, t2, t3);

		VBox end = new VBox();
		end.setSpacing(20);
		end.getChildren().add(accordion);
		end.getChildren().add(line3);

		Scene scene = new Scene(end, 800, 600, Color.WHITE);
		this.setScene(scene);
		this.setTitle("Renommage");
	}

}
