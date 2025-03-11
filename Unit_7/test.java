package Unit_7;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Anaya");
        list1.add("Layla");
        list1.add("Sharrie");
        list1.set(1, "Destini");
        list1.add(1, "Sarah");
        System.out.println(list1);
    }
}
