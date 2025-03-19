public class Co2CalculatorApplication {
    public static void main(String[] args) {
        double milesDriven = Double.parseDouble(args[0]);
        double co2Emissions = milesDriven * 0.411; // CO2 emissions per mile (example value)
        System.out.println("CO2 Emissions: " + co2Emissions + " kg");
    }
}
