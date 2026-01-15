

public class Main {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        int[] feetMeasurements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] meterMeasurements = {20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
        System.out.print("Feet\tMeters\t\tMeters\tFeet\n");
        System.out.print("------------------------------------\n");

        for (int i = 0; i < feetMeasurements.length; i++) {
            System.out.print(feetMeasurements[i] + "\t" + footToMeter(feetMeasurements[i]) + "\t\t" + meterMeasurements[i] + "\t" + meterToFoot(meterMeasurements[i]) + "\n");
        }
    }
}
