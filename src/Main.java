public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int amount = 1200;

        System.out.println("Баланс:");

        if (amount > 1000) {
            System.out.println((amount / 100) + amount + balance);
        } else {
            System.out.println(amount + balance);
        }
        System.out.println("Сумма бонусов:");

        if (amount > 1000) {
            System.out.println(amount / 100);
        } else {
            System.out.println("0");
        }
    }
}