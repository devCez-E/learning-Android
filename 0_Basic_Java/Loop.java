public class Loop {
    public static void main(String[] args) {
        String[] names = new String[11];
        
        names[0]="Kim";
        names[1]="Lee";
        names[2]="Park";
        names[3]="Choi";
        names[4]="Jung";
        names[5]="Kang";
        names[6]="Cho";
        names[7]="Yun";
        names[8]="Jang";
        names[9]="Lim";
        names[10]="Han";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        int i = 0;

        while(i< names.length){
            System.out.println(names[i]);
            i++;
        }
    }
}
