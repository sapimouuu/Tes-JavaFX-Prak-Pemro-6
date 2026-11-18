import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    final ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
            new Mahasiswa(01, "Na Jaemin", "13082000"),
            new Mahasiswa(02, "Lee Jeno", "17082000"),
            new Mahasiswa(03, "Lee Haechan", "15052000")
    );

    private TableView table = new TableView();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(450);
        stage.setHeight(500);

        final Label label = new Label("Data Mahasiswa");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn idCol = new TableColumn("ID");
        idCol.setMinWidth(100);
        idCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa, Integer>("id"));

        TableColumn nameCol = new TableColumn("Nama");
        nameCol.setMinWidth(100);
        nameCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa, String>("nama"));

        TableColumn nimCol = new TableColumn("NIM");
        nimCol.setMinWidth(200);
        nimCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa, String>("nim"));

        table.setItems(data);
        table.getColumns().addAll(idCol, nameCol, nimCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
}