 
import java.util.*;
 
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String input = scanner.nextLine();
 
        String[] values = input.split("\\s");
 
        double m = Double.parseDouble(values[0]);
        double n = Double.parseDouble(values[1]);
        double a = Double.parseDouble(values[2]);
 
        double result = Math.ceil(m/a) * Math.ceil(n/a);
 
        System.out.println(String.format("%.0f", result));
    }
}
