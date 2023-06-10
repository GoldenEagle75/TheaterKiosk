import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        System.out.print("How old are you? ");
        if (in.hasNextInt()){
            age = in.nextInt();
            if (age >= 21){
                System.out.println("You get a wristband.");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("Enter a valid age, not " + trash + ".");
        }
    }
}