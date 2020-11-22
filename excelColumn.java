// "static void main" must be defined in a public class.
// leetcode playground
// first mock interview question...that I would never forget
public class Main {
    public static void main(String[] args) {
        System.out.print(intToString(54));
    }
    
    public static String intToString(int n){
        String s = "";
        char c = 'A';
        int last = n % 26;
        int remainder = n / 26;
        //54 -> 28 -> 2 AAC
        for(int i=0; i<remainder; i++){
            s+="A";
        }
        c += last;
        return s+c;
    }
}