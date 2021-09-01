package Round1;

public class TimeValue {

    private static int days;
    private static int hours;
    private static int minutes;

    public static void main(String[] args) {
        days = 365;
        hours = 0;
        minutes = 1;

        System.out.println(calculateTime(days, hours, minutes));
    }

    public static double calculateTime(int days, int hours, int minutes)
    {
        //check input values for correctness (return -1 if wrong format)
        if (days < 0 || days > 10000 || hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60)
            return -1;

        double time = 0;

        time += ((double) days / 365);
        time += ((double) hours / (365 * 24));
        time += ((double) minutes / (365 * 24 * 60));

        return time;
    }
}
