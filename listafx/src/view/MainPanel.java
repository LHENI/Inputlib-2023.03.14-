package view;

import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    ComboBox comboPanel;
    ListPanel listPanel;

    public MainPanel() {
        this.comboPanel = new ControlPanel();
        this.listPanel = new ListPanel();

        this.getChildren().add(this.comboPanel);
        this.getChildren().add(this.listPanel);
    }
    public ListPanel getListPanel(){
        return this.listPanel;
    }
    public ComboBox<String> getComboPanel(){
        return this.comboPanel;
    }
}
