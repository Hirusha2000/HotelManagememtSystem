import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MainForm12Controller {
    public Button NextId;
    public RadioButton singleId;
    public RadioButton doubleId;
    public RadioButton trippleId;
    public RadioButton quadId;
    public TextField daysId;
    int cost=0;
    public void NextOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainForm13.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



        if(singleId.isSelected()){
            cost+=25000;
        } else if(doubleId.isSelected()){
            cost+=35000;
        }else if(trippleId.isSelected()){
            cost+=45000;
        }else{
            cost+=60000;
        }



    }

}
