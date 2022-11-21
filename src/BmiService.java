public class BmiService {
    public double calculate(double weight, double height) {
        double weightIndex;
        weightIndex = weight / (height * height);
        return weightIndex;
    }

}
