package DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        int newFirstNumber = (int)(firstNumber * 1000);
        int newSecondNumber = (int)(secondNumber * 1000);
        if (newFirstNumber == newSecondNumber){
            return true;
        }
        return false;
    }
}
