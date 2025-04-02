package homework10.FruitBox;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public <TOther extends Fruit> boolean compare(Box<TOther> other) {
        return getWeight() == other.getWeight();
    }

    public float getWeight() {
        float sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void addFruits(ArrayList<T> fruitsToAdd) {
        fruits.addAll(fruitsToAdd);
    }

    public void transferFruits(Box<T> otherBox) {
        otherBox.addFruits(fruits);
        fruits.clear();
    }

    public void addFruit(T fruitToAdd) {
        fruits.add(fruitToAdd);
    }
}
