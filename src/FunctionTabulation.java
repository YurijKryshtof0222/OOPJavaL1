import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.*;

public class FunctionTabulation {
    public static void main(String[] args) {
        List<Double> first = new LinkedList<>();
        List<Double> second = new LinkedList<>();

        for (double x = 0; x <= 10; x += 1) {
            double y = sqrt(2*x*x + 5*x);
            first.add(y);
        }
        for (double x = -2; x <= 4; x += 0.5) {
            double y = x < 0 ? cos(sin(x + 2))
                             : sin(pow(cos(x), 2));
            second.add(y);
        }
        System.out.println("Tabulation of first function - " + tabulationToString(first));
        System.out.println("Tabulation of second function - " + tabulationToString(second));
    }

    public static String tabulationToString(List<Double> list) {
        StringBuilder sb = new StringBuilder("[");
        for (Double d: list) {
            sb.append(String.format("%.2f; ", d));
        }
        return sb.replace(sb.length() - 2, sb.length() , "]").toString();
    }
}
