public class App {
    public static void main(String[] args) throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        
        System.out.println(FunctionalProgramming.f.apply(jSmith));
        
    }
}
