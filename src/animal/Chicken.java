package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken chick chick chick";
    }
    public String howToEat(){
        return "could be fried";
    }
}
