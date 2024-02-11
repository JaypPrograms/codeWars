public class Maskify {
    public static String maskify(String str) {
        StringBuilder myName = new StringBuilder(str);
        
        for(int index=0; index<str.length()-4; index++){
            myName.setCharAt(index, '#');         
        }
        
        return myName.toString();
    }
}