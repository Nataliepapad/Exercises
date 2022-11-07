import AreaCalculator.AreaCalculator;
import Converters.FeetAndInchesToCentimeters;
import Converters.MegaBytesConverter;
import Converters.SecondsAndMinutes;
import Converters.SpeedConverter;
import DecimalComparator.DecimalComparator;
import EqualSumPrinter.EqualSumChecker;
import EqualityPrinter.EqualityPrinter;
import LeapYear.LeapYear;
import MinutesToYearsAndDaysCalculator.MinutesToYearsAndDaysCalculator;
import PlayingCat.PlayingCat;
import ShouldWakeUp.ShouldWakeUp;
import TeenNumberChecker.TeenNumberChecker;

public class App {
    public static void app(){
        // Area Calculator Testing
        System.out.println("Area Calculator");
        System.out.println(AreaCalculator.area(5,6));
        System.out.println(AreaCalculator.area(0,6));
        System.out.println(AreaCalculator.area(-1,4));
        System.out.println(AreaCalculator.area(4));
        System.out.println(AreaCalculator.area(5.5));
        System.out.println(AreaCalculator.area(-2));
        System.out.println("-----------------------");

        // Decimal Calculator Testing
        System.out.println("Decimal Calculator");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(4.6789,6.64457));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.345,2.34567));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.234,1.233));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(0,0.0001));
        System.out.println("-----------------------");

        // Equality Printer Testing
        System.out.println("Equality Printer");
        EqualityPrinter.printEqual( 3,4,5);
        EqualityPrinter.printEqual( 7,7,7);
        EqualityPrinter.printEqual( 6,9,9);
        System.out.println("-----------------------");

        // Equal Sum Checker Testing
        System.out.println("Equal Sum Checker");
        System.out.println(EqualSumChecker.hasEqualSum( 3,4,7));
        System.out.println(EqualSumChecker.hasEqualSum( 0,4,6));
        System.out.println(EqualSumChecker.hasEqualSum( 2,2,4));
        System.out.println("-----------------------");

        // Feet And Inches To Centimeters Testing
        System.out.println("Feet And Inches To Centimeters");
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(3.4,6));
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(3.4,-6));
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(12,12));
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(1));
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(20));
        System.out.println("-----------------------");

        // Leap Year Testing
        System.out.println("Leap Year");
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(1924));
        System.out.println(LeapYear.isLeapYear(-1924));
        System.out.println(LeapYear.isLeapYear(1327));
        System.out.println("-----------------------");

        // MegaBytes Converter Testing
        System.out.println("MegaBytes Converter");
        MegaBytesConverter.printMegaBytesAndKiloBytes(6370);
        MegaBytesConverter.printMegaBytesAndKiloBytes(10360);
        MegaBytesConverter.printMegaBytesAndKiloBytes(1000);
        System.out.println("-----------------------");

        // Minutes To Years And Days Calculator Testing
        System.out.println("Minutes To Years And Days Calculator");
        MinutesToYearsAndDaysCalculator.printYearsAndDays(507850);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(-4);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(670500);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(78340);
        System.out.println("-----------------------");

        // Seconds And Minutes Calculator Testing
        System.out.println("Seconds And Minutes Calculator");
        System.out.println(SecondsAndMinutes.getDurationString(60, 10));
        System.out.println(SecondsAndMinutes.getDurationString(60, 60));
        System.out.println(SecondsAndMinutes.getDurationString(-10, 22));
        System.out.println(SecondsAndMinutes.getDurationString(15, 7));
        System.out.println(SecondsAndMinutes.getDurationString(125));
        System.out.println(SecondsAndMinutes.getDurationString(350));
        System.out.println(SecondsAndMinutes.getDurationString(0));
        System.out.println(SecondsAndMinutes.getDurationString(43657));
        System.out.println("-----------------------");

        // Speed Converter Testing
        System.out.println("Speed Converter");
        SpeedConverter.printConversion(-10.5);
        SpeedConverter.printConversion(10.5);
        System.out.println("-----------------------");

        // Teen Number Checker Testing
        System.out.println("Teen Number Checker");
        System.out.println(TeenNumberChecker.hasTeen(6,14,98));
        System.out.println(TeenNumberChecker.hasTeen(2,32,58));
        System.out.println(TeenNumberChecker.isTeen(7));
        System.out.println(TeenNumberChecker.isTeen(19));
        System.out.println("-----------------------");

        // Should Wake Up Testing
        System.out.println("Should Wake Up");
        System.out.println(ShouldWakeUp.shouldWakeUp(true,5));
        System.out.println(ShouldWakeUp.shouldWakeUp(false,5));
        System.out.println(ShouldWakeUp.shouldWakeUp(false,12));
        System.out.println(ShouldWakeUp.shouldWakeUp(true,-1));
        System.out.println(ShouldWakeUp.shouldWakeUp(true,22));
        System.out.println(ShouldWakeUp.shouldWakeUp(true,23));
        System.out.println("-----------------------");

        // Playing Cat Testing
        System.out.println("Playing Cat");
        System.out.println(PlayingCat.isCatPlaying(true,5));
        System.out.println(PlayingCat.isCatPlaying(true,45));
        System.out.println(PlayingCat.isCatPlaying(false,30));
        System.out.println(PlayingCat.isCatPlaying(false,25));
        System.out.println(PlayingCat.isCatPlaying(false,10));
        System.out.println("-----------------------");
    }
}
