import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncSample{
      public static void main(String[] args){
            Predicate<Integer> predicate = x -> x % 2 == 0;
            Function <Integer, Integer> function = x -> x * x;
            Consumer <Integer> consumer = x -> System.out.println(x);
            Supplier <Integer> supplier = () -> 100;
            // System.out.println(predicate.test(4));

            if(predicate.test(supplier.get())){
                  consumer.accept(function.apply(supplier.get()));
            }

            List <String> list = Arrays.asList("A", "B", "C", "D");
            list.forEach(System.out::println);
      }
}