public class Pr1 {
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));

        System.out.println("      ");

        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));

        System.out.println("      ");

        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));

        System.out.println("      ");

        System.out.println(triangleType(5,5,5));
        System.out.println(triangleType(5,4,5));
        System.out.println(triangleType(3,4,5));
        System.out.println(triangleType(5,1,1));

        System.out.println("      ");

        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));

        System.out.println("      ");

        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));

        System.out.println("      ");

        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));

        System.out.println("      ");

        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        
        System.out.println("      ");

        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));

        System.out.println("      ");

        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }

    public static float convert(int x) {
        return x * 3.785f;
    }

    public static int fitCalc(int a, int b) {
        return a * b;     
    }

    public static int containers(int a, int b, int c) {
        return a*20 + b*50 + c*100;
    }
    
    public static String triangleType(int a, int b, int c) {
        if (((a + b) <= c) || ((a + c) <= b) || ((c + b) <= a)) {
            return "not a triangle";
        }
        if (a == b && a == c && b == c){
            return "equilateral";
        }
        else if (a == b || a == c  ){
            return "isosceles";
        }
        else  {
            return "different-sided";
        }
    }
    
    public static int ternaryEvaluation(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int howManyItems(double a, double b, double c) {
        return (int)((a / 2) / (b * c));
    }

    public static int factorial(int x) {
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res = res * i;
        }
        return res;
    }   

    public static int gcd(int a, int b) {
        int res = 0;
        for ( int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
        }
        return res;
    }

    public static int ticketSaler(int a, int b) {
        return (int)(a * b * 0.72f);
    }

    public static int tables(int a, int b) {

        float stol = (a / 2);
        if (stol < b) {
            return 0;
        }
        else {
            return (int)(stol - b) + 1;
        }
    }
}
