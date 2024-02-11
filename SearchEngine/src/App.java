import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String input = "abc.\\Qdef";

        // Using \\E.\\Q to match ".\\Q"
        String pattern = "\\E.\\Q";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        while (matcher.find()) {
            System.out.println("Found match at index: " + matcher.start());
        }
    }
 
        
        // System.out.println(SearchEngine.find("google_", "googgoogleggggoooglxeplexhexflexmexkex"));
    }

