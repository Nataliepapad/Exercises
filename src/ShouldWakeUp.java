public class ShouldWakeUp {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay ) {
        if (barking == false || hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        return false;
    }
}
