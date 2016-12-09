import Class.Admin;
import Class.Event;
import Class.Member;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class IGAdmin extends Stage {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage) interface
	 * graphique
	 */
	 final TreeItem<Member> root = 
		        new TreeItem<>(new Member("user ", ""),null);
	@SuppressWarnings("unchecked")
	public IGAdmin(Admin admin,Event event) throws Exception {
		
		// ---------------profile--------------------------
		Label profile = new Label(admin.toString());
		// ----------------event----------------------------------------
		Label eventlabel = new Label(event.toString());

		// ---------------members--------------------------------------------

        TreeTableColumn<Member, String> IDColumn = 
                new TreeTableColumn<>("ID");
            IDColumn.setPrefWidth(150);
            IDColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<Member, String> param) -> 
                new ReadOnlyStringWrapper(param.getValue().getValue().getUserName())
            );
            
        TreeTableColumn<Member, String> firstNameColumn = 
            new TreeTableColumn<>("FirstName");
        firstNameColumn.setPrefWidth(150);
        firstNameColumn.setCellValueFactory(
            (TreeTableColumn.CellDataFeatures<Member, String> param) -> 
            new ReadOnlyStringWrapper(param.getValue().getValue().getFirstName())
        );
        TreeTableColumn<Member, String> lastNameColumn = 
                new TreeTableColumn<>("LastName");
            lastNameColumn.setPrefWidth(150);
            lastNameColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<Member, String> param) -> 
                new ReadOnlyStringWrapper(param.getValue().getValue().getLastName())
            );

        TreeTableColumn<Member, String> emailColumn = 
            new TreeTableColumn<>("Email");
        emailColumn.setPrefWidth(190);
        emailColumn.setCellValueFactory(
            (TreeTableColumn.CellDataFeatures<Member, String> param) -> 
            new ReadOnlyStringWrapper(param.getValue().getValue().getEmail())
        );

        TreeTableView<Member> treeTableView = new TreeTableView<>(root);
        treeTableView.getColumns().setAll(IDColumn,firstNameColumn,lastNameColumn, emailColumn);
		// -------------button to launch---------------------------------------
		
		HBox line3 = new HBox();
		line3.setSpacing(8);
		line3.setAlignment(Pos.CENTER);
		line3.getChildren().add(treeTableView);

		TitledPane t1 = new TitledPane("profile",profile );
		t1.setVisible(true);
		TitledPane t2 = new TitledPane("Evenement à venir",eventlabel );
		TitledPane t3 = new TitledPane("liste des membres",treeTableView);
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
