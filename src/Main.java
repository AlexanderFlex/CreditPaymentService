public class Main {
    public static void main(String[] args) {
        CreditPaymentService pay = new CreditPaymentService();

        System.out.println(" Ежемесячный платеж: " + pay.calculate(1, 1000_000, 9.99) + " руб ");

        System.out.println(" Ежемесячный платеж: " + pay.calculate(2, 1000_000, 9.99) + " руб ");

        System.out.println(" Ежемесячный платеж: " + pay.calculate(3, 1000_000, 9.99) + " руб ");
    }
}