//Sabrun Sabri 09/20/18//
package SSabri;

public class SSabriLib {
    public static boolean isPalindrome(String word){
        String newWord="";
        for(int i = word.length()-1; i>=0; i--){
            newWord += word.substring(i,i+1);
        }
        if (word.equals(newWord))
        {
            return true;
        }else{
            return false;
        }
    }

}
