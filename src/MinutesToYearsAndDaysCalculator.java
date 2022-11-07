public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hour = (int)minutes / 60;
            int day = (int)hour / 24;
            int years = day / 365;
            int newDay = day % 365;
            System.out.println( minutes + " min = " + years + " y and " + newDay + " d");
        }
    }
}
