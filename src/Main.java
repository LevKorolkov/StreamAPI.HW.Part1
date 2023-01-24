import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newNumbers = new ArrayList<>();

        toFilterOutList(numbers, newNumbers);
        toPrintList(newNumbers);
    }

    // This method filters the list by positive numbers and their parity
    public static void toFilterOutList(List<Integer> list, List<Integer> newList) {
        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            if (element > 0 && element % 2 == 0) {
                newList.add(element);
            }
        }
        Collections.sort(newList);
    }

    // This method prints list
    public static void toPrintList(List<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}