package homework9.animals;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food < n) {
            return false;
        }
        food -= n;
        return true;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int m) {
        if (m < 0) {
            return;
        }
        food += m;
    }
}

