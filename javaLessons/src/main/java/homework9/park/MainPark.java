package homework9.park;

public class MainPark {
    public static void main(String[] arg) {
        Park park = new Park();
        Park.Attraction cups = park.new Attraction("Cups", 10, 22, 100);
        park.getInfo(cups);
    }
}
