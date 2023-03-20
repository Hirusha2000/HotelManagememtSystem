import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForm13Controller {
    public Button NextId;
    public RadioButton localId;
    public RadioButton chineseId;
    public RadioButton frenchId;
int total=0;
    public void NextOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainForm14.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        MainForm12Controller a= new MainForm12Controller();

        if(localId.isSelected()) {
            a.cost += 1500 * 3;
            total+=a.cost;
        } else if(chineseId.isSelected()) {
            a.cost += 2500 * 3;
            total+=a.cost;
        } else{
            a.cost+=2500*3;
            total+=a.cost;

        }








    }



}
