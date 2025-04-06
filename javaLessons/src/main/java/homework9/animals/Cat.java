package homework9.animals;

public class Cat extends Animal{
    private static int counter =0;
    private int appetite;
    private boolean fullness = false;
    public Cat(String name, int appetite) {
        super(name, 200, 0);
        this.appetite = appetite;
        counter++;

    }
    public static int getTotalCount (){
        return counter;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            fullness = true;
        }
    }

    public boolean getFullness() {
        return fullness;
    }


}
