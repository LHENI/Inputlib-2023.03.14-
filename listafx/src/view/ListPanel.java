package view;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class ListPanel extends ListView<String>{

    public ListPanel() {
    }
    public void setFuirts(ObservableList<String> fruitList){
        this.setItems(fruitList);
    }
    
}

