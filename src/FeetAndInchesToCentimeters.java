public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet <0 || inches <0 || inches >12){
            System.out.println("Invalid Parameters");
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        } else{
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters (feet, remainingInches);
        }
    }
}
