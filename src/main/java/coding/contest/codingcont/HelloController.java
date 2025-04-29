package coding.contest.codingcont;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private ComboBox<String> chChooseFlavor;

    @FXML
    private TreeView<String> coneTreeView;

    private ArrayList<Cone> cones = new ArrayList<>();
    private Cone currentCone;
    private TreeItem<String> root;

    @FXML
    private void initialize() {

    }

    @FXML
    void btAddScoop(ActionEvent event) {

    }

    @FXML
    void btFinishOrder(ActionEvent event) {

    }

    @FXML
    void btNewCone(ActionEvent event) {

    }

    @FXML
    void btNewOrder(ActionEvent event) {

    }

}

