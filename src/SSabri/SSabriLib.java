//Sabrun Sabri 09/20/18//
package SSabri;

public class SSabriLib {
    /**
     * Function that checks to see if the input is a palindrome and returns the corresponding boolean.
     * @param word Any string.
     * @return True or False based on if the input word is a palindrome.
     */
    public static boolean isPalindrome(String word){
        String newWord="";
        for(int n = word.length()-1; n>=0; n--){
            newWord += word.substring(n,n+1);
        }
        if (word.equals(newWord))
        {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Function that changes date format from “mm/dd/yyyy” to “dd – mm - yyyy”
     * @param date Any input in the form of: “mm/dd/yyyy”.
     * @return Returns date in the form of:  “dd – mm - yyyy”.
     */
    public static String dateStr(String date)
    {
        String dateMonth = date.substring(0,date.indexOf("/"));
        String dateFragment = date.substring(date.indexOf("/")+1);

        String dateDay =  dateFragment.substring(0,dateFragment.indexOf("/"));
        dateFragment = dateFragment.substring(date.indexOf("/")+1);

        String dateYear = dateFragment;

        return(dateDay+" - " + dateMonth+" - " + dateYear);
    }


    /**
     * Function that removes from the first string inputted the first occurence of the second one.
     * @param mainStr The String that you want to remove something from.
     * @param subStr The String that is going to be removed.
     * @return Returns mainStr with the first occurence of subStr removed.
     */
    public static String cutOut(String mainStr,String subStr)
    {
        if (mainStr.indexOf(subStr) == -1)
        {
            return mainStr;
        } else {
            if (mainStr.indexOf(subStr)== 0)
            {
                return mainStr.substring(subStr.length());
            } else
            {
                return mainStr.substring(0,mainStr.indexOf(subStr) ) + mainStr.substring(mainStr.indexOf(subStr) + subStr.length());
            }
        }
    }

    /**
     * Prints a multiplication table from 0 - range, where the base is the input base.
     * @param base Any integer, is multiplied by every number from 0 - range.
     * @param range Any integer, every number from 0 to the input is multiplied by the base.
     */
    public static void multiplicationTable(int base, int range)
    {
        String printedTable = "";
        for (int n = 0; n <= range; n++)
        {
            printedTable += String.valueOf(base) + "*" + String.valueOf(n) + "=" + String.valueOf(base*n) + ", ";
        }
        System.out.println(printedTable);
    }

    /**
     * Function that returns the total of all numbers from 0-num.
     * @param num Any integer,  function will add up to this number.
     * @return Returns the total sum of all numbers from 0-num.
     */
    public static int sumUpTo(int num)
    {
        int totalSum = (num*(num+1))/2;
        return  totalSum;
    }





}
