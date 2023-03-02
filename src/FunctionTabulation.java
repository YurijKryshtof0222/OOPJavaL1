import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> first = new LinkedList<>();
        List<Double> second = new LinkedList<>();

        for (double x = -2; x <= 2; x += 0.1) {
            double y = x*x * Math.sin(x);
            first.add(y);
        }
        for (double x = 6; x <= 8; x += 0.2) {
            double y = x < 7 ? Math.sqrt(2.0/(x+1))
                             : x * Math.cos(x);
            second.add(y);
        }
        System.out.println(tabulationToString(first) + " - first tabulation");
        System.out.println(tabulationToString(second) + "- second tabulation");
    }

    public static String tabulationToString(List<Double> list) {
        StringBuilder sb = new StringBuilder("[");
        for (Double d: list) {
            sb.append(String.format("%.2f, ", d));
        }
        return sb.replace(sb.length() - 2, sb.length() , "]").toString();
    }
}
