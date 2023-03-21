package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import models.Fruit;
import models.MainModel;
import view.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainController(){
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvents();
    }
    public MainPanel getMainPanel(){
        return this.mainPanel;
    }
    private void handleEvents(){
        ComboBox<String> combo= this.mainPanel.getComboPanel();
        combo.setOnAction(e ->{
            System.out.println("Műkődik");
        });
    }
    private void selectCategory(){
        System.out.println("Itt is műkődik");
        //TODO: A selected változó a ComboBoxra kell változón;
        int index = this.mainPanel.
        getComboPanel().
        getSelectionModel().
        getSelectedIndex();

        int selected = 1;
        ObservableList<String> newFruitList = FXCollections.observableArrayList();
        System.out.println("-------------------");
        this.mainModel.getFruits().forEach(Fruit -> {
        System.out.println(index + "" + fruit.getCategory);
            if(selected == fruit.getCategory()){
                System.out.println(Fruit.getName);
                newFruitList.add(fruit.getName());
            }
        });
        this.mainPanel.getListPanel().setFuirts(newFruitList);

        }
        
    }

