package homework9.animals;

public abstract class Animal {
    private int runDistance;
    private int swimDistance;
    private String name;
    private static int counter =0;

    protected Animal (String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        counter ++;
    }

    public void Run (int a) {
        if (a <= 0) {
            System.out.println("Run distance shall be greater than 0");
        }
        else if (a <= runDistance) {
            System.out.printf("%s ran %d meters %n", name, a);
        }
        else if (runDistance ==0){
            System.out.printf("%s cannot run %n", name);
        }
        else {
            System.out.printf("%d meters is to long for %s to run %n", a, name);
        }

    }
    public void Swim (int b) {
        if (b <= 0) {
            System.out.println("Swim distance shall be greater than 0");
        }
        else if (b <= swimDistance) {
            System.out.printf("%s swam %d meters %n", name, b);
        }
        else if(swimDistance == 0) {
            System.out.printf("%s cannot swim %n", name);
        }
        else {
            System.out.printf("%s cannot swim %d meters %n", name,b);
        }
    }

    public static int getTotalCount (){
        return counter;
    }

    public String getName() {
        return name;
    }
}
