public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int amount = 1600;
        int bonus = amount / 100;

        System.out.println("Баланс:");

        if (amount > 1000) {
            System.out.println(bonus + amount + balance);
        } else {
            System.out.println(amount + balance);
        }
        System.out.println("Сумма бонусов:");

        if (amount > 1000) {
            System.out.println(bonus);
        } else {
            System.out.println("0");
        }
    }
}