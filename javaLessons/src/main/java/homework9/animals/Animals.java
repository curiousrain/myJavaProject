package homework9.animals;

public class Animals {
    public static void main (String[] arg) {
        Cat iriska = new Cat("Iriska", 100);
        Dog misha = new Dog("Misha");
        iriska.Run(100);
        iriska.Run(300);
        iriska.Swim(100);
        iriska.Swim(0);
        misha.Run(500);
        misha.Run(600);
        misha.Swim(10);
        misha.Swim(20);
        System.out.printf("Total count of animals: %d %n", Animal.getTotalCount());
        System.out.printf("Total count of cats: %d %n", Cat.getTotalCount());
        System.out.printf("Total count of dogs: %d %n", Dog.getTotalCount());
        Cat[] cats = {
                new Cat("Cat 1", 10),
                new Cat("Cat 2", 1000),
                new Cat("Cat 3", 200),
                new Cat("Cat 4", 5),
                new Cat("Cat 5", 50)
        };
        Plate plate = new Plate(1210);
        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            System.out.printf("%s is full: %b %n", cat.getName(), cat.getFullness() );
            plate.addFood(10);
        }
    }
}
