public class Conditional {
    public static void main(String[] args) {
        boolean isCar = false;
        boolean isHaveHosue = false;
        boolean isGoldSpoon = false;
        boolean isJob = false;

        int asset = 17000;

        int grade = isCarMarriage(isCar, isHaveHosue, isGoldSpoon, isJob, asset);
        System.out.print(grade);
    }

    static int isCarMarriage(boolean isCar, boolean isHaveHosue, boolean isGoldSpoon, boolean isJob, int asset){        
        if(isGoldSpoon) return 1;
        else if (isHaveHosue) return 2;
        else if(isCar) return 3;
        else if(isJob) return 4;
        else {
            if (asset > 10000) return 5;
            else return 6;
        }
    }
}
