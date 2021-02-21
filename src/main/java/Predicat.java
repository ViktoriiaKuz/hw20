
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Predicat {
    public static void main(String[] args) {
        Predicate<Object> predicate = Predicat::predicateFunction;
        List<String> list = new ArrayList<>();
        list.add("Vика");
        list.add( "zля");
        list.add("яtt");

        for (Object o: list) {
            predicate.test(o);
        }
        boolean boolean1 = list.stream().filter(predicate).count()>=2;
        System.out.println(boolean1);

    }

    private static boolean predicateFunction(Object o) {

        String regex = "^[A-Z,А-Я].*";
         Predicate<String> predicate = s -> s.matches(regex);
        return predicate.test(o.toString());
    }


}
