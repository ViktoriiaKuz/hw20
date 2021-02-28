import Utils.MathOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import static Utils.MathOperation.*;

public class Main {
    public static void main(String[] args) {

        Map<MathOperation,BiFunction<Integer,Integer,Integer>> map = new HashMap<>();


        BiFunction<Integer, Integer, Integer> functionPlus = Integer::sum;
        BiFunction<Integer, Integer, Integer> functionMinus = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> functionDivide = (a, b) -> a / b;
        BiFunction<Integer, Integer, Integer> functionMultiply = (a, b) -> a * b;

        map.put(PLUS,functionPlus);
        System.out.println(functionPlus.apply(3, 3));

        map.put(MINUS,functionMinus);
        System.out.println(functionMinus.apply(3, 3));

        map.put(DIVIDE, functionDivide);
        System.out.println(functionDivide.apply(3, 3));

        map.put(MULTIPLY, functionMultiply);
        System.out.println(functionMultiply.apply(3, 3));


    }
}
