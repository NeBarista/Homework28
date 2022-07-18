public class Main {
    public static void main(String[] args) {
            System.out.println(checkArg(8));
            System.out.println(checkArg(-2));
            System.out.println(checkArg(1));
            System.out.println(checkArg(0));
    }
    static int checkArg(int number1) {
        if (number1 < 0) {
            return number1 * -1;
        }
        if (number1 == 0) {
            return 0;
        }
        else  {
            return number1;
        }
    }
}