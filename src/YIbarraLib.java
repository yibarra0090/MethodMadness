public class YIbarraLib {
    /**
     *Checks if String input is a palindrome, a word, phrase, or sequence that reads the same backward as forward
     * @param strg the string that may or not be a palindrome
     * @return true if String input is a palindrome, false if not
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
     *Takes String input in the format mm/dd/yyyy and returns the String in the format dd-mm-yyyy
     * @param date String in the format mm/dd/yyyy
     * @return New String in the format dd-mm-yyyy
     */
    public static String dateStr(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6);
        String date2 = day+""+"-"+""+month+""+"-"+year;
        return date2;
    }

    /**
     * Adds together all whole numbers from 0 to int input
     * @param n Integer input, number to sum up to
     * @return Sum of the numbers from 0 to Integer Input
     */
    public static int sumUpTo(int n){
     int sum = (n*(n+1))/2;
        return sum;
    }
    /**
     * Removes the first occurrence of a subString out of another String
     * @param mainStr String where the first occurrence of subString is removed from
     * @param subStr subString that is removed at its first occurrence in String
     * @return  String without the first occurrence of subString
     */
    public static String cutOut(String mainStr, String subStr){
     int ind = mainStr.indexOf(subStr);
     mainStr = mainStr.substring(ind+subStr.length());
     return mainStr;
    }

    /**
     * Solves for the roots of any quadratic equation in the form ax^2+bx+c=0
     * @param a The Double input a, the quadratic coefficient in ax^2+bx+c=0
     * @param b The Double input b, the linear coefficient in ax^2+bx+c=0
     * @param c The Double input c, the constant in ax^2+bx+c=0
     * @return String response with the roots of the quadratic equation described as either real or imaginary roots
     */
    public static String quadSolver(Double a, Double b, Double c){
        Double det = (b*b)+(-4*a*c);
        if (det < 0.0){
            return "The roots are imaginary number because the determinant is a negative number";
        } else {
            Double x1 = (((-1 * b) + Math.sqrt(det)) / (2 * a));
            Double x2 = (((-1 * b) - Math.sqrt(det)) / (2 * a));
            return x1 + "" + " " + "and" + "" + " " + x2 + "" + " " + "are real roots";
             }
        }
    }

