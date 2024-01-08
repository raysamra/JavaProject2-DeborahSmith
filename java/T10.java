import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T10 {
    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>();
        arrList.add("Steak");
        arrList.add("Turkey");
        arrList.add("Chicken");
        arrList.add("Chicken");
        arrList.add("Pork");

        System.out.println("Beginning Array List: " + arrList);

        List<String> afterList = new ArrayList<>(new HashSet<>(arrList));
        System.out.println("After Removing Duplicates: " + afterList);
    }
}
