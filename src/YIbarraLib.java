public class YIbarraLib {
    /**
     *
     * @param strg
     */
    public static void isPalindrome(String strg){
        int len = strg.length();
        String strg2 = "";
        for (int i = 0; i < len; i++){
            strg2 += strg.substring((len-1)-i,(len-i));
        }
        System.out.println(strg2);
        if (strg.equals(strg2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     *
     * @param date
     */
    public static void dateStr(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6);
        String date2 = day+""+"-"+""+month+""+"-"+year;
        System.out.println(date2);
    }

}