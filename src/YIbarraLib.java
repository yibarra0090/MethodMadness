public class YIbarraLib {
    public static void isPalindrome(String strg){
        int len = strg.length();
        String strg2 = "";
        for (int i = 0; i < len; i++){
            strg2 = strg.substring(len-i,(len-i)+1);
        }
        if (strg.equals(strg2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}