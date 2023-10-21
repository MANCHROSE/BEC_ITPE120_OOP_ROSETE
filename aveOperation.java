public class aveOperation {
    
    public static double calAverage(double[] value) {
        if (value == null || value.length == 0) {
            return 0.0; 
        }

        double sum = 0.0;
        for (double value1 : value) {
            sum += value1;
        }

        return sum / value.length;
    }

    public static void main(String []manch) {
        double[] values = { 10.5, 20.0, 30.5, 40.0, 50.5 };

        double average = aveOperation.calAverage(values);

        System.out.println("The Average is: " + average);
    }
}