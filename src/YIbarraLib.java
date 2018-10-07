public class YIbarraLib {
    /**
     *
     * @param strg
     */
    public static boolean isPalindrome(String strg){
        int len = strg.length();
        String strg2 = "";
        for (int i = 0; i < len; i++){
            strg2 += strg.substring((len-1)-i,(len-i));
        }
        System.out.println(strg2);
        if (strg.equals(strg2)){
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param date
     */
    public static String dateStr(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6);
        String date2 = day+""+"-"+""+month+""+"-"+year;
        return date2;
    }

    /**
     *
     * @param n
     * @return
     */
    public static int sumUpTo(int n){
     int sum = (n*(n+1))/2;
        return sum;
    }
    /**
     *
     * @param mainStr
     * @param subStr
     * @return
     */
    public static String cutOut(String mainStr, String subStr){
     int ind = mainStr.indexOf(subStr);
     mainStr = mainStr.substring(ind+subStr.length());
     return mainStr;
    }
    public static String quadSolver(Double a, Double b, Double c){
        Double det = Math.sqrt((b*b)+(-4*a*c));
        if (det < 0.0){
            return "The roots are imaginary number becase the determinant is a negative number";
        } else {
            Double x1 = (((-1*b)+det)/(2*a));
            Double x2 = (((-1*b)-det)/(2*a));
            return x1+""+" "+"and"+""+" "+x2+""+" "+"are real roots";
            }
        }
    }

