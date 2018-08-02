
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;;
public class HelloWorld2 extends Application {
@Override
public void start(Stage primaryStage) {
// Composant graphiques
Label nameL = new Label("Nom?:");
TextField nameF = new TextField();
Label pwL = new Label("Mot de passe?:");
PasswordField pwF = new PasswordField();
Button connectB = new Button("Connexion");
// Mise en page en Grille (Grid layout)
GridPane grid = new GridPane();
grid.addRow(0, nameL, nameF);
grid.addRow(1, pwL, pwF);
grid.add(connectB, 0, 2, 2, 1);
GridPane.setHalignment(connectB, HPos.CENTER);
// Gestion d'événements
connectB.setOnAction(e ->
System.out.println("click"));
// Conteneur Scene
Scene scene = new Scene(grid);
// Conteneur Stage
primaryStage.setTitle("Hello World!");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}