import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacters {
    String str = "test code cleanup";
    ArrayList<String> arrList = new ArrayList<>();

    public static void main(String[] args) {
        Map<Character, Long> count = countDuplicateCharacters("this is vishnu vishnu");
        System.out.println("count is --" + count);
    }


    public static Map<Character, Long> countDuplicateCharacters(String str) {
        Map<Character, Long> result = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }


   /*public static Map<Character, Integer> countDuplicateCharacters( String str) {

       Map<Character, Integer> result = new HashMap<>();

       // or use for(char ch: str.toCharArray()) { ... }
       for (int i = 0; i<str.length(); i++) {
           char ch = str.charAt(i);

        result.compute(ch,(k,v)->(v==null)?1:v++)
        //  result.compute(ch,(k,v)->(v==null) ? 1 : v++)
       }

       return result;
   }*/
}
