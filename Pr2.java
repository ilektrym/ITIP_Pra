import java.util.Arrays;
import java.util.Random;

public class Pr2 {
    public static boolean duplicateChars(String str) {
        str =  str.toLowerCase();
        char [] element = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            for (int m = 0; m < element.length;m++){
                if (str.charAt(i) == element[m]){
                    return true;
                }
            }
            element[i] = str.charAt(i);
        }
        return false;
    }
    public static String getInitials(String str){
        String [] nado = str.split(" ");
        return String.valueOf(nado[0].charAt(0)) + String.valueOf(nado[1].charAt(0));
    }
    public static int differenceEvenOdd(int [] a){
        int chet = 0;
        int nchet = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] %2 == 0){
                chet = chet + a[i];
            }
            else{
                nchet = nchet + a[i];
            }
        }
        return Math.abs(chet - nchet);
    }
    public static boolean equalToAvg(int [] a){
       float mid;
       float sum = 0;
       for (int i = 0; i < a.length; i++){
           sum = sum + a[i];
       }
       mid = sum / a.length;
       for (int i = 0; i < a.length; i++){
           if (a[i] == mid){
               return true;
           }
       }
       return false;
    }
    public static int [] indexMult(int [] a){
        for (int i = 0; i < a.length; i++){
            a[i] = a[i] * i;
        }
        return a;
    }
    public static String reverse(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++){
            res = String.valueOf(str.charAt(i)) + res;
        }
        return res;
    }
    public static int Tribonacci(int n) {
        if (n <= 2 ) {
            return 0;
        }
        int a = 0, b = 0, c = 1, d;
        for (int i = 4; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
    public static String pseudoHash(int length){
        char[] res = new char[length];
        String alf = "qwertyuiopasdfghjklzxcvbnm1234567890";
        Random rn = new Random();
        for (int i = 0; i < length; i++)
        {
            res[i] = alf.charAt(rn.nextInt(alf.length()));
        }
        return new String(res);
    }
    public static String botHelper(String str){
        Boolean res = false;
        str = str.replaceAll("\\pP"," ");
        String [] word = str.split(" ");
        for(int i = 0; i < word.length; i++){
            if(word[i].equalsIgnoreCase("help")){
                res = true;
            }
        }
        if (res){
            return "Calling for a staff member";
        }
        else{
            return "Keep waiting";
        }
    }
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        System.out.println("----------1-----------");
        System.out.println(duplicateChars("Donald"));
        System.out.println(duplicateChars("orange"));

        System.out.println("----------2-----------");
        System.out.println(getInitials("Ryan Gosling"));
        System.out.println(getInitials("Barack Obama"));

        System.out.println("----------3-----------");
        int [] a = {44, 32, 86, 19};
        System.out.println(differenceEvenOdd(a));
        int [] b = {22, 50, 16, 63, 31, 55};
        System.out.println(differenceEvenOdd(b));

        System.out.println("----------4-----------");
        int [] c = {1, 2, 3, 4, 5};
        System.out.println(equalToAvg(c));
        int [] d = {1, 2, 3, 4, 6};
        System.out.println(equalToAvg(d));

        System.out.println("----------5-----------");
        int [] e = {1, 2, 3};
        System.out.println(Arrays.toString(indexMult(e)));
        int [] f = {3, 3, -2, 408, 3, 31};
        System.out.println(Arrays.toString(indexMult(f)));

        System.out.println("----------6-----------");
        System.out.println(reverse("Hello World"));
        System.out.println(reverse("The quick brown fox."));

        System.out.println("----------7-----------");
        System.out.println(Tribonacci(7) );
        System.out.println(Tribonacci(11) );

        System.out.println("----------8-----------");
        System.out.println(pseudoHash(5));
        System.out.println(pseudoHash(10));
        System.out.println(pseudoHash(0));

        System.out.println("----------9-----------");
        System.out.println(botHelper("Hello, I’m under the water, please help me"));
        System.out.println(botHelper("Two pepperoni pizzas please"));

        System.out.println("----------10-----------");
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("eleven plus two", "twelve plus one"));
        System.out.println(isAnagram("hello", "world"));
    }
}