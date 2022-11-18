public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 90;
        double h = 1.70;
        double bmi = service.calculate(m, h);
        System.out.println(bmi);


    }
}