package homework9.payment;

public class Purchase {
    public static void main(String[] arg) {
        Payment payment = new Payment();
        Payment.Item paper = payment.new Item("Paper", 1);
        payment.purchaseItem(paper);
    }
}
