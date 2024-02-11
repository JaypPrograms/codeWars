import java.util.function.Function;

public class FunctionalProgramming {
    public static Function<Student, Boolean> f = p-> {return  p.getFullName().equals("John Smith") ? true: false;};
}
