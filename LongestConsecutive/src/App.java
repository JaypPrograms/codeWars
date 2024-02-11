import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol= new Solution();
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();

        list2.add(2);




    HashMap<List<Integer>, List<Integer>> capitalCities = new HashMap<List<Integer>, List<Integer>>();
    capitalCities.put(list1, list2);
    System.out.println(capitalCities.get(list1));


        // System.out.println(sol.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        // System.out.println(sol.longestConsecutive(new int[]{1,2,0,1}));
        // System.out.println(sol.longestConsecutive(new int[]{}));
    }
}
