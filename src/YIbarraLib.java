public class YIbarraLib {
    public static void isPalindrome(String strg) {
        int len = strg.length();
        String strg2 = "";
        for (int i = 0; i < len; i++) {
            strg2 = strg.substring(len - i, (len - i) + 2);
        }
        if (strg.equals(strg2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void dateStr(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6);
        String newdate = day+""+"-"+month+""+"-"+year;
        System.out.println(newdate);
    }
    public static void sumUpTo(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}