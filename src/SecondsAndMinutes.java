public class SecondsAndMinutes {
    private static final String INVALID_MESSAGE = "Invalid Value";
    public static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59 ){
            return INVALID_MESSAGE;
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes , seconds);
    }
}
