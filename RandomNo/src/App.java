import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        while(true){
            printMenu();
            switch(s.nextInt()){
                case 1: beginGame();
                        break;
                case 2: System.exit(0);
                        break;
                default: System.out.println("Please Enter your choice again.");
                s.close();
            }
        }
        }

    public static void printMenu(){
        System.out.println();
        System.out.printf("%d : %s%n".repeat(2),1,"Start", 2, "Exit");
        System.out.println("Enter your choice : ");
    }

    public static int generateRandomNo(){
        Random r = new Random();
        return r.nextInt(100)+1;
    }
    public static void beginGame(){
        Scanner s = new Scanner(System.in);
        System.out.println("Random no is generated....\n");
        int generatedValue = generateRandomNo(), gussedValue;
        for (int i = 1; i<6; i++ ){
        System.out.printf("Please enter your guess(trys available : %d) : ", 5-i);
            gussedValue = s.nextInt();
            if(gussedValue == generatedValue){
                System.out.println("\nYou have entered correct value. ");
                return;
            }
            else if(gussedValue > generatedValue){
                System.out.println("\nYour guess is incorrect.\nYour provided value is greater than the expected no.");
            }
            else {
                System.out.println("\nYour guess is incorrect.\nYour provided value is less than the expected no.");
        }
    }
        System.out.printf("You have entered too many incorrect gusses... %nThe correct guess was : %d", generatedValue);
    }
}
