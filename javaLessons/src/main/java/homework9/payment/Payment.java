package homework9.payment;

public class Payment {
    public class Item {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }
    public void purchaseItem (Item item) {
        System.out.printf("Purchase price of %s is %d", item.name, item.price);
    }

}
