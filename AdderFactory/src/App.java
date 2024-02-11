import java.util.function.IntUnaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        IntUnaryOperator f=AdderFactory.create(-1);

        System.out.println(f.applyAsInt(2));
    }
} cute
