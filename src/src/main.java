import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int A, X;
        A = readNumber("A");
        X = readNumber("X");
        iterate(A, 0, X);
        iterate(A+1, X+1, 2*X);
        iterate(A+2, 2*X+1, 3*X);
    }

    private static int readNumber(String value){
        Scanner sc = new Scanner(System.in);
        int number;
        while(true)
        {
            try {
                System.out.println("Input value for " + value + ":");
                number = Integer.parseInt(sc.next());
                break;
            }
            catch(NumberFormatException e) {
                System.out.println("Not a valid number!");
            }
        }
        return number;
    }

    private static void iterate(int increment, int low, int high){
        for(int i = low; i <= high; i += 1)
            if(i % increment == 0)
                System.out.print(i + " ");
    }
}
