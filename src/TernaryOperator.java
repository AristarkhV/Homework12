import java.util.function.Function;
import java.util.function.Predicate;

public class TernaryOperator {
    private static Function<String, Integer> ternaryOperator(
            Predicate<Object> condition,
            Function<Object, Integer> ifTrue,
            Function<CharSequence, Integer> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
}
