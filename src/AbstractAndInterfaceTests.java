import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[]animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (int i=0;i<animals.length;i++){
            System.out.println(animals[i].makeSound());
            if (animals[i] instanceof Chicken){
                Edible edible=(Edible)animals[i];
                System.out.println(edible.howToEat());
            }
        }
    }
}
