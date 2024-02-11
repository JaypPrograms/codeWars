public class Palindromes {
    public static int longestPalindrome(final String s) {

        boolean isPalindrome = false;
        int result = 0;
        for (int index = 0; index < s.length(); index++) {

            for (int index2 = index; index2 < s.length(); index2++) {
                int tempHolder = 0;
                if (s.charAt(index) == s.charAt(index2)) {

                    for (int start = index, last = index2; start <= index2; start++, last--) {

                        if (s.charAt(start) == s.charAt(last)) {
                            tempHolder++;
                            isPalindrome = true;
                        } else {
                            tempHolder = 0;
                            isPalindrome = false;
                            break;
                        }

                    }
                    if (isPalindrome) {
                        if (tempHolder > result)
                            result = tempHolder;

                    }
                }
            }
        }

        return result; // your code here
    }
}