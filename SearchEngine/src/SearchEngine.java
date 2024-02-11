public class SearchEngine {
    static int find(String needle, String haystack){
        int number=-1;
        System.out.println(needle+" "+ haystack);
        for(int index=0; index<haystack.length() && number<0; index++){
            if(haystack.charAt(index)!=' '){
                int tempHolder=index, tempIndex=index;
                for(int index2=0; index2<needle.length() && tempIndex<haystack.length(); index2++){
                    
                    if(needle.charAt(index2)==haystack.charAt(tempIndex) 
                    || needle.charAt(index2)== '_' && (haystack.charAt(tempIndex)!=' ')){
                        tempIndex++;
                        if(index2+1==needle.length()){
                            number=tempHolder;
                            System.out.println("done");
                            System.out.println(number);
                        }
                    }
                    else break;
                }
            }
        }


        return number;
    }
}
