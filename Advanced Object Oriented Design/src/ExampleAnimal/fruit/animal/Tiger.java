package ExampleAnimal.fruit.animal;

import ExampleAnimal.fruit.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Tiger :roarrrrr!";
    }
    @Override
    public String howToEat(){
        return "could be tried";
    }
}
