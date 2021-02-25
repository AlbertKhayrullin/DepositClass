public class DepositService {
    double calculate(int deposit, double percent, int replenishment, int days, int replenishmentDays) {
        double incom = deposit * days / 365 * percent / 100 + replenishment * replenishmentDays / 365 * percent / 100;
        double scale = Math.pow(10, 2);
        double result = Math.ceil(incom * scale) / scale;
        return result;
    }
}
