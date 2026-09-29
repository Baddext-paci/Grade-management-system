
public class studentInfo extends student implements studentOperations {

    private double math;
    private double physics;
    private double fop;
    private double java;
    private double dsa;

    public studentInfo(String name, double math, double physics, double fop, double java, double dsa) {
        super(name);
        this.math = math;
        this.physics = physics;
        this.fop = fop;
        this.java = java;
        this.dsa = dsa;
    }

    public double calculateAverage() {
        return (math + physics + fop + java + dsa) / 5;
    }

    public void displayStudent() {
        double average = calculateAverage();

        System.out.println("Name: " + name);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Performance: Excellent");
            System.out.println("Result: Passed");
        } else if (average >= 70) {
            System.out.println("Performance: Very Good");
            System.out.println("Result: Passed");
        } else if (average >= 50) {
            System.out.println("Performance: Passed");
            System.out.println("Result: Passed");
        } else {
            System.out.println("Performance: Failed");
            System.out.println("Result: Failed");
        }
    }

    void displayResult() {
        displayStudent();
    }
}

