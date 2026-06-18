public class HourMinAngle
{
    static double calculateAngle(int hour, int minutes)
    {
        double minAngle = 6*minutes;
        double hourAngle = 30*hour+0.5*hour;
        double diff = Math.abs(hourAngle-minAngle);

        double angle= Math.min(diff,360-diff);

        return angle;
    }
    public static void main(String[] args) {
        System.out.println(calculateAngle(12, 30));
    }
}