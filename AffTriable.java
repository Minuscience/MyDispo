import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class AffTriable extends Application {
 
    List<Member> members = Member.LoadMemberList("Save.sav");

    

    final TreeItem<Member> root = 
        new TreeItem<>(new Member("user ", ""),null);
    public static void main(String[] args) {
        Application.launch(AffTriable.class, args);
    }

    @SuppressWarnings("unchecked")
	@Override
    public void start(Stage stage) {
        root.setExpanded(true);
        members.stream().forEach((employee) -> {
            root.getChildren().add(new TreeItem<>(employee));
        });
        stage.setTitle("Tree Table View Sample");
        final Scene scene = new Scene(new Group());
        scene.setFill(Color.LIGHTGRAY);
        Group sceneRoot = (Group) scene.getRoot();

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
        sceneRoot.getChildren().add(treeTableView);
        stage.setScene(scene);
        stage.show();
    }
 
    
}