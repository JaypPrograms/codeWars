public class App {
    public static void main(String[] args) throws Exception {
        
        Rotator rotator=new Rotator();

        Object number[]=rotator.rotate(new Object[]{1,2,3,4,5}, 2);

        for(Object n: number){
            System.out.println(n);
        }

    }
}
