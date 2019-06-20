import java.util.stream.IntStream;

public class RandomStream {
    public static void main(String[] args) {
        pseudoRandomStream(13).limit(5).forEach(System.out::println);
    }

    private static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000);
    }
}
