public class Main {
    public static void main(String[] args) {
        DepositService service = new DepositService();
        double incom = service.calculate(1_000_000, 2.9, 100_000, 90, 30);
        System.out.println(incom);
    }
}
