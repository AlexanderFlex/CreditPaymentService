public class CreditPaymentService {
    public double calculate(double term, double amount, double rate) {
        double result;
        double k;

        rate = rate / 12 / 100;
        term = term * 12;

        k = rate + rate / (Math.pow((1 + rate), term) - 1);

        result = amount * k;

        return result;
    }
}
