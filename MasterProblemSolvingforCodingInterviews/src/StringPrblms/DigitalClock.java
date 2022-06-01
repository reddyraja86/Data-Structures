package StringPrblms;

/**
 * Covert input to digital clock Format
 * 
 * Ex:
 * 
 * 1180 will be 19:40
 * 125 will be 2:05
 * 155 will be 2:35
 * 
 * Note : Max value of minutes will be 24*60
 */
public class DigitalClock {
    public static void main(String[] args) {
        int input = 1180;

        int hours = input / 60;
        int min = input % 60;
        String formatted = String.format("%02d", min);
        System.out.println(hours + ":" + formatted);

    }
}
