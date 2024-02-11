import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {
    public static ToDoubleFunction<Triangle > f= T-> { 
        T.setArea(.5*T.height*T.base);
        return T.getArea();
    };
}
