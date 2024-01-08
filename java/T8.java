import java.util.ArrayList;
import java.util.List;

public class T8 {
    public static List<String> filter(List<String> strList) {
        List<String> arr = new ArrayList<>();

        for (String str : strList) {
            if (str.startsWith("A") || str.startsWith("a")) {
                arr.add(str.toLowerCase());
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("arrow"); list.add("Apple"); list.add("black");
        list.add("Dragon"); list.add("Amethyst"); list.add("array");

        List<String> filtered = filter(list);

        System.out.println("Strings Starting with 'A' in Lower Case: " + filtered);
    }
}
