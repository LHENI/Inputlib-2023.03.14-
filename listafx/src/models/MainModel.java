package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainModel {

    
    public MainModel() {
        ArrayList<Fruit> fruitList;
        public MainModel(){
            this.fruitList = new ArrayList<>();
            this.initFruit();
        }
        private void initFruit() {
            this.fruitList.add(new Fruit("alma", 1));
            this.fruitList.add(new Fruit("körte", 2));
            this.fruitList.add(new Fruit("szilva", 2));
            this.fruitList.add(new Fruit("barack", 1));
            this.fruitList.add(new Fruit("dió", 1));
            return this.fruitList;
        }
        public ArrayList<Fruit> getFruits(){     
        }
    }

}
