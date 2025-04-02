package homework10.FruitBox;

public class FruitBoxMain {
    public static void main(String[] arg) {
        Box<Apple> boxApple = new Box<>();
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());

        Box<Apple> newBoxApple = new Box<>();
        newBoxApple.addFruit(new Apple());
        newBoxApple.addFruit(new Apple());
        newBoxApple.addFruit(new Apple());

        System.out.printf("Box 1: %f and Box 2: %f %n", boxApple.getWeight(), newBoxApple.getWeight());
        boxApple.transferFruits(newBoxApple);
        System.out.printf("After transfer Box 1: %f and Box 2: %f %n", boxApple.getWeight(), newBoxApple.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.printf("Orange box: %f %n", orangeBox.getWeight());
        System.out.printf("Orange box equals to Apple box: %b %n", orangeBox.compare(newBoxApple));
    }
}
