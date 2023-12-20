import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filterList = new ArrayList<>(intList);
        filterList.removeIf(x -> x <= 0);
        filterList.removeIf(x -> !(x % 2 == 0));
        filterList.sort((x, y) -> x.compareTo(y));
        filterList.forEach(System.out::println);
    }
}
