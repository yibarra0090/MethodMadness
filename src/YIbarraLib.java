public class YIbarraLib {
    public static boolean isPalindrome(String strg) {
        for (int i = 1; i < strg.length(); i++) {
            String strg2 += strg.substring(strg.length() - i, (strg.indexOf(strg.length()) - i));
        }
        if (strg2.compareTo(strg) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
