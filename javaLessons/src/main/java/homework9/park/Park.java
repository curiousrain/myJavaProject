package homework9.park;

public class Park {
    public class Attraction {
        private String name;
        private int worksFrom;
        private int worksTo;
        private int price;

        public Attraction(String name, int worksFrom, int worksTo, int price) {
            this.name = name;
            this.worksFrom = worksFrom;
            this.worksTo = worksTo;
            this.price = price;
        };
    }

    public void getInfo(Attraction attraction) {
        System.out.printf("%s is working from %d to %d and costs %d %n", attraction.name, attraction.worksFrom, attraction.worksTo, attraction.price);
    }
}
