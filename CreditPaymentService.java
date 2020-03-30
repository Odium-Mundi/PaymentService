public class CreditPaymentService {
    public double calculate(int sumCredit, int timeCredit, double precent) {
        double payment = sumCredit * (precent / 100 / 12 + (precent / 100 / 12) / (Math.pow(1 + precent / 100 / 12, timeCredit) - 1));
        int paymentInt = (int) payment;
        System.out.println("Ежемесячный платеж: " + paymentInt + " с процентной ставкой: " + precent);
        return payment;
    }
}

