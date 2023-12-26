import java.util.*;

public class Pr3 {
    public static String replaceVowels(String str) {
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                str = str.replace(str.charAt(i), '*');
            }
        }
        return str;
    }
    public static String stringTransform(String string) {
        String res = "";
        int i = 0;
        while (i < string.length()) {
            if (i < string.length() - 1 && string.charAt(i) == string.charAt(i+1)) {
                res +=  "Double" + string.toUpperCase().charAt(i);
                i += 2;
            } 
            else {
                res += string.charAt(i);
                i++;
            }
        }
        return res;
    }
    public static boolean doesBlockFit(int a, int b, int c, int w, int h) { 
        Integer[] sides = {a, b, c};            
        Arrays.sort(sides, Comparator.naturalOrder());         
        return (sides[0] <= w && sides[1] <=h) || (sides[0] <= h && sides[1] <=w);     
    }
    public static boolean numCheck(int a){    
        int sum=0, b = a;
        while(a > 0){        
            sum += a%10 * a%10;
            a = a / 10;    
        }
        return b%2 == sum % 2;
    }
    public static int countRoots(int[] a){
        double dic = a[1] * a[1] - 4* a[0] * a[2];
        double cor = Math.sqrt(dic);
        int res = 0;
        if(dic > 0){
            if (((-a[1] + cor)/(2*a[0])) % 1 == 0) {
                res += 1;
            }
            if (((-a[1] - cor)/(2*a[0])) % 1 == 0) {
                res += 1;
            }
            return res;
        }
        else if(dic == 0){
            if (((-a[1])/(2*a[0])) % 1 == 0) {
                res += 1;
            }
            return res;
        }
        else {
            return 0;
        }
    }
    public static List <String> salesData(String[][] data){    
        List <String> res = new ArrayList<>(); 
        List <String> shop = new ArrayList<>();    
        for(int i = 0; i < data.length; i++){ 
            for(int j = 1; j < data[i].length; j++){            
                if( !shop.contains(data[i][j])){ 
                    shop.add(data[i][j]);            
                } 
            }    
        } 
        for(int i = 0; i < data.length; i++){        
            if(data[i].length - 1 == shop.size()){ 
                res.add(data[i][0]);        
            } 
        }    
        return res; 
    }
    public static boolean validSplit(String str){
        str = str.replaceAll(","," ");
        str = str.replaceAll("\\."," ");
        String [] word = str.split(" ");
        char [][] word_ch = new char[word.length][];
        for(int i = 0; i < word.length; i++){
            word_ch[i] = word[i].toCharArray();
        }
        for(int i = 0; i < word_ch.length - 1; i++){
            if(word_ch[i][word_ch[i].length-1] != word_ch[i+1][0]){
                return false;
            }
        }
        return true;
    }
    public static boolean waveForm(int[] arr) {
        boolean res = false;
        for (int i = 1; i < arr.length - 1; i++) {
            if (((arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) || (arr[i] < arr[i + 1] && arr[i] < arr[i - 1])) ) {
                res = true;
            } 
            else  {
                return false;
            }
        }
        return res;
    }
    public static  String commonVovel(String str){
        str = str.toLowerCase();
        String vow = "aoeiuy", result = "";
        HashMap<Character, Integer> col = new HashMap<>();
        for(int i =0; i < vow.length(); i++){
            col.put(vow.charAt(i), 0);
        }
        for(int i = 0; i < str.length(); i++){
            for(Map.Entry<Character, Integer> entry : col.entrySet()){
                if(entry.getKey() == str.charAt(i)){
                    col.put(entry.getKey(), entry.getValue() + 1);
                }
            }
        }
        int maxValue = 0;
        for (Map.Entry<Character, Integer> entry : col.entrySet()) {
            int key = entry.getValue();
            if (key > maxValue) {
                maxValue = key;
            }
        }
        for (Map.Entry<Character, Integer> entry : col.entrySet()) {
            int value = entry.getValue();
            if ( value == maxValue) {
                result += entry.getKey();
            }
        }
        return result;
    }
    public static int[][] dataScience(int [][] data){
        for(int i = 0; i < data.length; i++){
            int midl;
            double sum = 0;
            for(int j = 0; j < data.length; j++){
                if(j != i){
                    sum += data[j][i];
                }
            }
            midl = (int) Math.round(sum / (data.length - 1));
            data[i][i] = midl;
        }
        return data;
    }
    public static void main(String[] args) {
        System.out.println("---------1---------");
        System.out.println(replaceVowels("apple"));
        System.out.println(replaceVowels("Even if you did this task not by yourself, you have to understand every single line of code."));

        System.out.println("---------2---------");
        System.out.println(stringTransform("hello"));
        System.out.println(stringTransform("bookkeeper"));

        System.out.println("---------3---------");
        System.out.println(doesBlockFit(1, 3, 5, 4, 5));
        System.out.println(doesBlockFit(1, 8, 1, 1, 1));
        System.out.println(doesBlockFit(1, 2, 2, 1, 1));

        System.out.println("---------4---------");
        System.out.println(numCheck(243));
        System.out.println(numCheck(52));

        System.out.println("---------5---------");
        int[] a = {1, -3, 2};
        System.out.println(countRoots(a));
        int[] b = {2, 5, 2};
        System.out.println(countRoots(b));
        int[] c = {1, -6, 9};
        System.out.println(countRoots(c));

        System.out.println("---------6---------");
        String[][] d = {{"Apple", "Shop1", "Shop2", "Shop3", "Shop4"},
                        {"Banana", "Shop2", "Shop3", "Shop4"},
                        {"Orange", "Shop1", "Shop3", "Shop4"},
                        {"Pear", "Shop2", "Shop4"}};
        System.out.println(salesData(d));
        String[][] e = {{"Fridge", "Shop2", "Shop3"},
                {"Microwave", "Shop1", "Shop2", "Shop3", "Shop4"},
                {"Laptop", "Shop3", "Shop4"},
                {"Phone", "Shop1", "Shop2", "Shop3", "Shop4"}};
        System.out.println(salesData(e));

        System.out.println("---------7---------");
        System.out.println(validSplit("apple eagle egg goat"));
        System.out.println(validSplit("cat dog goose fish"));

        System.out.println("---------8---------");
        int [] f = {3, 1, 4, 2, 7, 5};
        System.out.println(waveForm(f));
        int [] g = {1, 2, 3, 4, 5};
        System.out.println(waveForm(g));
        int [] h = {1, 2, -6, -10, 3};
        System.out.println(waveForm(h));

        System.out.println("---------9---------");
        System.out.println(commonVovel("Hello world"));
        System.out.println(commonVovel("Actions speak louder than words"));

        System.out.println("---------10---------");
        int[][] i = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {5, 5, 5, 5, 5},
                {7, 4, 3, 14, 2},
                {1, 0, 11, 10, 1}
        };
        System.out.println(Arrays.deepToString(dataScience(i)));
        int[][] j  = {
                {6, 4, 19, 0, 0},
                {81, 25, 3, 1, 17},
                {48, 12, 60, 32, 14},
                {91, 47, 16, 65, 217},
                {5, 73, 0, 4, 21}
        };
        System.out.println(Arrays.deepToString(dataScience(j)));
    }
}