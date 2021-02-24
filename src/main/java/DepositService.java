public class DepositService {
    double calculate(int deposit, double percent, int replenishment, int days, int replenishmentDays) {
        double incom = deposit * days * percent / 36500 + replenishment * replenishmentDays * percent / 36500;
        double scale = Math.pow(10, 2);
        double result = Math.ceil(incom * scale) / scale;
        return result;
    }
}
