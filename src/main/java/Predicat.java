
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Predicat {
    public static void main(String[] args) {
        Predicate<List<String>> predicate = Predicat::predicateFunction;
        List<String> list = new ArrayList<>();
        list.add("Vика");
        list.add( "zля");
        list.add("яtt");
        predicate.test(list);


    }



    private static boolean predicateFunction(List<String> list) {

        String regex = "^[A-Z,А-Я].*";
         Predicate<String> predicate = s -> s.matches(regex);
        boolean boolean1 = list.stream().filter(predicate).count()>=2;
        System.out.println(boolean1);
        return predicate.test(list.toString());
    }


}
