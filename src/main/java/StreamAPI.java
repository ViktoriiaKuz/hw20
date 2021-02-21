import java.util.Arrays;
import java.util.List;


public class StreamAPI {

    public static void main(String[] args) {
        filterNumbers();

    }

    public static void filterNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map((x) -> x * x)
                .filter((n) -> n % 2 != 1)
                .forEach(System.out::println);
    }
}


