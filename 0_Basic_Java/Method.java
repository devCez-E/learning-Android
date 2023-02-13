public class Method {
    public static void main(String[] args) {
        int plustResult = plus(100, 4323);
        System.out.println(plustResult);

        printTwice("TT");
    }

    static int plus(int x, int y){
        return x+y;
    }

    static void printTwice(String text){
        System.out.println(text);
        System.out.println(text);
    }
}
