import java.util.*;
import java.util.function.BiFunction;


public class Main {
    public static void main(String[] args) {

        Map<MathOperation,BiFunction<Integer,Integer,Integer>> map = new HashMap<>();

        MathOperation plus = MathOperation.PLUS;
        MathOperation minus = MathOperation.MINUS;
        MathOperation divide = MathOperation.DIVIDE;
        MathOperation multiply = MathOperation.MULTIPLY;


        BiFunction<Integer, Integer, Integer> functionPlus = Integer::sum;
        BiFunction<Integer, Integer, Integer> functionMinus = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> functionDivide = (a, b) -> a / b;
        BiFunction<Integer, Integer, Integer> functionMultiply = (a, b) -> a * b;

        map.put(plus,functionPlus);
        System.out.println(functionPlus.apply(3, 3));

        map.put(minus,functionMinus);
        System.out.println(functionMinus.apply(3, 3));

        map.put(divide, functionDivide);
        System.out.println(functionDivide.apply(3, 3));

        map.put(multiply, functionMultiply);
        System.out.println(functionMultiply.apply(3, 3));


    }
}
